package com.eshop.sales.serviceapi;

import com.eshop.sales.model.Account;

public interface AccountService {

    /**
     * Finds the account with the provided account number.
     * 
     * @param number The account number
     * @return The account
     * @throws AccountNotFoundException If no such account exists.
     */
    Account findOne(String number) throws AccountNotFoundException;

    /**
     * Creates a new account.
     * 
     * @param number
     * @return created account
     */
    Account createAccountByNumber(String number);
}
