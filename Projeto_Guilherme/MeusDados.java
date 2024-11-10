package com.seuapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MeusDados extends AppCompatActivity {
    private TextView txtNome, txtEmail, txtCPF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_dados);

        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtCPF = findViewById(R.id.txtCPF);

        // Aqui você pode carregar os dados do usuário
        txtNome.setText("Nome: João da Silva");
        txtEmail.setText("E-mail: joao.silva@example.com");
        txtCPF.setText("CPF: 123 .456.789-00");
    }
}