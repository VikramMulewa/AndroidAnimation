package com.example.vikram.androidanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fadein;
    Button fadeout;
    Button crossfade;
    Button blink;
    Button zoomin;
    Button zoomout;
    Button rotate;
    Button move;
    Button slideup;
    Button slidedown;
    Button bounce;
    Button sequential;
    Button together;
    Button fan;
    Button anim1,anim2,anim3,anim4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fadein = (Button) findViewById(R.id.fadein);
        fadeout = (Button) findViewById(R.id.fadeout);
        crossfade = (Button) findViewById(R.id.crossfade);
        blink = (Button) findViewById(R.id.blink);
        zoomin = (Button) findViewById(R.id.zoomin);
        zoomout = (Button) findViewById(R.id.zoomout);
        rotate = (Button) findViewById(R.id.rotate);
        move = (Button) findViewById(R.id.move);
        slideup = (Button) findViewById(R.id.slideup);
        slidedown = (Button) findViewById(R.id.slidedown);
        bounce = (Button) findViewById(R.id.bounce);
        sequential = (Button) findViewById(R.id.sequential);
        together = (Button) findViewById(R.id.together);
        fan = (Button)findViewById(R.id.fan);

        anim1 = (Button)findViewById(R.id.anim1);
        anim2 = (Button)findViewById(R.id.anim2);
        anim3 = (Button)findViewById(R.id.anim3);
        anim4 = (Button)findViewById(R.id.anim4);

        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                fadein.startAnimation(animFadeIn);
            }
        });
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
                fadeout.startAnimation(animFadeOut);
            }
        });

        crossfade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
                crossfade.startAnimation(animFadeIn);
                crossfade.startAnimation(animFadeOut);
            }
        });

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                blink.startAnimation(animBlink);
            }
        });

        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
                zoomin.startAnimation(animZoomIn);
            }
        });

        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
                zoomout.startAnimation(animZoomOut);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                rotate.startAnimation(animRotate);
            }
        });

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                move.startAnimation(animMove);
            }
        });

        slideup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
                slideup.startAnimation(animSlideUp);
            }
        });

        slidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
                slidedown.startAnimation(animSlideDown);
            }
        });

        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animBounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                bounce.startAnimation(animBounce);
            }
        });

        sequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animsequential = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
                sequential.startAnimation(animsequential);
            }
        });

        together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animtogether = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);
                together.startAnimation(animtogether);
            }
        });

        fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FanActivity.class);
                startActivity(i);
            }
        });

        anim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
            }
        });

        anim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
            }
        });

        anim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.pull_in_dwn, R.anim.push_out_up);
            }
        });

        anim4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.new_anim1, R.anim.new_anim2);
            }
        });


    }
}
