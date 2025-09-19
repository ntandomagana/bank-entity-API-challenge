package com.example.BankEntity_API.services;

import com.example.BankEntity_API.models.BankAccount;

import java.util.List;

public interface BankAccountService {
     BankAccount createAccount(BankAccount account);

     BankAccount getAccountById(Long id);

     BankAccount updateAccount(Long id, BankAccount account);

     List<BankAccount> getAllAccounts();
}
