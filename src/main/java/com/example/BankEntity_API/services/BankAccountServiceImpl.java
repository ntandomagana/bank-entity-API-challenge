package com.example.BankEntity_API.services;

import com.example.BankEntity_API.models.BankAccount;
import com.example.BankEntity_API.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of BankAccountService interface.
 * Handles business logic for bank accounts.
 */
@Service
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountServiceImpl(BankAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public BankAccount createAccount(BankAccount bankAccount) {
        bankAccount.setId(null);
        return repository.save(bankAccount);
    }

    @Override
    public BankAccount getAccountById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<BankAccount> getAllAccounts() {
        return repository.findAll();
    }

    @Override
    public BankAccount updateAccount(Long id, BankAccount bankAccount) {
        BankAccount existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setAccountHolderName(bankAccount.getAccountHolderName());
            existing.setAccountType(bankAccount.getAccountType());
            existing.setAccountBalance(bankAccount.getAccountBalance());
            return repository.save(existing);
        }
        return null;
    }

}
