package com.tnsif.assignment2;

public class Example {
    public static void main(String[] args) {
        // Sample input string
        String input = "Harish:2:2:2";

        // Split the input using colon as the delimiter
        String[] details = input.split(":");

        // Display the individual parts
        for (String detail : details) {
            System.out.println(detail);
        }
    }
}
