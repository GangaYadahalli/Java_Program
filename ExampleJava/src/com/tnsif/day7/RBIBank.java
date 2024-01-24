package com.tnsif.day7;

public class RBIBank {
	private String AccountName;
	private int AccountId;
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public int getAccountId() {
		return AccountId;
	}
	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	public RBIBank() {
		System.out.println();
	}
	
	public RBIBank(String accountName, int accountId) {
		AccountName = accountName;
		AccountId = accountId;
	}
	@Override
	public String toString() {
		return "RBIBank [AccountName=" + AccountName + ", AccountId=" + AccountId + "]";
	}
}
