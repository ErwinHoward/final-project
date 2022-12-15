package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MoradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morado);
    }
    public void Sonido_morado(View view){
        switch (view.getId()) {
            case R.id.Opc1:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.uvas);
                opc1mp.start();
                break;
            case R.id.Opc2:
                MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.globo);
                opc2mp.start();
                break;
            case R.id.Opc3:
                MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.mono);
                opc3mp.start();
                break;
            case R.id.Opc4:
                MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.pulpo);
                opc4mp.start();
                break;
        }
    }
}