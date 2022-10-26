package academy.devonline.java.section041_oop;

import java.math.BigDecimal;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public class ClassAsDataStructure {

    private static class Product1{

        public String name;

        public BigDecimal price;

        public boolean active;
    }

    private static class Product2{

        private String name;

        private BigDecimal price;

        private boolean active;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
    }
}
