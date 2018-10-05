package com.example.ames.amallon_feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class comment_page_master extends AppCompatActivity {
// Variables
    private Boolean Post01 = false;
    List Master_Feeling_List = new ArrayList();
    List Master_Comment_List = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_page_master);

        Master_Feeling_List.add(MainActivity.CHOSEN_FEELING);
        Master_Comment_List.add(MainActivity.COMMENT_MESSAGE);


        if (Post01 == false){
            Intent intent = getIntent();
            String comment = intent.getStringExtra(MainActivity.COMMENT_MESSAGE);
            String feeling = intent.getStringExtra(MainActivity.CHOSEN_FEELING);

            //Add the inputs to the first comment
            TextView SelectedFeeling = findViewById(R.id.Post01_Feeling_Head);
            TextView EnteredComment = findViewById(R.id.Post01_Comment);

            SelectedFeeling.setText(feeling);
            EnteredComment.setText(comment);

            //Set the second comment to nothing
            TextView Post02_Feeling =findViewById(R.id.Post02_Feeling_Head);
            TextView Post02_Comment = findViewById(R.id.Post02_Comment);

            Post02_Feeling.setText("");
            Post02_Comment.setText("");

            //Set Post1 to true
            Post01 = true;
        }
    }

    protected void makeNewPost(View view){
        Intent Return_MainScreen = new Intent (this, MainActivity.class);
        startActivity(Return_MainScreen);
        finish();
    }
}
