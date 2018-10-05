package com.example.ames.amallon_feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String COMMENT_MESSAGE = "com.example.ames.amallon_feelsbook.COMMENT";
    public static final String CHOSEN_FEELING = "com.example.ames.amallon_feelsbook.FEELING";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    String ChosenEmotion = "";

    public void onClick(View v) {
        TextView ChosenFeelingText = (TextView) findViewById(R.id.ChosenFeeling);
        Intent intent = new Intent(this, comment_page_master.class);

        switch (v.getId()) {
            case R.id.Love_Button:
                ChosenFeelingText.setText("Love");
                ChosenEmotion = "Love";
                break;
            case R.id.Sad_Button:
                ChosenFeelingText.setText("Sad");
                ChosenEmotion = "Sad";
                break;
            case R.id.Anger_Button:
                ChosenFeelingText.setText("Anger");
                ChosenEmotion = "Anger";
                break;
            case R.id.Surprise_Button:
                ChosenFeelingText.setText("Surprise");
                ChosenEmotion = "Surprise";
                break;
            case R.id.Joy_Button:
                ChosenFeelingText.setText("Joy");
                ChosenEmotion = "Joy";
                break;
            case R.id.Fear_Button:
                ChosenFeelingText.setText("Fear");
                ChosenEmotion = "Fear";
                break;
        }
    }

    public void sendPost(View view){
        Intent intent = new Intent (this, comment_page_master.class);

        EditText UsersComment = (EditText) findViewById(R.id.User_Input_Comment);
        String comment = UsersComment.getText().toString();
        intent.putExtra(COMMENT_MESSAGE, comment);

        TextView ChosenFeelingText = (TextView) findViewById(R.id.ChosenFeeling);
        String feeling = ChosenFeelingText.getText().toString();
        intent.putExtra(CHOSEN_FEELING, feeling);

        //startActivity is the last thing in this function
        startActivity(intent);
    }

    }

