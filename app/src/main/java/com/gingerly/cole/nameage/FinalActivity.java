package com.gingerly.cole.nameage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    protected static String name;
    protected static String ageReadoutString;
    protected static int finalAge;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent getName = getIntent();
        name = getName.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Intent getAge = getIntent();
        finalAge = getAge.getIntExtra(AgeActivity.EXTRA_MESSAGE_TWO, 0);



        TextView ageReadout = (TextView) findViewById(R.id.age_result);
        ageReadoutString = getString(R.string.age_readout, name, finalAge);
        ageReadout.setText(ageReadoutString);

    }


}
