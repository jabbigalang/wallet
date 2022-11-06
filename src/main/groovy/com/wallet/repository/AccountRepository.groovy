package com.wallet.repository

import com.wallet.model.Account
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface AccountRepository {

    Mono<Account> upsertAccount(Account account)

    Flux<Account> getAccounts()

    Mono<Account> getAccount(long id)
}