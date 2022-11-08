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

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textResultado;
    /*private Button buttonDolar, buttonEuro, buttonLibra;*/
    private Spinner menu;
    String [] opcoes = {"Selecione uma moeda:","Dolar", "Euro", "Libra"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editValor = findViewById(R.id.editValores);
        textResultado = findViewById(R.id.textResultado);
        /*buttonDolar = findViewById(R.id.buttonDolar);
        buttonEuro = findViewById(R.id.buttonEuro);
        buttonLibra = findViewById(R.id.buttonLibra);*/
        menu = findViewById(R.id.menu);
        

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getApplicationContext(), R.layout.spinner_item, opcoes);
        menu.setAdapter(adapter);
        
        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                if(opcoes[position] == "Dolar"){
                double valor;
                try{
                    valor = new Double(editValor.getText().toString());

                }catch (NumberFormatException e){
                    valor = 0;
                }

                double resultado = valor * 0.1989;
                textResultado.setText("Resultado: " + resultado);

                }else if(opcoes[position] == "Euro"){
                    double valor;
                    try{
                        valor = new Double(editValor.getText().toString());

                    }catch (NumberFormatException e){
                        valor = 0;
                    }

                    double resultado = valor * 0.2001;
                    textResultado.setText("Resultado: " + resultado);

                }else if(opcoes[position] == "Libra"){
                    double valor;
                    try{
                        valor = new Double(editValor.getText().toString());

                    }catch (NumberFormatException e){
                        valor = 0;
                    }

                    double resultado = valor * 0.1751;
                    textResultado.setText("Resultado: " + resultado);

                }else{
                    textResultado.setText("Resultado: ");
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        /*Para calcular o dolar*/
        /*buttonDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double valor;
                try{
                    valor = new Double(editValor.getText().toString());

                }catch (NumberFormatException e){
                    valor = 0;
                }

                double resultado = valor * 0.1989;
                textResultado.setText("O valor em dolar é: " + resultado);

            }
        });*/
        /*Para calcular euro*/
        /*buttonEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double valor;
                try{
                    valor = new Double(editValor.getText().toString());

                }catch (NumberFormatException e){
                    valor = 0;
                }

                double resultado = valor * 0.2001;
                textResultado.setText("O valor em euro é: " + resultado);


            }
        });*/
        /*Para calcular Libra*/
        /*buttonLibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double valor;
                try{
                    valor = new Double(editValor.getText().toString());

                }catch (NumberFormatException e){
                    valor = 0;
                }

                double resultado = valor * 0.1751;
                textResultado.setText("O valor em libra é: " + resultado);
            }
        });*/


    }

}