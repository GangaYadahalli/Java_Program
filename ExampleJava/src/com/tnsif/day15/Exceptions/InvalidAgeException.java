package com.tnsif.day15.Exceptions;


public class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("Invalid age.");
    }

    InvalidAgeException(String message) {
        super(message);
    }
}