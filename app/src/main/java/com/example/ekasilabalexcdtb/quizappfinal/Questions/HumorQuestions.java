package com.example.ekasilabalexcdtb.quizappfinal.Questions;

/**
 * Created by eKasiLab Alex CDTB on 2017/11/07.
 */

public class HumorQuestions {

    public String mQuestion[] ={
        "I turn around once,What is out will not get in,I turn around again.What is in will not get out. What am I?",
            "I don’t speak but there is no word I cannot make. What am I?",
            "You cannot keep me until you have given me. What am I",
            "What has teeth but can’t bite?",
            "You can swallow me, but I can swallow you. What am I?",
            "If you lose me, others around you may lose me too. What am I?",
            "What day will you never see again?",
            "I go in dry and come out wet,The longer I’m in, the stronger it will get.What am i?",
            "Until I am measured,I am not known,Yet how you miss me,When I have flown.",
    };
    private String mChoice[][] = {
            {"A Key", "Volume Control", "Switch","A Safe"},
            {"The Alphabet", "Mouth", "KeyBoard","Billboard"},
            {"Food", "Your Word", "Secret","Love"},
            {"An old Granny", "Snake ", "A Comb"," A Knife"},
            {"Water", "Air ", "Hole","Your Dreams"},
            {"Money", "The Truth", "Your Temper","An Argument"},
            {"The day before today", "Tomorrow ", "Yesterday","Today"},
            {"Cement", "A Tea bag", "Dick","Pap"},
            {"Length", "Size", "Time","Feelings"},


    };
    private String mCorrectAnswer[]={"A Key", "The Alphabet", "Your Word" , "A Comb", "Water", "Your Temper","Yesterday", "A Tea bag","Time"};

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




