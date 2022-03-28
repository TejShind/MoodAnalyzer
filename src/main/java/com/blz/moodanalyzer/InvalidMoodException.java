package com.blz.moodanalyzer;

public class InvalidMoodException extends Exception {

    public String message;

    InvalidMoodException(String message) {
        this.message = message;
    }
}