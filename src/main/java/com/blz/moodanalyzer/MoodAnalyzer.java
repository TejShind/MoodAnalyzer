package com.blz.moodanalyzer;

public class MoodAnalyzer {
    public String analyzeMood(String msg) {
        if (msg.toLowerCase().contains("sad"))
            return "sad";
        return "Happy";
    }
}
