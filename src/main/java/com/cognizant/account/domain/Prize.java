package com.cognizant.account.domain;

import java.io.Serializable;

public class Prize implements Serializable {
    private Long id;
    private Integer value;
    private Account account;

    public Prize() {
    }

    public Prize(Integer value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Prize{" +
                "id=" + id +
                ", value=" + value +
                ", account=" + account +
                '}';
    }
}
