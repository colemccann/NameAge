package com.gingerly.cole.nameage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.gingerly.cole.nameage.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void startNextActivity (View finalActivityButton) {
        Intent nextActivity = new Intent(this, AgeActivity.class);
        EditText userInput = (EditText) findViewById(R.id.edit_text_name);
        String userName = userInput.getText().toString();
        nextActivity.putExtra(EXTRA_MESSAGE, userName);
        startActivity(nextActivity);
    }
}
