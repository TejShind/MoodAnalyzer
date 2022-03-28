package com.blz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {


    @Test
    public void givenSadMood_ShouldReturnSad() throws InvalidMoodException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "sad";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void givenAnyMood_ShouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String actual = moodAnalyzer.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenNullMood_ShouldThrowInvalidMoodException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyzeMood();
        } catch (InvalidMoodException exception) {
            System.out.println("Catch block execute");
            String expected = "Null mood";
            Assert.assertEquals(expected, exception.message);
        } catch (Exception e) {
            System.out.println();
        }
    }
}
