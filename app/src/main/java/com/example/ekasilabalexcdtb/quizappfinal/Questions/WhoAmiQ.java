package com.example.ekasilabalexcdtb.quizappfinal.Questions;

/**
 * Created by eKasiLab Alex CDTB on 2017/11/03.
 */

public class WhoAmiQ {

    public String mQuestion[] = {
            "I hide in the daylight but prefer the sun.",
            "I have three eyes but cannot see.",
            "I live on land but in a tree",
            "When you look away is when I show.",
            "I jump when I walk and sit when I stand. What am I?",
            "I am an insect. Half of my name is another insect. What am I?",
            "What goes up and never comes down ",
            "I am a ship that can be made to ride the greatest waves. I am not built by objects, but built by minds. What am I?",
            "I’m rarely touched but often held and if you’re wise you’ll use me well. What am I?",
    };
    private String mChoice[][] = {
            {"Shadow", "Night Rider", "Sunscreen", "Snake"},
            {"Traffic light", "Spider", "Motorbike", "Cat"},
            {"Snake", "Bird", "Leopard", "Bee "},
            {"Ghost  ", "Side profile", "Mice ", "Shadow"},
            {"Frog", "Grasshopper.", "Impala", "A Kangaroo"},
            {"Grasshopper. ", "Springbok", "Beetle", "Dolphin"},
            {"An Elevator", "Air", "A balloon", "Your Age"},
            {"CruiseShip", "RelationShip", "PartnerShip", "FriendShip"},
            {"Hands", "Mouth ", "Eyes ", "Your tongue."},


    };
    private String mCorrectAnswer[] = {"Shadow", "Traffic light", "Bird", "Side profile", "A Kangaroo", "Beetle", "Your Age", "FriendShip", "Your tongue"};

    public String getQuestion(int a) {
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoice[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoice[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoice[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoice[a][3];
        return choice;
    }

    public String getCorrectAnwer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
