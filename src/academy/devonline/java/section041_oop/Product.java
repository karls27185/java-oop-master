package academy.devonline.java.section041_oop;

import java.math.BigDecimal;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class Product {

    public String name;

    public String description;

    public BigDecimal price;

    public BigDecimal getPrice(){
        if(isNowWeekend()){
            return price.multiply(new BigDecimal("1.15"));
        } else {
            return price;
        }
    }

    private boolean isNowWeekend() {
        return false;
    }
}
