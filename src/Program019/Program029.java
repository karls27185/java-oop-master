package Program019;

import java.io.File;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class Program029 {
    public static void main(String[] args) {
/*
        // Home directory: `$HOME` or `%HOMEPATH%` Определение домашней директории пользователя
        System.out.println(System.getProperty("user.home"));

        // New line separator: `\n` or `\r\n` Определение какой разделитель используется для новой строки
        System.out.println(System.lineSeparator());

        // Path element separator: `/` or `\` Определение какой разделитель используется в относительном или абсолютном пути
        System.out.println(File.pathSeparator);

        // Absolute or relative paths separator: `:` or `;` Определение какой разделитель используется в перечислении
        System.out.println(File.separator);

        // Read environment variable with name `USERNAME` Для считывание информации из определенной переменной окружения
        System.out.println(System.getenv("USERNAME"));
*/
        String home;
        home = (System.getProperty("user.home"));
        System.out.println("System.getProperty(\"user.home\")" + " " + home);

        String lineSeparator;
        lineSeparator = System.lineSeparator();
        System.out.println("System.lineSeparator()" + " " + lineSeparator);

        String pathSeparator;
        pathSeparator = (File.pathSeparator);
        System.out.println("File.pathSeparator" + " " + pathSeparator);

        String separator;
        separator = (File.separator);
        System.out.println("File.separator" + " " + separator);

        String USERNAME;
        USERNAME = (System.getenv("USERNAME"));
        System.out.println("System.getenv(\"USERNAME\")" + " " + USERNAME);
    }
}
