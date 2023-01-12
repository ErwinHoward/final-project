package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class SenalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senal);
    }
    public void Sonido_senal(View view){
        switch (view.getId()) {
            case R.id.textSenal:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.senales);
                opc1mp.start();
                break;
            case R.id.imageCortadura:
            case R.id.textCortadura:
                MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.cortas_filosos);
                opc2mp.start();
                break;
            case R.id.imageCortando:
            case R.id.textCortando:
                MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.no_filosos);
                opc3mp.start();
                break;
            case R.id.imageFuego:
            case R.id.textFuego:
                MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.no_estufa);
                opc4mp.start();
                break;
            case R.id.imageNadando:
            case R.id.textNadando:
                MediaPlayer opc5mp = MediaPlayer.create(this,R.raw.no_alberca);
                opc5mp.start();
                break;
            case R.id.imageAhogandose:
            case R.id.textAhogandose:
                MediaPlayer opc6mp = MediaPlayer.create(this,R.raw.si_ahogas);
                opc6mp.start();
                break;
            case R.id.imageEnchufes:
            case R.id.textEnchufes:
                MediaPlayer opc7mp = MediaPlayer.create(this,R.raw.no_enchufes);
                opc7mp.start();
                break;
            case R.id.imageElectrocutas:
            case R.id.textElectrocutas:
                MediaPlayer opc8mp = MediaPlayer.create(this,R.raw.si_electrocutas);
                opc8mp.start();
                break;
            case R.id.imageQuemadura:
            case R.id.textQuemadura:
                MediaPlayer opc9mp = MediaPlayer.create(this,R.raw.quemas_estufa);
                opc9mp.start();
                break;
        }
    }
}