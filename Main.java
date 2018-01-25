package com.softwarethatperforms;

public class Main {

    public static void main(String[] args) {
	BankAccount tom = new BankAccount("12345", 0.00, "Tom", "test@yahoo.com", "123-345-4567");
	BankAccount hana = new BankAccount("45454", 100.00, "Hana", "test@gmail.com", "666-777-7894");
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


    }
}
