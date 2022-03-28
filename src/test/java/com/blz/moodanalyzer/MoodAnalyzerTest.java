package com.blz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    //exception should be handled and return Sad
    @Test
    public void givenSadMood_ShouldReturnSad() throws InvalidMoodException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "sad";
        Assert.assertEquals(expected, actual);

    }

    //exception should be handled and return Happy
    @Test
    public void givenAnyMood_ShouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }

    //exception handled by using Custom Exception using ENUM.
    @Test
    public void givenInvalidMoodEmptyShouldThrowCustomException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyzeMood();
        } catch (InvalidMoodException exception) {
            InvalidMoodException.ExceptionType expected = InvalidMoodException.ExceptionType.EMPTY;
            Assert.assertEquals(expected, exception.exceptionType);
        }
    }
    //exception handled by Custom Exception using ENUM.

    @Test
    public void givenNullMood_ShouldThrowInvalidMoodException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyzeMood();
        } catch (InvalidMoodException exception) {
            InvalidMoodException.ExceptionType expected = InvalidMoodException.ExceptionType.NULL;
            Assert.assertEquals(expected, exception.exceptionType);
        }
    }
}

