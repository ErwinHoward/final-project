package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para mostrar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //Acciones de los botones del menu
    public void Opciones(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.abc_Button: intent = new Intent(this,AbcActivity.class);
                break;
            case R.id.color_Button: intent = new Intent(this, ColorActivity.class);
                break;
            case R.id.senal_Button: intent = new Intent(this, SenalActivity.class);
                break;
            case R.id.cominicacion_Button: intent = new Intent(this, ComunicacionActivity.class);
                break;
        }
        startActivity(intent);
    }
    public void Sonido_opciones(View view){
        switch (view.getId()) {
            case R.id.senales:
                MediaPlayer opc1mp = MediaPlayer.create(this, R.raw.dado);
                opc1mp.start();
                break;
            case R.id.colores:
                MediaPlayer opc2mp = MediaPlayer.create(this,R.raw.durazno);
                opc2mp.start();
                break;
            case R.id.comunicacion:
                MediaPlayer opc3mp = MediaPlayer.create(this,R.raw.dedos);
                opc3mp.start();
                break;
            case R.id.abc:
                MediaPlayer opc4mp = MediaPlayer.create(this,R.raw.dinosaurio);
                opc4mp.start();
                break;
        }
    }
}