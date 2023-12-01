package com.bridgelabz.moodanalyser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @desc : Test Class for MoodAnalyser Class
 */
class MoodAnalyserTest {
    private static MoodAnalyser moodAnalyser;
    /**
     * @desc : Initialized moodAnalyser object
     */
    @BeforeAll
    static void setUp() {
        moodAnalyser = new MoodAnalyser();
    }

    /**
     * @desc : Test Class for analyseMood Method
     */
    @Test
    void analyseMoodTest() {
        assertEquals("SAD" , moodAnalyser.analyseMood("I am in Sad Mood"));
        assertEquals("HAPPY" , moodAnalyser.analyseMood("I am in Any Mood"));
    }
}