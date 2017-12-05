package com.mattblinstrub.ersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SurveyActivity2y extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_activity2y);
        initializeVariables();

        // Initialize the textview with a value of 0
        textView.setText("Less than a month ago");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (seekBar.getProgress() == 0) {
                    textView.setText("Less than a month ago");
                } else if (seekBar.getProgress() == 1) {
                    textView.setText(seekBar.getProgress() + " month ago");
                } else if (seekBar.getProgress() == 13) {
                    textView.setText("More than a year ago");
                } else {
                    textView.setText(seekBar.getProgress() + " months ago");
                }
            }
        });
    }

    // A private method to help us initialize our variables.
    private void initializeVariables() {
        seekBar = (SeekBar) findViewById(R.id.seek_bar_2y);
        textView = (TextView) findViewById(R.id.txt_sb_2y);
    }

    /** Called when the user taps the Next button */
    public void startQuestionThreeY(View view) {
        Intent intent3 = new Intent(this, SurveyActivity3.class);
        startActivity(intent3);
    }
}
