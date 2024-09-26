package helpers;

import java.util.Random;

public class functions {

    // Method to generate a random email address
    public static String generateRandomEmail() {
        String characters = getAlphanumericCharacters();
        int usernameLength = 10;  // Length of the email username
        String domain = "@myemail.com";

        // Generate random username
        StringBuilder username = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < usernameLength; i++) {
            username.append(characters.charAt(random.nextInt(characters.length())));
        }

        return username.toString() + domain;
    }

    // Method to return alphanumeric characters dynamically
    private static String getAlphanumericCharacters() {
        StringBuilder sb = new StringBuilder();

        // Append lowercase letters (a-z)
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }

        // Append uppercase letters (A-Z)
        for (char c = 'A'; c <= 'Z'; c++) {
            sb.append(c);
        }

        // Append digits (0-9)
        for (char c = '0'; c <= '9'; c++) {
            sb.append(c);
        }

        return sb.toString();
    }
}