package com.Example;

public class AccountMain {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.setAccountDetails("Rahul", 123456, 5000);
		System.out.println(acc.getAccountDetails());

	}

}
