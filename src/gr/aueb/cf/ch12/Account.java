package gr.aueb.cf.ch12;

import java.util.Objects;

public class Account {
    private long id;
    private String accountNumber;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account () {

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
     * @throws Exception if the amount is negative.
     */
    public void deposit(double amount) throws Exception{
        try {
           if (amount < 0) {
               throw new IllegalArgumentException("Amount must be positive");
           }
           balance += amount;
           //audit trail: who, when, what, initial balance, resulting balance
        }
        catch (Exception e) {
            System.err.printf("Negative amount = %f is not allowed. \n%s\n",amount, e.getMessage());
            throw e;
        }
    }

    /**
     * Withdraw a specific amount of money from the account.
     * @param amount    the amount of money to be withdrawn, must be positive and less than or equal to the current balance.
     * @param ssn       the SSN of the account holder.
     * @throws Exception if the amount is negative, the SSN does not match, or there are insufficient funds.
     */
    public void withdraw(double amount, String ssn)throws Exception {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            if (!isSsnValid(ssn)) {
                throw new IllegalArgumentException("SSN does not match account holder's SSN");
            }
            if (balance < amount) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            balance -= amount;
            //audit trail :who, when, what, initial balance , resulting balance
        }
        catch (Exception e) {
            System.err.printf("Withdrawal of amount %f failed. \n%s\n",amount, e.getMessage());
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
