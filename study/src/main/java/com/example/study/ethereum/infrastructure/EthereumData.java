package com.example.study.ethereum.infrastructure;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EthereumData {

    private static final String COINGECKO_API_URL = "https://api.coingecko.com/api/v3/simple/price?ids=ethereum&vs_currencies=usd";
    public static final String ETHEREUM = "ethereum";
    public static final String $ = "usd";

    @Autowired
    private RestTemplate restTemplate;

    public double getEthereumPrice() {
        String response = restTemplate.getForObject(COINGECKO_API_URL, String.class);
        JSONObject jsonResponse = new JSONObject(response);
        return jsonResponse.getJSONObject(ETHEREUM).getDouble($);
    }
}
