package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ZletraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zletra);
    }
    public void Sonidoletra_z(View view){
        switch (view.getId()) {
            case R.id.Opc1:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.zorro);
                opc1mp.start();
                break;
            case R.id.Opc2: MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.zapote);
                opc2mp.start();
                break;
            case R.id.Opc3: MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.zombi);
                opc3mp.start();
                break;
            case R.id.Opc4: MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.zapato);
                opc4mp.start();
                break;
            case R.id.Opc5: MediaPlayer opc5mp = MediaPlayer.create(this,R.raw.zanahoria);
                opc5mp.start();
                break;
            case R.id.Opc6: MediaPlayer opc6mp = MediaPlayer.create(this,R.raw.zopilote);
                opc6mp.start();
                break;
        }
    }
}