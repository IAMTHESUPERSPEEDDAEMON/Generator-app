package app;

import app.PasswordGenerator;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        System.out.println(passwordGenerator.generatePassword(8));
    }

}
