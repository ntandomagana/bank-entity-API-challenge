package com.example.BankEntity_API.services;

import com.example.BankEntity_API.models.BankAccount;

import java.util.List;

/**
 * Service interface for BankAccount.
 * Declares methods to manage bank accounts.
 */

public interface BankAccountService {

    /**
     * Creates a new bank account.
     *
     * @param account BankAccount object with details
     * @return The saved BankAccount
     */
    BankAccount createAccount(BankAccount account);

    /**
     * Retrieves a bank account by its ID.
     *
     * @param id ID of the bank account
     * @return BankAccount if found, otherwise null
     */
     BankAccount getAccountById(Long id);

    /**
     * Updates an existing bank account.
     *
     * @param id ID of the bank account to update
     * @param account BankAccount object with updated data
     * @return Updated BankAccount if successful, otherwise null
     */

     BankAccount updateAccount(Long id, BankAccount account);

    /**
     * Retrieves all bank accounts.
     *
     * @return  a list of all BankAccount objects that exist
     */
     List<BankAccount> getAllAccounts();
}
