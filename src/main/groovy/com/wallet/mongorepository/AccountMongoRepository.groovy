package com.wallet.mongorepository

import com.wallet.model.Account
import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository

@MongoRepository
interface AccountMongoRepository extends ReactiveStreamsCrudRepository<Account, Long> {

}