package com.bridgelabz.moodanalyser;
/**
 * @desc : Enum contains two type of message whether error is null or empty and invalid
 */
public enum MoodAnalysisError {
    NULL_MESSAGE("Message is null"),
    EMPTY_INVALID_MESSAGE("Message is empty or invalid mood");
    public final String errorMessage;
    /**
     * @desc : Constructor to set the error message
     */
    MoodAnalysisError(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
