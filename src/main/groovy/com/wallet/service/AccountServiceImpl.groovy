package com.wallet.service

import com.wallet.mongorepository.AccountMongoRepository
import com.wallet.model.Account
import jakarta.inject.Singleton
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Singleton
class AccountServiceImpl implements AccountService {

    AccountMongoRepository accountRepository

    AccountServiceImpl(AccountMongoRepository accountRepository) {
        this.accountRepository = accountRepository
    }

    @Override
    Flux<Account> getAccounts() {
        null
    }

    @Override
    Mono<Account> getAccount(long id) {
        Mono.just(Account.builder().id(100).name("Chrisen").description("Chrisen Account").build())
    }

    @Override
    Mono<Account> upsertAccount(Account account) {
        accountRepository.save(account)
    }

}
