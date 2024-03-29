package com.tnsif.day7.inheritance;

public class SBIBank extends RBIBank{
	private int AccountNo;
	private float AccountBalance;
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	public float getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		AccountBalance = accountBalance;
	}
	
	public SBIBank() {
		System.out.println();
	}
	public SBIBank(String AccountName, int AccountId,int accountNo, float accountBalance) {
		super(AccountName,AccountId);
		AccountNo = accountNo;
		AccountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "SBIBank [AccountNo=" + AccountNo + ", AccountBalance=" + AccountBalance + ", getAccountName()="
				+ getAccountName() + ", getAccountId()=" + getAccountId() + "]";
	}
}
