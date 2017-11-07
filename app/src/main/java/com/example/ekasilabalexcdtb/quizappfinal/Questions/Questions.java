package com.example.ekasilabalexcdtb.quizappfinal.Questions;

/**
 * Created by eKasiLab Alex CDTB on 2017/11/03.
 */

public class Questions {

      public String mQuestion[] ={
            "Which is the first planet in the solar system",
            "Which is the second planet in the solar system",
            "Which is the third planet in the solar system",
            "Which is the fourth planet in the solar system",
            "Which is the fifth planet in the solar system",
            "Which is the sixth planet in the solar system",
            "Which is the seventh planet in the solar system",
            "Which is the eight planet in the solar system",
            "Which is the ninth planet in the solar system",
    };
    private String mChoice[][] = {
            {"Mercury", "Venus", "Mars","Saturn"},
            {"Jupiter", "Venus", "Earth","Naptune"},
            {"Earth", "Jupiter", "Mars","Saturn"},
            {"Jupiter", "Saturn", "Mars","Earth"},
            {"Jupiter", "Pluto", "Mercury","Earth"},
            {"Uranus", "Venus", "Mars","Saturn"},
            {"Saturn", "Pluto", "Uranus","Earth"},
            {"Venus", "Neptune", "Pluto","Mars"},
            {"Mercury", "Venus", "Mars","Pluto"},


    };
    private String mCorrectAnswer[]={"Mercury", "Venus", "Earth" , "Mars", "Jupiter", "Saturn","Uranus", "Neptune","Pluto"};

    public String getQuestion(int a){
        String question = mQuestion[a];
        return  question;
    }
    public  String getChoice1(int a){
        String choice = mChoice[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice = mChoice[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice = mChoice[a][2];
        return choice;
    }

    public  String getChoice4(int a){
        String choice = mChoice[a][3];
        return choice;
    }
    public  String getCorrectAnwer(int a){
        String answer= mCorrectAnswer[a];
        return answer;
    }

}
