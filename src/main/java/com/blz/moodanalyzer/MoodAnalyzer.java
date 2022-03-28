package com.blz.moodanalyzer;

public class MoodAnalyzer {

    public String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws InvalidMoodException {
        try {
            if (this.message.isEmpty())
                throw new InvalidMoodException("Please Enter valid mood", InvalidMoodException.ExceptionType.EMPTY);
            else if (this.message.contains("SAD"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            throw new InvalidMoodException("Please Enter valid mood", InvalidMoodException.ExceptionType.NULL);
        }
    }
}

