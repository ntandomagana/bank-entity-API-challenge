package com.example.BankEntity_API.controllers;

import com.example.BankEntity_API.models.BankAccount;
import com.example.BankEntity_API.services.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
public class BankAccountController {

    private final BankAccountService service;

    public BankAccountController(BankAccountService service) {
        this.service = service;
    }

    @PostMapping
    public BankAccount createAccount(@RequestBody BankAccount bankAccount) {
        return service.createAccount(bankAccount);
    }

    @GetMapping("/{id}")
    public BankAccount getAccount(@PathVariable Long id) {
        return service.getAccountById(id);
    }

    @GetMapping
    public List<BankAccount> getAllAccounts() {
        return service.getAllAccounts();
    }

    @PutMapping("/{id}")
    public BankAccount updateAccount(@PathVariable Long id, @RequestBody BankAccount account) {
        return service.updateAccount(id, account);
    }
}
