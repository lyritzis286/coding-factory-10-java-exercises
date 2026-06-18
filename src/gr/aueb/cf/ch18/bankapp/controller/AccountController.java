package gr.aueb.cf.ch18.bankapp.controller;

import gr.aueb.cf.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.ch18.bankapp.service.IAccountService;
import gr.aueb.cf.ch18.bankapp.validation.Validator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance)
            throws ValidationException , NegativeAmountException {

        // Data binding
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // Validation
        Map<String, String> errors = Validator.validateInsertDTO(insertDTO);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // 2. Service Call
        readOnlyDTO = accountService.createNewAccount(insertDTO);

        // Dummy Data
//        readOnlyDTO = new AccountReadOnlyDTO(iban, balance);
        return readOnlyDTO;
    }

    public void deposit(String iban, BigDecimal amount)
            throws AccountNotFoundException,ValidationException, NegativeAmountException {

        //Data Binding
        AccountDepositDTO depositDTO = new AccountDepositDTO(iban, amount);

        //Validation
        Map<String, String> errors = Validator.validateDepositDTO(depositDTO);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // Service Call
        accountService.deposit(depositDTO);
    }

    public void withdraw(String iban, BigDecimal amount)
            throws ValidationException, AccountNotFoundException, InsufficientBalanceException, NegativeAmountException {
        //Data binding

        AccountWithdrawDTO withdrawDTO = new AccountWithdrawDTO(iban, amount);
        // 1. Validation
        Map<String, String> validationErrors = Validator.validateWithdrawDTO(withdrawDTO, accountService.getBalance(iban));
        if (!validationErrors.isEmpty()) {
            throw new ValidationException(validationErrors.toString());
        }
        Map<String,String> balanceErrors = Validator.validateWithdrawBalance(withdrawDTO, accountService.getBalance(iban));
        if (!balanceErrors.isEmpty()) {
            throw new InsufficientBalanceException(balanceErrors.toString());
        }


        // Service Call
        accountService.withdraw(withdrawDTO);
    }

    public BigDecimal getBalance(String iban) throws ValidationException, AccountNotFoundException {

        //Validation
        Map<String, String> errors = Validator.validateIban(iban);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }
        // Service Call
        return accountService.getBalance(iban);
    }

    public List<AccountReadOnlyDTO> getAllAccounts() {
        // Service Call
        return accountService.getAllAccounts();
    }
}