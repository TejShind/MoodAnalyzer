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
            if (this.message.toLowerCase().contains("sad"))
                return "sad";
            return "happy";
        } catch (NullPointerException exception) {
            throw new InvalidMoodException("Null mood");

        }
    }
}
