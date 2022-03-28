package com.blz.moodanalyzer;

public class InvalidMoodException extends Exception {

    public String message;
    public ExceptionType exceptionType;

    InvalidMoodException(String message, ExceptionType exceptionType) {
        this.message = message;
        this.exceptionType = exceptionType;
    }

    public enum ExceptionType {
        NULL, EMPTY;
    }

}