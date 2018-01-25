package com.softwarethatperforms;

public class BankAccount {
    private String  accountNumber;
    private double  balance;
    private String  customerName;
    private String  email;
    private String  phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    // Setters *********************************
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters **********************************
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void  deposit(double amount){
        this.balance+= amount;
    }

    public void withdraw(double amount){
        if(this.balance>=amount){
            this.balance-=amount;
        }
    }

}
