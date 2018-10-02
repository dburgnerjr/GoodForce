package com.danielburgnerjr.goodforce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CorrectAnswerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer);

        final Button btnContinue = (Button) findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intA = new Intent(CorrectAnswerActivity.this, WatchVideoActivity.class);
                startActivity(intA);
                //Toast.makeText(getApplicationContext(), "How To Play", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
