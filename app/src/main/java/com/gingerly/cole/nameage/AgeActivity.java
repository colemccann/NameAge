package com.gingerly.cole.nameage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class AgeActivity extends AppCompatActivity {

    protected static String name;
    protected static String ageQuestionString;
    protected static int age;
    protected static final int year = 2016;
    public final static String EXTRA_MESSAGE = "com.gingerly.cole.nameage.MESSAGE";
    public final static String EXTRA_MESSAGE_TWO = "com.gingerly.cole.nameage.MESSAGE_TWO";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        Intent getName = getIntent();
        name = getName.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView ageQuestion = (TextView) findViewById(R.id.age_question);
        ageQuestionString = getString(R.string.age_question, name);
        ageQuestion.setText(ageQuestionString);
    }

    protected void startLastActivity(View finalActivityButton) {
        Intent lastActivity = new Intent(this, FinalActivity.class);


        String userName = name;
        lastActivity.putExtra(EXTRA_MESSAGE, userName);

        EditText ageInput = (EditText) findViewById(R.id.age_answer);
        String ageString = ageInput.getText().toString();
        int ageAnswer = Integer.parseInt(ageString);
        age = (year - ageAnswer);
        lastActivity.putExtra(EXTRA_MESSAGE_TWO, age);

        startActivity(lastActivity);
    }

}




//readoutOne = getString(R.string.age_question, name)