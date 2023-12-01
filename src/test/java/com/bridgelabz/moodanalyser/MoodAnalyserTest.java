package com.bridgelabz.moodanalyser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @desc : Test Class for MoodAnalyser Class
 */
class MoodAnalyserTest {
    private static MoodAnalyser moodAnalyser1;
    private static MoodAnalyser moodAnalyser2;
    /**
     * @desc : Initialized moodAnalyser1 and moodAnalyser2 object
     */
    @BeforeAll
    static void setUp() {
        moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        moodAnalyser2 = new MoodAnalyser("I am in Happy Mood");
    }

    /**
     * @desc : Test Class for analyseMood Method
     */
    @Test
    void analyseMoodTest() {
        assertEquals("SAD" , moodAnalyser1.analyseMood());
        assertEquals("HAPPY" , moodAnalyser2.analyseMood());
    }
}