package com.example.demo.service;

import com.example.demo.model.ClientWallet;
import com.example.demo.repository.ClienWalletRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientWalletServiceImpl  implements  ClientWalletService{

    private ClientWallet

    @Override
    public Mono<ClientWallet> createClientWallet(ClientWallet blog) {
        return null;
    }

    @Override
    public Mono<ClientWallet> updateBlog(ClientWallet blog, String id) {
        return null;
    }

    @Override
    public Flux<ClientWallet> findAll() {
        return null;
    }

    @Override
    public Mono<ClientWallet> findOne(String id) {
        return null;
    }

    @Override
    public Flux<ClientWallet> findByTitle(String title) {
        return null;
    }

    @Override
    public Mono<Boolean> delete(String id) {
        return null;
    }
}
