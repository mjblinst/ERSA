package com.mattblinstrub.ersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SurveyActivity2n extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_activity2n);
    }

    /** Called when the user taps the Next button */
    public void startQuestionThreeY(View view) {
        Intent intent3 = new Intent(this, SurveyActivity3.class);
        startActivity(intent3);
    }
}
