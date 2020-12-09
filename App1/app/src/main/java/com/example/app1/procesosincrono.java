package com.example.app1;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.ProgressBar;
import android.widget.TextView;


 class procesoasincrono extends AsyncTask<Object, Integer, Void> {
    int vidas;
    private ProgressBar progressBar2;

    procesoasincrono(ProgressBar c){
        vidas = c.getProgress();
        progressBar2 = c;
    }

    @Override
    protected void onProgressUpdate(Integer... values){

        vidas--;
        progressBar2.setProgress(vidas);
    }
    @Override
    protected Void doInBackground(Object... num){

        while(true){
            SystemClock.sleep(1000);
            publishProgress();
        }
    }




    }




