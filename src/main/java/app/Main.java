package app;

import org.example.PasswordGenerator;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        System.out.println(passwordGenerator.generatePassword(8));
    }

}
