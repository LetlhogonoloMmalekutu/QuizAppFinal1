package com.example.ekasilabalexcdtb.quizappfinal.Questions;

/**
 * Created by eKasiLab Alex CDTB on 2017/11/03.
 */

public class SouthQuestions {

    public String mQuestion[] = {
            "What does Soweto stand for ",
            "This mountain is one of the most popular places for tourists in South Africa. Can you name it?",
            "This game park is the largest in South Africa. What is it?",
            "Nelson Mandela spent 18 years imprisoned on this infamous island.",
            "What animal is Boulders Beach famous for having?",
            "Johannesburg's population boomed after what was found there?",
            "This is the site of the highest natural commercial jump in the world.",
            "How many languages are recognized in South Africa?",
            "Durban was visited by this famous explorer in 1497.",
    };
    private String mChoice[][] = {
            {"South Western Township", "South African Western Town", "South West Town ", "Soggy Western Town"},
            {"Table Mountain", "Devil's Peak", "Lion's Head", "Champagne Castle"},
            {"Kgalagadi Transfrontier Park", "Kruger National Park", "Madikwe Game Reserve ", "Pilanesburg Game Reserve "},
            {"Msikaba Island ", "Robben Island", "Easter Island ", "Marion Island"},
            {"Leopard", "Elephant", "ostrich", "Penguin"},
            {"Cocoa Beans ", "Oil", "Gold", "Uranium"},
            {"Drakensberg Dip", "Devil's Gorge", "Nelson Mandela Bridge", "Bloukrans"},
            {"1", "4", "15", "11"},
            {"James Cook", "Ferdinand Magellan ", "Davil Livingstone ", "Vasco Da Gama"},


    };
    private String mCorrectAnswer[] = {"South Western Township", "Table Mountain", "Kruger National Park", "Robben Island", "Penguin", "Gold", "BlouKrans Bridge", "11", "Vasco Da Gama"};

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
