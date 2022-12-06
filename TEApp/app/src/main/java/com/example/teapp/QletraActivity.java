package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class QletraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qletra);
    }
    public void Sonidoletra_q(View view){
        switch (view.getId()) {
            case R.id.Opc1:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.queso);
                opc1mp.start();
                break;
            case R.id.Opc2: MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.quimica);
                opc2mp.start();
                break;
            case R.id.Opc3: MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.quesadilla);
                opc3mp.start();
                break;
            case R.id.Opc4: MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.quincianera);
                opc4mp.start();
                break;
            case R.id.Opc5: MediaPlayer opc5mp = MediaPlayer.create(this,R.raw.quebrar);
                opc5mp.start();
                break;
            case R.id.Opc6: MediaPlayer opc6mp = MediaPlayer.create(this,R.raw.quemar);
                opc6mp.start();
                break;
        }
    }
}