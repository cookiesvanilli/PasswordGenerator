package org.generator;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        int length = 10;

        System.out.println(passwordGenerator.getPassword(length));
    }
}