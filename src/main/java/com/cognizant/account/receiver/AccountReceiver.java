package com.cognizant.account.receiver;

import com.cognizant.account.domain.Account;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AccountReceiver {

    private int accountCounter = 1;

//	MongoClient mongoClient = new MongoClient();
//	MongoDatabase database = mongoClient.getDatabase("accounts");
//	MongoCollection<Account> collection = database.getCollection("information");

    @JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
    public void receiveMessage(Account account) {
        String accountMessage = "<" + accountCounter + "> Received1 <" + account + ">";
        System.out.println(accountMessage);
        accountCounter++;
    }
}
