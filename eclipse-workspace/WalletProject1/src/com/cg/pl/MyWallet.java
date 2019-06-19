package com.cg.pl;
import com.cg.bean.*;

public class MyWallet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob=new Account(100,1112345678,"king",10000.00);
		System.out.println(ob);
		double b1 = ob.withdraw(2000.00);
		System.out.println(b1);
		
		SavingAccount ob1=new SavingAccount(101,1112345679,"Raja",25000.00);
		ob1.setInterest();
		System.out.println(ob1);
		b1 = ob1.withdraw(24000.00);
		System.out.println(b1);

	}

}
