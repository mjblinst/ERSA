package com.mattblinstrub.ersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SurveyActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_activity3);
    }

    /** Called when the user taps the Next button */
    public void finishSurvey(View view) {
        Intent intent = new Intent(this, FinishActivity.class);
        startActivity(intent);
    }
}
