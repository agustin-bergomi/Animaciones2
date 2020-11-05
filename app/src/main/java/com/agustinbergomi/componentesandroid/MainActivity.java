package com.agustinbergomi.componentesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //seteo las animaciones como final porque no van a cambiar
    //se cargan con el metodo declarado buscando en resources cada compoenente
    final Animation animtrans = AnimationUtils.loadAnimation(this,R.anim.translate);
    final Animation animalpha = AnimationUtils.loadAnimation(this,R.anim.alpha);
    final Animation animscale = AnimationUtils.loadAnimation(this,R.anim.rotate);
    final Animation animrotate = AnimationUtils.loadAnimation(this,R.anim.rotate);

    //se declaran los compoenentes de xml en el archivo java
    //se tienen que transformar en objetos por eso se declaran de esta manera en el archivo java
    //se castea a button porque lo que se esta pasando es de itpo int
    Button translate = (Button) findViewById(R.id.translate);
    Button alpha = (Button) findViewById(R.id.alpha);
    Button scale = findViewById(R.id.scale);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}