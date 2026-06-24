package gr.aueb.cf.ch18.bankapp_mysql.bankapp.model;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Model Entity
 */
public class Account {
    private BigDecimal balance;
    private String iban;

  public Account() {

  }
    public Account(String iban , BigDecimal balance) {
        this.balance = balance;
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "IBAN: " + iban + "Balance: " + balance;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return Objects.equals(getIban(), account.getIban());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBalance(), getIban());
    }
}
