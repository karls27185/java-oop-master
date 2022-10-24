package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.VerificationCodeGenerator;

import java.util.Random;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public final class DefaultNumberVerificationCodeGenerator implements VerificationCodeGenerator {

    private Random random =new Random();

    private int length;

    public DefaultNumberVerificationCodeGenerator(int length) {
        this.length = length;
    }

    public DefaultNumberVerificationCodeGenerator() {
        this(20);
    }

    @Override
    public String generate() {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < length; i++) {
          stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }
}
