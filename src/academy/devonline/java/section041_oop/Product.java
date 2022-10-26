package academy.devonline.java.section041_oop;

import java.math.BigDecimal;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class Product {

    private String name;

    private String description;

    private BigDecimal price;

    public Product(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }

    public void setDescription(String description) {
        if (!description.isBlank()) {
            this.description = description;
        }
    }

//    public void setPrice(BigDecimal price) {
//        if (price.compareTo(BigDecimal.ZERO) > 0) {
//            this.price = price;
//        }
//    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public BigDecimal getPrice() {
        if (isNowWeekend()) {
            return price.multiply(new BigDecimal("1.15"));
        } else {
            return price;
        }
    }

    private boolean isNowWeekend() {
        return false;
    }
}
