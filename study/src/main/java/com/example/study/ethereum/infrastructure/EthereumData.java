package com.example.study.ethereum.infrastructure;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EthereumData {

    private static final String COINGECKO_API_URL = "https://api.coingecko.com/api/v3/simple/price?ids=ethereum&vs_currencies=usd";

    @Autowired
    private RestTemplate restTemplate;

    public void getEthereumPrice() {
        String response = restTemplate.getForObject(COINGECKO_API_URL, String.class);
        JSONObject jsonResponse = new JSONObject(response);

        double ethereumPrice = jsonResponse.getJSONObject("ethereum").getDouble("usd");
        System.out.println("이더리움 가격은 : " + ethereumPrice + " USD");
    }
}
