package com.wallet.service

import com.wallet.model.Account
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface AccountService {
    Flux<Account> getAccounts()

    Mono<Account> getAccount(long id)

    Mono<Account> upsertAccount(Account account)
}