package org.generator;

import java.util.Random;

public class PasswordGenerator {
    protected char[] getPassword(int len) {
        String capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_char = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%*_=+-/.?)";

        String values = capital_char + small_char + numbers + symbols;
        Random random = new Random();
        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }

        System.out.println("Your password is:");
        return password;
    }
}
