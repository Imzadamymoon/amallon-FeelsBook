package com.example.ames.amallon_feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class comment_page_master extends AppCompatActivity {

    private Boolean Post01 = false;
    private Boolean Post02 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_page_master);

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
    protected void addNewPost(View view){
        Intent intent = new Intent (this, MainActivity.class);
        Button New_Post_Button = (Button) findViewById(R.id.New_Post_Button);

        startActivity(intent);
    }

}
