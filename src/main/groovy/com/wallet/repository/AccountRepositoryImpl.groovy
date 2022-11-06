package com.wallet.repository

import com.wallet.model.Account
import com.wallet.mongorepository.AccountMongoRepository
import jakarta.inject.Singleton
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Singleton
class AccountRepositoryImpl implements AccountRepository {

    AccountMongoRepository repository

    AccountRepositoryImpl(AccountMongoRepository repository) {
        this.repository = repository
    }

    @Override
    Mono<Account> upsertAccount(Account account) {
        repository.save(account)
    }

    @Override
    Flux<Account> getAccounts() {
        return null
    }

    @Override
    Mono<Account> getAccount(long id) {
        return null
    }
}