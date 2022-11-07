package com.example.convertermoedas;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textResultado;
    private Button buttonDolar, buttonEuro, buttonLibra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editValor = findViewById(R.id.editValores);
        textResultado = findViewById(R.id.textResultado);
        buttonDolar = findViewById(R.id.buttonDolar);
        buttonEuro = findViewById(R.id.buttonEuro);
        buttonLibra = findViewById(R.id.buttonLibra);

        /*Para calcular o dolar*/
        buttonDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double valor;
                try{
                    valor = new Double(editValor.getText().toString());

                }catch (NumberFormatException e){
                    valor = 0;
                }
                /*double valor = Double.parseDouble(editValor.getText().toString());*/
                double resultado = valor * 0.1989;
                textResultado.setText("O valor em dolar é: " + resultado);

            }
        });
        /*Para calcular euro*/
        buttonEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double valor;
                try{
                    valor = new Double(editValor.getText().toString());

                }catch (NumberFormatException e){
                    valor = 0;
                }
                /*double valor = Double.parseDouble(editValor.getText().toString());*/
                double resultado = valor * 0.2001;
                textResultado.setText("O valor em euro é: " + resultado);


            }
        });
        /*Para calcular Libra*/
        buttonLibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double valor;
                try{
                    valor = new Double(editValor.getText().toString());

                }catch (NumberFormatException e){
                    valor = 0;
                }
                /*double valor = Double.parseDouble(editValor.getText().toString());*/
                double resultado = valor * 0.1751;
                textResultado.setText("O valor em libra é: " + resultado);
            }
        });


    }

}