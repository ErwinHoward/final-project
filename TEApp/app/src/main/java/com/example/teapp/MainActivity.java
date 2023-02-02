package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText user, pass;
    Button btnEntrar, btnCrear;
    daoUsuario dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText)findViewById(R.id.Usertext);
        pass = (EditText)findViewById(R.id.Passwordtext);
        btnEntrar = (Button) findViewById(R.id.Iniciar_button);
        btnCrear = (Button) findViewById(R.id.Crear_button);

        btnEntrar.setOnClickListener(this);
        btnCrear.setOnClickListener(this);
        dao = new daoUsuario(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Iniciar_button:
                String u = user.getText().toString();
                String p = pass.getText().toString();
                if (u.equals("") && p.equals("")){
                    Toast.makeText(this, "ERROR: Campos vacios", Toast.LENGTH_SHORT).show();
                }else if (dao.login(u,p) ==1 ){
                    Usuario ux= dao.getUsuario(u,p);
                    Toast.makeText(this, "Datos correctos", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, MenuActivity.class);
                    intent.putExtra("Id", ux.getId());
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.Crear_button:
                Intent intent = new Intent(this, RegistroActivity.class);
                startActivity(intent);
                break;
        }
    }


}