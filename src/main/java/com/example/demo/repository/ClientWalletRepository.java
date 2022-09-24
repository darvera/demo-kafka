package com.example.demo.repository;

import com.example.demo.model.ClientWallet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ClienWalletRepository extends ReactiveMongoRepository<ClientWallet, String> {
    Flux<ClientWallet> findByAuthorAndDeleteIsFalse(String titleKeyword);
    Mono<ClientWallet> findByIdAndDeleteIsFalse(String id);
}
