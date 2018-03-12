package com.danielburgnerjr.goodforce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnHowToPlay = (Button) findViewById(R.id.btnBegin);
        btnHowToPlay.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intA = new Intent(MainActivity.this, GameStartActivity.class);
                startActivity(intA);
                //Toast.makeText(getApplicationContext(), "How To Play", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
