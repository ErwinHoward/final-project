package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class ComunicacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion);
    }
    public void Sonido_comunicacion(View view){
        switch (view.getId()) {
            case R.id.textComunicacion:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.comunicacion);
                opc1mp.start();
                break;
            case R.id.imageComida:
            case R.id.textComida:
                MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.nina_comida);
                opc2mp.start();
                break;
            case R.id.imageDespertando:
            case R.id.textDespertando:
                MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.nino_despertando);
                opc3mp.start();
                break;
            case R.id.imageDurmiendo:
            case R.id.textDurmiendo:
                MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.nino_durmiendo);
                opc4mp.start();
                break;
            case R.id.imageDientes:
            case R.id.textDientes:
                MediaPlayer opc5mp = MediaPlayer.create(this,R.raw.ninos_dientes);
                opc5mp.start();
                break;
            case R.id.imageTomando:
            case R.id.textTomando:
                MediaPlayer opc6mp = MediaPlayer.create(this,R.raw.ninos_tomando);
                opc6mp.start();
                break;
            case R.id.imageCorriendo:
            case R.id.textCorriendo:
                MediaPlayer opc7mp = MediaPlayer.create(this,R.raw.nino_corriendo);
                opc7mp.start();
                break;
        }
    }
}