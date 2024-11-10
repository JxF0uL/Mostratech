package com.example.professor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btSalvar;
    EditText txtOcorrido, txtLocal, txtData, txtHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOcorrido = findViewById(R.id.txtOcorrido);
        txtLocal = findViewById(R.id.txtLocal);
        txtData = findViewById(R.id.txtData);
        txtHora = findViewById(R.id.txtHora); // Adicione um campo para hora no layout XML

        btSalvar = findViewById(R.id.btSalvar);
        btSalvar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btSalvar) {
            salvar();
        }
    }

    private void salvar() {
        String msg;
        String ocorrido = txtOcorrido.getText().toString();
        String local = txtLocal.getText().toString();
        String data = txtData.getText().toString();
        String hora = txtHora.getText().toString();

        if (ocorrido.isEmpty() || local.isEmpty() || data.isEmpty() || hora.isEmpty()) {
            msg = "Todos os campos devem ser preenchidos!";
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
        } else {
            BancoController bd = new BancoController(getBaseContext());
            String resultado = bd.insereDadosDenuncia