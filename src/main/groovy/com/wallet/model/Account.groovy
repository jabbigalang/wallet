package com.wallet.model

import groovy.transform.builder.Builder
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@Builder
@MappedEntity
class Account {
    @Id
    long id
    String name
    String description
    List<Wallet> wallets
}
