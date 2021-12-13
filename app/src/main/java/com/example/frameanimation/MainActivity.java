package com.example.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bisonImage = findViewById(R.id.bison);
        Animation bisonAnim = AnimationUtils.loadAnimation(this, R.anim.bison_anim);
        bisonImage.startAnimation(bisonAnim);
    }
}