package com.example.teapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CuentaActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editUser, editPass, editNombre, editAp;
    Button btnEditar, btnCancelar;
    int id = 0;
    Usuario u;
    daoUsuario dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);
        editUser = (EditText) findViewById(R.id.EditUser);
        editPass = (EditText) findViewById(R.id.EditPassword);
        editNombre = (EditText) findViewById(R.id.EditUsername);
        editAp = (EditText) findViewById(R.id.EditUserApe);
        btnEditar = (Button) findViewById(R.id.Editar_button);
        btnCancelar = (Button) findViewById(R.id.Cancelar_button);
        btnEditar.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        id = bundle.getInt("Id");
        dao = new daoUsuario(this);
        u = dao.getUsuarioById(id);
        editUser.setText(u.getUsuario());
        editPass.setText(u.getPassword());
        editNombre.setText(u.getNombre());
        editAp.setText(u.getApellidos());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Editar_button:
                u.setUsuario(editUser.getText().toString());
                u.setPassword(editPass.getText().toString());
                u.setNombre(editNombre.getText().toString());
                u.setApellidos(editAp.getText().toString());
                if (!u.isNull()){
                    Toast.makeText(this, "ERROR: Campos vacios", Toast.LENGTH_SHORT).show();
                }else if (dao.updateUsuario(u)){
                    Toast.makeText(this, "Actualizacion Exitosa", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this,MenuActivity.class);
                    intent.putExtra("Id", u.getId());
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(this, "No se puede actualizar", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Cancelar_button:
                Intent intent2 = new Intent(this,MenuActivity.class);
                startActivity(intent2);
                finish();
        }
    }
}