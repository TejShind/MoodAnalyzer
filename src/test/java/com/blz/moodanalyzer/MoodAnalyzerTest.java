package com.blz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {


    @Test
    public void givenSadMood_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "sad";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void givenAnyMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }

}