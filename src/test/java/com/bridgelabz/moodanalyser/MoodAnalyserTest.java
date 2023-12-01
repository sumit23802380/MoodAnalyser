package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    public static MoodAnalyser moodAnalyser;
    @BeforeAll
    static void setUp() {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    void analyseMoodTest() {
        assertEquals("SAD" , moodAnalyser.analyseMood("I am in Sad Mood"));
        assertEquals("HAPPY" , moodAnalyser.analyseMood("I am in Any Mood"));
    }
}