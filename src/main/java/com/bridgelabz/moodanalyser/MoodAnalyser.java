package com.bridgelabz.moodanalyser;
/**
 * @desc : MoodAnalyser Class analyses the mood according to message
 */
public class MoodAnalyser {
    /**
     * @desc : MoodAnalyser Class Constructor
     */
    public MoodAnalyser(){

    }
    /**
     * @desc : method to analyse according to word contained by message
     * @params : message type of String
     * @return : type of mood happy or sad
     */
    public String analyseMood(String message){
        String[] wordsInMessage = message.toLowerCase().split(" ");
        for(String word : wordsInMessage){
            if(word.equals("sad")){
                return "SAD";
            }
        }
        return "HAPPY";
    }
}
