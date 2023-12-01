package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public MoodAnalyser(){

    }
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
