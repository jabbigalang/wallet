package com.wallet.controller

import com.wallet.model.Account
import com.wallet.service.AccountService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Controller("/accounts")
@Produces(MediaType.APPLICATION_JSON)
class AccountController {

    AccountService accountService

    AccountController(AccountService accountService) {
        this.accountService = accountService
    }

    @Get
    Flux<Account> getAccounts() {
        accountService.getAccounts()
    }

    @Get("/{id}")
    Mono<Account> getAccount(long id) {
        accountService.getAccount(id)
    }

    @Get
    Mono<Account> upsertAccount(@Body Account account) {
        accountService.upsertAccount(account)
    }

}
