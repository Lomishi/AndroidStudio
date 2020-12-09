package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView text;
     ImageView imagenPrincipal;
     int numeropulso=0;
    private MainActivity set;
    int numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.texto1);
        imagenPrincipal=(ImageView)findViewById(R.id.imagenPrincipal);


    }


    public void next (View view){
        Intent i = new Intent(view.getContext(), pagina2.class);
        startActivity(i);
    }

    public void botonpulsado(View view) {
        numeropulso++;
        text.setText(numeropulso+" ");
    }
    public int cambiarPokemon(View view){
        Random aleatorio = new Random();
        numero=aleatorio.nextInt(4);
         if (numero==1){

        imagenPrincipal.setImageResource(R.drawable.charmander);
             return numero;

             }
         else if(numero==2){
        imagenPrincipal.setImageResource(R.drawable.pikachu);
             return numero;}

        else if(numero==3){
             imagenPrincipal.setImageResource(R.drawable.xarizard);
             return numero;
         }

         else{
             imagenPrincipal.setImageResource(R.drawable.bulbasor);
             return numero;
         }

    }



    }



