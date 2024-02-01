package com.tnsif.day11.Interface;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank;
		bank=new BankImplentation();
		Account account=new Account(123456, "Mihir", 155000, bank);
		System.out.println(account);
		bank.withdraw(account, 2000);
		bank.deposit(account, 10000);
		account.deposit(4000);
	}

}
