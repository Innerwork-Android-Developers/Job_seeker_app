package com.example.innerwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    Animation top,bot;
    ImageView i1;
    TextView tex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        top= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bot=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        i1=findViewById(R.id.i7);
        tex=findViewById(R.id.t1);
        i1.setAnimation(top);
        tex.setAnimation(bot);

        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.v("tag","first");
                Intent i=new Intent(MainActivity.this,Main2.class);
                startActivity(i);
                finish();

            }
        },4100);


    }
}
