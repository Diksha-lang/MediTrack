package com.airtribe.meditrack.util;

import com.airtribe.meditrack.exception.InvalidDataException;

public class Validator {

    public static void validateName(String name) throws InvalidDataException {
        if (name == null || name.length() < 2) {
            throw new InvalidDataException("Name must be at least 2 characters");
        }
    }

    public static void validateAge(int age) throws InvalidDataException {
        if (age <= 0) {
            throw new InvalidDataException("Invalid age");
        }
    }
}