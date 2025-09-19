package com.example.BankEntity_API.repository;

import com.example.BankEntity_API.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for BankAccount entity.
 * Provides CRUD operations on BankAccount table.
 */

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
