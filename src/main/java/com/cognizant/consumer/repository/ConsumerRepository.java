package com.cognizant.consumer.repository;

import com.cognizant.consumer.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConsumerRepository extends MongoRepository<Account, String> {
}