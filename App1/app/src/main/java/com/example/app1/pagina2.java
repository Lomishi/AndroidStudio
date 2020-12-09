package com.example.app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class pagina2 extends Activity {
     ProgressBar progressBar1;
    ProgressBar progressBar2;
    ImageView imagenPrincipal;
    ImageView segunda;
    int vidas;

    TextView text;



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);
        imagenPrincipal=(ImageView)findViewById(R.id.imagenPrincipal);
        text=(TextView)findViewById(R.id.texto1);
        progressBar1=(ProgressBar)findViewById(R.id.progressBar1);
        progressBar2=(ProgressBar)findViewById(R.id.progressBar2);
        a = new procesoasincrono(progressBar2);
    }


    public void botonpulsado(View view) throws InterruptedException {


        progressBar1.setProgress(progressBar1.getProgress()-1);

    }


    public void next (View view){
        Intent i = new Intent(view.getContext(), MainActivity.class);
        startActivity(i);
    }


    }











