package com.example.demo.service;

import com.example.demo.model.ClientWallet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientWalletService {
    Mono<ClientWallet> createClientWallet(ClientWallet blog);

    Mono<ClientWallet> updateBlog(ClientWallet blog, String id);

    Flux<ClientWallet> findAll();

    Mono<ClientWallet> findOne(String id);

    Flux<ClientWallet> findByTitle(String title);

    Mono<Boolean> delete(String id);
}
