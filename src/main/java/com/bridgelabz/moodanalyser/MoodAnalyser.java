package com.bridgelabz.moodanalyser;
/**
 * @desc : MoodAnalyser Class analyses the mood according to message
 */
public class MoodAnalyser {
    private String message;
    /**
     * @desc : MoodAnalyser Class Constructor
     */
    public MoodAnalyser(){

    }
    /**
     * @desc : MoodAnalyser Class Constructor
     * @params : message
     */
    public MoodAnalyser(String message){
        this.message = message;
    }

    /**
     * @desc : method to analyse according to word contained by message
     * @params :
     * @return : type of mood happy , sad or null
     */
    public String analyseMood(){

        try {
            String[] wordsInMessage = this.message.toLowerCase().split(" ");
            for (String word : wordsInMessage) {
                if (word.equals("sad")) {
                    return "SAD";
                } else if (word.equals("happy")) {
                    return "HAPPY";
                }
            }
        }
        catch (NullPointerException e){
            return "HAPPY";
        }
        throw new MoodAnalysisException("Invalid Mood Message");
    }
    public void setMessage(String message){
        this.message = message;
    }
}
