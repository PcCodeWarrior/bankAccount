package com.softwarethatperforms;

public class Main {

    public static void main(String[] args) {
        BankAccount tom = new BankAccount("12345", 0.00, "Tom", "test@yahoo.com", "123-345-4567");
        BankAccount hana = new BankAccount("45454", 100.00, "Hana", "test@gmail.com", "666-777-7894");
        BankAccount pam = new BankAccount("999", 25.00, "Pam", "hello@me.com", "123-123-1234");
        tom.deposit(100);
        tom.deposit(50);
        tom.withdraw(75);
        System.out.println(tom.getBalance());
        hana.deposit(10);
        System.out.println(hana.getBalance());
        hana.deposit(10);
        hana.withdraw(2);
        hana.deposit(10);
        System.out.println(hana.getBalance());
        pam.withdraw(5);
        System.out.println(pam.getBalance());


        VipCustomer mike = new VipCustomer("TS", 1000.00, "test@email.com");
        System.out.println(mike.getName() + " " + mike.getCreditLimit() + " " + mike.getEmail());
        VipCustomer john = new VipCustomer("HS", 100.00);
        System.out.println(john.getName() + " " + john.getCreditLimit() + " " + john.getEmail());
        VipCustomer daniel = new VipCustomer();
        System.out.println(daniel.getName() + " " + daniel.getCreditLimit() + " " + daniel.getEmail());
    }
}
