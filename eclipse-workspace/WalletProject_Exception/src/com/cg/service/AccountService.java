package com.cg.service;

import com.cg.bean.Account;
import com.cg.exception.InsufficientFundException;

public class AccountService implements Gst,Transaction{

	@Override
	public double withdraw(Account ob, double amount) throws InsufficientFundException {
			// TODO Auto-generated method stub
			double new_balance=ob.getBalance()-amount;
			if(new_balance < 1000)
			{
				new_balance=ob.getBalance();
				//System.out.println("Insufficient Balance");
				//throw new RuntimeException("Insufficient Fund. Cannot Process Withdrawal");
				throw new InsufficientFundException("Insufficient Fund. Cannot Process Withdrawal",new_balance);
			}
			ob.setBalance(new_balance);
			return new_balance;
		
	}

	@Override
	public double deposit(Account ob, double amount) {
		// TODO Auto-generated method stub
		return ob.getBalance()+amount;
	}

	@Override
	public double transferMoney(Account from, Account to, double amount) {
		if(from.getBalance() < 1000.00)
		{
		from.setBalance(from.getBalance()-amount);
		to.setBalance(to.getBalance()+amount);
		return to.getBalance();
		}
		else
			System.out.println("Insufficient balance");
		return 0.00;
	}

	@Override
	public double calculateTax(double PCT, double amount) {
		// TODO Auto-generated method stub
		return amount*Gst.PCT_5;
	}

}
