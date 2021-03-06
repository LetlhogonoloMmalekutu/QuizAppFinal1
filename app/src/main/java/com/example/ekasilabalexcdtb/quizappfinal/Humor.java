package com.example.ekasilabalexcdtb.quizappfinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ekasilabalexcdtb.quizappfinal.Questions.HumorQuestions;
import com.example.ekasilabalexcdtb.quizappfinal.Questions.Questions;

import java.util.Random;

public class Humor extends AppCompatActivity {


    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    Button button;


    private HumorQuestions mHumorQuestions = new HumorQuestions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLenght = mHumorQuestions.mQuestion.length;

    Random r;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humor);

        Typeface myTypeface= Typeface.createFromAsset(getAssets(),"Fonty.ttf");
        TextView mTextView= (TextView)findViewById(R.id.question);
        mTextView.setTypeface(myTypeface);

        Typeface myTypeface1= Typeface.createFromAsset(getAssets(),"Fonty.ttf");
        TextView mTextView1= (TextView)findViewById(R.id.score);
        mTextView.setTypeface(myTypeface);





        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);



        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);
        score.setText("Score" + mScore);
        updateQuestion(r.nextInt(mQuestionsLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();

                }



            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();

                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();

                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();

                }
            }
        });


    }

    private void updateQuestion(int num) {
        question.setText(mHumorQuestions.getQuestion(num));
        answer1.setText(mHumorQuestions.getChoice1(num));
        answer2.setText(mHumorQuestions.getChoice2(num));
        answer3.setText(mHumorQuestions.getChoice3(num));
        answer4.setText(mHumorQuestions.getChoice4(num));

        mAnswer = mHumorQuestions.getCorrectAnwer(num);
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Humor.this);
        alertDialogBuilder.setMessage("Game Over! Your score is " + mScore + "points.")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                            }
                        });

        alertDialogBuilder.setMessage("Game Over! Your score is " + mScore + "points.")
                .setCancelable(false).setNegativeButton("Exit",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        finish();

                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    }

