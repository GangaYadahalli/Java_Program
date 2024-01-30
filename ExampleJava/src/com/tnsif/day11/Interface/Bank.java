package com.tnsif.day11.Interface;

public interface Bank {
	double minBalance=1000;
	double depositLimit=25000;
	double intersetRate=7.8;
	void deposit(Account account, double amount);//all methods are abstract no need to specify with abstract keyword
	void withdraw(Account account,double amount);

}
