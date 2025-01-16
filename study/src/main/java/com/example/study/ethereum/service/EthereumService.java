package com.example.study.ethereum.service;

import org.springframework.stereotype.Service;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Service
public class EthereumService {

    public static final String ETHEREUM_URL = "https://mainnet.infura.io/v3/f344d031dccc418d8f9157e9a4190e1c";
    private final Web3j web3j;

    public EthereumService() {
        this.web3j = Web3j.build(new HttpService(ETHEREUM_URL));
    }

    public void testConnection() throws Exception {
        String chainId = web3j.ethChainId().send().getChainId().toString();
        System.out.println("연결되었습니다.: " + chainId);
    }
}
