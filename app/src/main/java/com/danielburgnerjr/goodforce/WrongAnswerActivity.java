package com.danielburgnerjr.goodforce;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WrongAnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_answer);

        final Button btnContinue = (Button) findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intA = new Intent(WrongAnswerActivity.this, WatchVideoActivity.class);
                startActivity(intA);
                //Toast.makeText(getApplicationContext(), "How To Play", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
