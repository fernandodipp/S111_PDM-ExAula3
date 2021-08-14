package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView campoLogin= findViewById(R.id.recebe_usuario);
        TextView campoSenha= findViewById(R.id.recebe_senha);
        campoLogin.setText((String) getIntent().getSerializableExtra("TEXTO_LOGIN"));
        campoSenha.setText((String) getIntent().getSerializableExtra("TEXTO_SENHA"));
    }
}