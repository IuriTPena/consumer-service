package com.cognizant.consumer.service;

import com.cognizant.consumer.domain.Account;
import com.cognizant.consumer.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public Account mongoCreate(final Account account) {
        consumerRepository.insert(account);

        return account;
    }

    public void setRepo(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

}
