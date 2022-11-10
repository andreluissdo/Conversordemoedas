package com.example.convertermoedas;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textResultado;
    private Spinner menu;
    String [] opcoes = {"Selecione uma moeda:","Dolar", "Euro", "Libra", "Peso argentino"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editValor = findViewById(R.id.editValores);
        textResultado = findViewById(R.id.textResultado);
        menu = findViewById(R.id.menu);
        

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getApplicationContext(), R.layout.spinner_item, opcoes);
        menu.setAdapter(adapter);
        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            /*Segue abaixo código para selecionar uma das opções do spinner e atribuir funções a elas
            * Obs.: Foi usado o método switch/case para inserir novas moedas para conversão posteriormente*/
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {



                /*início dos métodos para funcionamento dos itens no spinner*/
                switch (position){
                    case 0:
                        textResultado.setText("Resultado: ");
                    break;

                    case 1:
                        double valor;
                        double resultado;
                        try{
                            valor = new Double(editValor.getText().toString());

                        }catch (NumberFormatException e){
                            valor = 0;
                        }

                        resultado = valor * 0.1989;
                        textResultado.setText("Resultado: " + resultado);
                    break;

                    case 2:

                        try{
                            valor = new Double(editValor.getText().toString());

                        }catch (NumberFormatException e){
                            valor = 0;
                        }

                        resultado = valor * 0.2001;
                        textResultado.setText("Resultado: " + resultado);
                    break;

                    case 3:
                        try{
                            valor = new Double(editValor.getText().toString());

                        }catch (NumberFormatException e){
                            valor = 0;
                        }

                        resultado = valor * 0.1751;
                        textResultado.setText("Resultado: " + resultado);
                    break;

                    case 4:
                        try{
                            valor = new Double(editValor.getText().toString());

                        }catch (NumberFormatException e){
                            valor = 0;
                        }

                        resultado = valor * 0.034;
                        textResultado.setText("Resultado: " + resultado);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }

}