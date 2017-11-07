package com.example.ekasilabalexcdtb.quizappfinal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Categories extends AppCompatActivity {

    Button button;
    // Animation
    Animation animRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Typeface myTypeface= Typeface.createFromAsset(getAssets(),"capture.ttf");
        TextView mTextView= (TextView)findViewById(R.id.fun);
        mTextView.setTypeface(myTypeface);


        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Categories.this, MainActivity.class);
                startActivity(intent);

                Typeface myTypeface= Typeface.createFromAsset(getAssets(),"capture.ttf");
                TextView mTextView= (TextView)findViewById(R.id.button1);
                mTextView.setTypeface(myTypeface);






            }
        });

        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Categories.this, SouthQuiz.class);
                startActivity(intent);

                Typeface myTypeface= Typeface.createFromAsset(getAssets(),"capture.ttf");
                TextView mTextView= (TextView)findViewById(R.id.button2);
                mTextView.setTypeface(myTypeface);
            }
        });


        button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Categories.this, WhoAmI.class);
                startActivity(intent);

                Typeface myTypeface= Typeface.createFromAsset(getAssets(),"capture.ttf");
                TextView mTextView= (TextView)findViewById(R.id.button3);
                mTextView.setTypeface(myTypeface);
            }
        });




        button=(Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Categories.this, Humor.class);
                startActivity(intent);

                Typeface myTypeface= Typeface.createFromAsset(getAssets(),"capture.ttf");
                TextView mTextView= (TextView)findViewById(R.id.button4);
                mTextView.setTypeface(myTypeface);

            }
        });
    }




}
