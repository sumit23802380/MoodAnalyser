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
     * @desc : Initialized moodAnalyser
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
        // Tests if message is null or empty
        assertEquals("HAPPY" , moodAnalyser.analyseMood());

        // Tests if message contains sad
        moodAnalyser.setMessage("I am in Sad Mood");
        assertEquals("SAD" , moodAnalyser.analyseMood());

        // Tests if message contains happy
        moodAnalyser.setMessage("I am in Happy Mood");
        assertEquals("HAPPY" , moodAnalyser.analyseMood());
    }
}