package com.example.convertermoedas;

import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SegundoPlano {


    protected String doInBackgorund(Void... voids) {
        /*método para chamar a url de cotações em tempo real*/
        StringBuilder cotacoes = new StringBuilder();
        try {
            URL urlcotacoes = new URL("https://economia.awesomeapi.com.br/:moeda/:quantidade");
            HttpURLConnection conexao = (HttpURLConnection) urlcotacoes.openConnection();
            conexao.setRequestMethod("GET");
            conexao.setRequestProperty("content-type", "application/json");
            conexao.setDoOutput(true);
            conexao.setConnectTimeout(5000);
            conexao.connect();

            Scanner scanner = new Scanner(urlcotacoes.openStream());
            while (scanner.hasNext()) {
                cotacoes.append(scanner.next());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cotacoes.toString();
    }

}
