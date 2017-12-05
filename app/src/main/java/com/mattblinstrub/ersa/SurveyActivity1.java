package com.mattblinstrub.ersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class SurveyActivity1 extends AppCompatActivity {

    int path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey1);
    }

    /** Called when the user taps the Radio button */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rad_q1_yes:
                if (checked)
                    path = 1;
                    break;
            case R.id.rad_q1_no:
                if (checked)
                    path = 0;
                    break;
        }
    }

    /** Called when the user taps the Next button */
    public void startQuestionTwo(View view) {
        Intent intent2y = new Intent(this, SurveyActivity2y.class);
        Intent intent2n = new Intent(this, SurveyActivity2n.class);

        if (path == 1) {
            startActivity(intent2y);
        } else if (path == 0) {
            startActivity(intent2n);
        }
    }

}
