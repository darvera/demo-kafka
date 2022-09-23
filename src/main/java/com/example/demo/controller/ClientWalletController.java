package com.example.demo.controller;

import com.example.demo.consumer.ClientWallet;
import com.example.demo.service.ClientWalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;}

@Slf4j
@RestController
@RequestMapping("/api/ClientWallet")
public class ClientWalletController {
    @Autowired
    private ClientWalletService clientWalletService;

}
