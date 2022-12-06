package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class LletraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lletra);
    }
    public void Sonidoletra_l(View view){
        switch (view.getId()) {
            case R.id.Opc1:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.luna);
                opc1mp.start();
                break;
            case R.id.Opc2: MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.leon);
                opc2mp.start();
                break;
            case R.id.Opc3: MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.leche);
                opc3mp.start();
                break;
            case R.id.Opc4: MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.limon);
                opc4mp.start();
                break;
            case R.id.Opc5: MediaPlayer opc5mp = MediaPlayer.create(this,R.raw.lagartija);
                opc5mp.start();
                break;
            case R.id.Opc6: MediaPlayer opc6mp = MediaPlayer.create(this,R.raw.leopardo);
                opc6mp.start();
                break;
        }
    }
}