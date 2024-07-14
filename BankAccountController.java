package com.example.bankapi.controller;

import com.example.bankapi.model.BankAccount;
import com.example.bankapi.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accounts")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping
    public List<BankAccount> getAllAccounts() {
        return bankAccountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Optional<BankAccount> getAccountById(@PathVariable Long id) {
        return bankAccountService.getAccountById(id);
    }

    @PostMapping
    public BankAccount createAccount(@RequestBody BankAccount account) {
        return bankAccountService.createAccount(account);
    }

    @PutMapping("/{id}")
    public BankAccount updateAccount(@PathVariable Long id, @RequestBody BankAccount accountDetails) {
        return bankAccountService.updateAccount(id, accountDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        bankAccountService.deleteAccount(id);
    }
}
