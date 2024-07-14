package com.example.bankapi.service;

import com.example.bankapi.model.BankAccount;
import com.example.bankapi.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public List<BankAccount> getAllAccounts() {
        return bankAccountRepository.findAll();
    }

    public Optional<BankAccount> getAccountById(Long id) {
        return bankAccountRepository.findById(id);
    }

    public BankAccount createAccount(BankAccount account) {
        return bankAccountRepository.save(account);
    }

    public BankAccount updateAccount(Long id, BankAccount accountDetails) {
        Optional<BankAccount> optionalAccount = bankAccountRepository.findById(id);
        if (optionalAccount.isPresent()) {
            BankAccount account = optionalAccount.get();
            account.setAccountNumber(accountDetails.getAccountNumber());
            account.setAccountHolderName(accountDetails.getAccountHolderName());
            account.setBalance(accountDetails.getBalance());
            return bankAccountRepository.save(account);
        } else {
            return null;
        }
    }

    public void deleteAccount(Long id) {
        bankAccountRepository.deleteById(id);
    }
}
