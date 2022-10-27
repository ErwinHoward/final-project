package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}