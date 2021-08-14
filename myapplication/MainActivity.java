/*
Criar um projeto Android, para que rode com a API Level mínimo 25.
A primeira Activity deve ser uma tela de login, com as entradas para digitar usuário e senha.
Ao clicar no botão de logar, verificar se user está cadastrado no sistema (user=admin,
senha=123).
Mostrar uma mensagem informando que usuário e senha é inválido. Caso esteja ok,
enviar o usuário para a próxima Activity, onde deve ser mostrado as informações digitadas.
 */


package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText campoLogin = findViewById(R.id.editText_Login);
    EditText campoSenha = findViewById(R.id.editText_Password);
    String loginDigitado = campoLogin.getText().toString();
    String senhaDigitada = campoSenha.getText().toString();

    private void startSegundaActivity(){
        Bundle sacolaParametros = new Bundle();
        sacolaParametros.putString("TEXTO_LOGIN",loginDigitado);
        sacolaParametros.putString("TEXTO_SENHA",senhaDigitada);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtras(sacolaParametros);
        startActivity(intent);
    }

    public void abreSegundaActivity(View view) {
        if(loginDigitado.equals("admin") && senhaDigitada.equals("123")){
            startSegundaActivity();
        }else{
            Toast toast = Toast.makeText(this, "Login ou Senha incorreta!" , Toast.LENGTH_LONG);
            toast.show();
        }
    }
}