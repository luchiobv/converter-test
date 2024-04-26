package com.converterChallenge.jsonData;

import com.converterChallenge.Menu.Menu;
import com.converterChallenge.Model.Exchange;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {



    Menu conv = new Menu();
    String address = "https://v6.exchangerate-api.com/v6/8142735e21e6df86291da7b5/pair/" + conv.money;
    private Object baseCurrency;

    public Object conectionExchange(String baseCurrency, String targetCurrency, String rate, String moneyExchange) {

        HttpResponse<String> response = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);
            // Gson gson = new GsonBuilder()
            //        .setFieldNamingPolicy(FieldNamingPolicy
            //        .UPPER_CAMEL_CASE)
            //        .setPrettyPrinting()
            //        .create();

            // ExchangeApi exchangeApi = gson.fromJson(json, ExchangeApi.class);
            //System.out.println(exchangeApi);


        } catch (Exception e) {
        }
        return new Gson().fromJson(response.body(), Exchange.class);

    }


}
