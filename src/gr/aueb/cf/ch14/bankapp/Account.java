package gr.aueb.cf.ch14.bankapp;

import java.time.LocalDateTime;
import java.util.Objects;

public class Account {
    private long id;
    private String accountNumber;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(long id, String accountNumber, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API - Contract

    /**
     * Deposit a specific amount of money into the account.
     *
     * @param amount    the amount of money to be deposited, must be positive.
     * @throws NegativeAmountException if the amount is negative.e.
     */
    public void deposit(double amount) throws NegativeAmountException{
        try {
           if (amount < 0) {
               throw new NegativeAmountException("Amount must be positive");
           }
           balance += amount;
           //audit trail: who, when, what, initial balance, resulting balance
        }
        catch (NegativeAmountException e) {
            System.err.printf("Negative amount = %f is not allowed. \n%s\n",amount, e.getMessage());
            throw e;
        }
    }

    /**
     * Withdraw a specific amount of money from the account.
     *
     * @param amount
     *              the amount of money to withdraw.
     * @param ssn
     *              the ssn of the account holder, must match the account holder's ssn.
     * @throws NegativeAmountException
     *          if the amount is negative.
     * @throws SsnNotValidException
     *          if the ssn does not match the account holder's ssn.*
     * @throws InsufficientBalanceException
     *          if the balance is not sufficient to cover the withdrawal amount.
     */
    public void withdraw(double amount, String ssn)throws NegativeAmountException, SsnNotValidException, InsufficientBalanceException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException("The amount = " + amount + " must not be negative");
            }
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException("SSN does not match account holder's SSN");
            }
            if (balance < amount) {
                throw new InsufficientBalanceException("The balance = " + balance + " is not sufficient");
            }
            balance -= amount;
            //audit trail :who, when, what, initial balance , resulting balance
        }
        catch (NegativeAmountException | SsnNotValidException | InsufficientBalanceException e) {
            System.err.printf(LocalDateTime.now() + ": Withdrawal  failed. \n%s\n", e.getMessage());     //Logging
            throw e;
        }


    }

    //Design - Delegation

    /**
     * Get the account balance.
     * @return  the account balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    private boolean isSsnValid(String ssn) {
        //return this.ssn.equals(ssn);    //not null safe
        return Objects.equals(this.ssn, ssn);   //null safe
    }
}
