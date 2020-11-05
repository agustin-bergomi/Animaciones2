package com.agustinbergomi.componentesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    //seteo las animaciones como final porque no van a cambiar
    //se cargan con el metodo declarado buscando en resources cada compoenente
    final Animation animtrans = AnimationUtils.loadAnimation(this,R.anim.translate);
    final Animation animalpha = AnimationUtils.loadAnimation(this,R.anim.alpha);
    final Animation animscale = AnimationUtils.loadAnimation(this,R.anim.rotate);
    final Animation animrotate = AnimationUtils.loadAnimation(this,R.anim.rotate);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}