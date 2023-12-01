package com.bridgelabz.moodanalyser;
/**
 * @desc : Mood analysis exception class that extends runtime exception
 */
public class MoodAnalysisException extends RuntimeException{
    /**
     * @desc : Constructor to initialize the error
     * @params : error which is of enum MoodAnalysisErro
     */
    public MoodAnalysisException(MoodAnalysisError error){
        super(error.errorMessage);
    }
}
