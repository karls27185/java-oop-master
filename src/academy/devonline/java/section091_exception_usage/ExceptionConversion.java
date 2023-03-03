package academy.devonline.java.section091_exception_usage;

import java.io.IOException;
import java.nio.file.*;
import java.sql.*;
import java.util.Arrays;

import static java.sql.DriverManager.getConnection;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class ExceptionConversion {
    public static void main(final String[] args) {
        final ConfigProvider[] providers = {
                new FileConfigProvider(),
                new RelationDatabaseConfigProvider()};
        int configValue = 24;
        boolean success = false;
        CantReadConfigValueException aggregateException = null;
        for (final ConfigProvider provider : providers) {
            try {
                configValue = provider.getConfigValue();
                success = true;
                break;
            } catch (final CantReadConfigValueException exception) {
                if (aggregateException == null) {
                    aggregateException = new CantReadConfigValueException(
                            "Can't read config value using the following providers: "
                                    + Arrays.toString(providers));
                }
                aggregateException.addSuppressed(exception);
            }
        }
        if (!success){
            throw aggregateException;
        }
        System.out.println(configValue);
    }

    public interface ConfigProvider {

        int getConfigValue();
    }

    public static final class CantReadConfigValueException extends RuntimeException {

        public CantReadConfigValueException(final String message) {
            super(message);
        }

        public CantReadConfigValueException(final Exception exception) {
            super(exception);
        }
    }

    public static class FileConfigProvider implements ConfigProvider {

        @Override
        public int getConfigValue() {
            try {
                return Integer.parseInt(Files.readString(Paths.get
                        (System.getProperty("user.home") + "/config-file.txt")));
            } catch (final IOException |
                           NumberFormatException exception) {
                throw new CantReadConfigValueException(exception);
            }
        }
    }

    public static class RelationDatabaseConfigProvider implements ConfigProvider {

        @Override
        public int getConfigValue() {
            try (Connection connection = getConnection
                    ("jdbc:postgresql://localhost:5432/db", "user", "password")) {
                try (Statement statement = connection.createStatement()) {
                    try (ResultSet resultSet = statement.executeQuery
                            ("SELECT config_value FROM config")) {
                        if (resultSet.next()) {
                            return resultSet.getInt("config_value");
                        } else {
                            throw new CantReadConfigValueException
                                    ("Table 'config' does not contain value for the required 'config_value' column!");
                        }
                    }
                }
            } catch (final SQLException exception) {
                throw new CantReadConfigValueException(exception);
            }
        }
    }
}
