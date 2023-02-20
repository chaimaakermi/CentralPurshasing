package tn.esprit.centraleachat.controller;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


import org.springframework.web.bind.annotation.RestController;

@RestController
//36176|THEbd^~a5WAgTrhuXGzSP4D76SfxH71e
public class CurrencyConversionController {
    private static final String API_KEY = "36176|THEbd^~a5WAgTrhuXGzSP4D76SfxH71e";
    private static final String API_BASE_URL = "https://api.devises.zone/v1/exchangerates";

    private OkHttpClient httpClient = new OkHttpClient();

    @GetMapping("/exchange-rate")
    public String getExchangeRate() throws Exception {
        String url = API_BASE_URL + "?source=USD&target=EUR&apiKey=" + API_KEY;
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Unexpected code " + response);
            return response.body().string();
        }
    }
}
