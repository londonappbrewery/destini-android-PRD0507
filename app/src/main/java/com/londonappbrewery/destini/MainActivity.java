package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button tButton;
    private Button bButton;
    private TextView tStoryTextView;

    int mStoryIndex =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        tStoryTextView = (TextView) findViewById(R.id.storyTextView);
        tButton = (Button) findViewById(R.id.buttonTop);
        bButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1 || mStoryIndex == 2){
                    tStoryTextView.setText(R.string.T3_Story);
                    tButton.setText(R.string.T3_Ans1);
                    bButton.setText(R.string.T3_Ans2);
                    mStoryIndex =3;

                } else {
                    tStoryTextView.setText(R.string.T6_End);
                    tButton.setVisibility(View.GONE);
                    bButton.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex==1) {
                    tStoryTextView.setText(R.string.T2_Story);
                    tButton.setText(R.string.T2_Ans1);
                    bButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;

                } else if (mStoryIndex == 2){

                    tStoryTextView.setText(R.string.T4_End);
                    tButton.setVisibility(View.GONE);
                    bButton.setVisibility(View.GONE);

                } else  {
                    tStoryTextView.setText(R.string.T5_End);
                    tButton.setVisibility(View.GONE);
                    bButton.setVisibility(View.GONE);
                }
            }
        });

    }







}
