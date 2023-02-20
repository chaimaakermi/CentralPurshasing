package tn.esprit.centraleachat.devisses;

import java.io.*;

import okhttp3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
@RequestMapping("/currency-converter")

public class CurrencyConverterController {
    private static final String API_KEY = "Ha2F8dPoX9oxiwRhFUo8IOayTjMKnX5m\n";
    private static final String API_URL = "https://api.exchangeratesapi.io/latest";

    @GetMapping("/convert")
    public double convertCurrency(@RequestParam String from, @RequestParam String to, @RequestParam double amount) {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder()
                .url("https://api.apilayer.com/exchangerates_data/convert?to="+from+"&from="+to+"&amount="+amount)
                .addHeader("apikey", "Ha2F8dPoX9oxiwRhFUo8IOayTjMKnX5m")
                .method("GET", null)
                .build();
        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }




        return 0;
    }
}


