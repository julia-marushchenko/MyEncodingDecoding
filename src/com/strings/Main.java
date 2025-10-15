// Java program to encode and decode text with UTF_8

package com.strings;

import java.nio.charset.StandardCharsets;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating string to encode
        String str = "New string";

        // Printing new string to console
        System.out.println("Original string: " + str);

        // Encoding string
        byte encodedString [] = str.getBytes(StandardCharsets.UTF_8);

        // Printing encoded string to console
        System.out.print("Encoded string: ");
        for (int index = 0; index < encodedString.length; index++) {
            System.out.print(encodedString [index]);
        }

        // Decoding string
        String decodedString = new String(encodedString, StandardCharsets.UTF_8);

        // Printing decodedString to console
        System.out.print("\nDecoded string: " + decodedString);
    }
}