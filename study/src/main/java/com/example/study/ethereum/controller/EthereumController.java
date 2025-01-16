package com.example.study.ethereum.controller;

import com.example.study.ethereum.controller.dto.EthereumPriceResponse;
import com.example.study.ethereum.service.EthereumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ethereum")
@RequiredArgsConstructor
@Slf4j
public class EthereumController {

    @Autowired
    private final EthereumService ethereumService;

    @PostMapping("/price")
    public ResponseEntity<EthereumPriceResponse> getEthereumPrice() {
        EthereumPriceResponse response = ethereumService.getEthereumPrice();
        return ResponseEntity.ok(response);
    }
}
