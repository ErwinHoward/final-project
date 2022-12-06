package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class YletraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yletra);
    }
    public void Sonidoletra_y(View view){
        switch (view.getId()) {
            case R.id.Opc1:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.yegua);
                opc1mp.start();
                break;
            case R.id.Opc2: MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.yoyo);
                opc2mp.start();
                break;
            case R.id.Opc3: MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.yucatan);
                opc3mp.start();
                break;
            case R.id.Opc4: MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.yate);
                opc4mp.start();
                break;
            case R.id.Opc5: MediaPlayer opc5mp = MediaPlayer.create(this,R.raw.yogurt);
                opc5mp.start();
                break;
            case R.id.Opc6: MediaPlayer opc6mp = MediaPlayer.create(this,R.raw.yeso);
                opc6mp.start();
                break;
        }
    }
}