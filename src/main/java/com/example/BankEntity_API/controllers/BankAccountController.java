package com.example.BankEntity_API.controllers;

import com.example.BankEntity_API.models.BankAccount;
import com.example.BankEntity_API.services.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for BankAccount API.
 * Handles HTTP requests related to bank accounts.
 */

@RestController
@RequestMapping("/api/v1/accounts")
public class BankAccountController {

    private final BankAccountService service;

    public BankAccountController(BankAccountService service) {
        this.service = service;
    }

    /**
     * this method creates a new bank account.
     *
     * @param bankAccount BankAccount object from request body
     * @return the created BankAccount
     */
    @PostMapping
    public BankAccount createAccount(@RequestBody BankAccount bankAccount) {
        return service.createAccount(bankAccount);
    }

    /**
     * Retrieves a bank account by ID.
     *
     * @param id ID of the bank account
     * @return BankAccount object if found
     */
    @GetMapping("/{id}")
    public BankAccount getAccount(@PathVariable Long id) {
        return service.getAccountById(id);
    }

    /**
     * Retrieves all bank accounts.
     *
     * @return List of BankAccount objects
     */
    @GetMapping
    public List<BankAccount> getAllAccounts() {
        return service.getAllAccounts();
    }

    @PutMapping("/{id}")
    public BankAccount updateAccount(@PathVariable Long id, @RequestBody BankAccount account) {
        return service.updateAccount(id, account);
    }
}
