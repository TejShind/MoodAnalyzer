package com.blz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMoodHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actual = moodAnalyzer.analyzeMood("Happy Mood");
        String expected = "Happy";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void givenMoodSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actual = moodAnalyzer.analyzeMood("sad Mood");
        String expected = "sad";
        Assert.assertEquals(expected, actual);

    }
}