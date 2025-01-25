package OOP.Lesson4.Homework.Example;

import java.math.BigDecimal;

public class BankAccount {
    private String fullName;
    private BigDecimal balance;
    private String customerID;

    public BankAccount(String fullName, BigDecimal balance, String customerID) {
        this.fullName = fullName;
        this.balance = balance;
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", customerID='" + customerID + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
