package com.example.vikram.androidanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class FanActivity extends AppCompatActivity {
    ImageView fan;
    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fan);
        final Animation animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        fan = (ImageView) findViewById(R.id.fan);
        start = (Button)findViewById(R.id.start);
        stop = (Button)findViewById(R.id.stop);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fan.startAnimation(animRotate);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fan.clearAnimation();
            }
        });
    }
}
