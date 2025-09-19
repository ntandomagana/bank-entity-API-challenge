package com.example.BankEntity_API.repository;

import com.example.BankEntity_API.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
