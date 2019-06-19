package com.cg.pl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cg.bean.*;
import com.cg.dao.AccountDAOImpl;
import com.cg.exception.InsufficientFundException;
import com.cg.service.AccountService;
import com.cg.service.Gst;
import com.cg.service.Validator;

public class MyWallet {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		AccountService service = new AccountService();
		String choice="";
		while(true)
		{
		System.out.println("Menu");
		System.out.println("==================");
		System.out.println("1.Create new Account");
		System.out.println("2.Print all Accounts");
		System.out.println("3.Withdraw");
		System.out.println("4.Transfer");
		System.out.println("5.Deposit");
		System.out.println("6.exit");
		System.out.println("Enter Your Choice :");
		System.out.println("==================");
		choice = br.readLine();
		switch(choice)
		{
			case "1": int id=0;
							long mb=0L,mobileno=0L;
							String ah="";
							double bal=0.0,amt=0.0;
							//Accepting and validating input for Account number
							System.out.println("Enter Account Number");
							while(true)
							{
								String s_id=br.readLine();
								boolean ch1=Validator.validatedata(s_id, Validator.aidpattern);
								if(ch1==true)
								{
									try
									{
										id=Integer.parseInt(s_id);
										break;
									}
									catch(NumberFormatException e)
									{
										System.out.println("Account Number Must Be numeric. Re-enter!");
									}
								}
								else 
								{
									System.out.println("Re Enter Account Number in 3 digits");
								}
							}//end of account number while
							//Accepting and validating input for Mobile Number
							System.out.println("Enter mobile Number");
							while(true)
							{
								String s_mb=br.readLine();
								boolean ch1=Validator.validatedata(s_mb, Validator.mobilepattern);
								if(ch1==true)
								{
									try
									{
										mb=Long.parseLong(s_mb);
										break;
									}
									catch(NumberFormatException e)
									{
										System.out.println("Mobile number Must Be numeric. Re-enter!");
									}
								}
								else 
								{
									System.out.println("Re Enter Mobile Number in 10 digits");
								}
							}//end of mobile while
							////accepting and validating account holder() shouldnt be empty)
							System.out.println("Enter Account holders name");
							ah=br.readLine();
							//accepting and validating balance(first letter shouldnt be space,)
							System.out.println("Enter initial balance");
							String s_bal=br.readLine();
							bal=Double.parseDouble(s_bal);//typecasting
							Account ob=new Account(id,mb,ah,bal);
							boolean b = service.addAccount(ob);
							System.out.println("Successfully Added "+b);
							break;
			
			case "2":   Map<Long,Account> accmap=service.getAllAccounts();
							Collection<Account> vc = accmap.values();
							List<Account> acclist= new ArrayList<Account>(vc);
							Collections.sort(acclist);
							for(Account o :acclist)
							{
								System.out.println("===========================");
								System.out.println("Statement for Account No "+o.getAid());
								System.out.println("Account Holder "+o.getAccountholder());
								System.out.println("Mobile Number "+o.getMobile());
								System.out.println("Balance is =>"+o.getBalance());
								System.out.println("===========================");
							}
				            break;
				            
			case "3":	 System.out.println("Enter the mobile no from where you need to withdraw amount:");
								String idi = br.readLine();
								mobileno = Long.parseLong(idi);
								Account ao = service.findAccount(mobileno);
								
							 System.out.println("Enter the amount you want to withdraw:");
							 String iamt = br.readLine();
							 amt = Double.parseDouble(iamt);
							 		try {
							 				service.withdraw(ao, amt);
							 			} catch (InsufficientFundException e) {
							 					// TODO Auto-generated catch block
							 					System.out.println("insufficient fund");
							 			}
							 		break;
							 		
			case "4": System.out.println("Enter the mobile no from where you need to withdraw amount:");
							String idi1 = br.readLine();
							mobileno = Long.parseLong(idi1);
							Account ao1 = service.findAccount(mobileno);
							System.out.println("Enter the mobile no from where you need to Deposit amount:");
							String idi2 = br.readLine();
							mobileno = Long.parseLong(idi2);
							Account ao2 = service.findAccount(mobileno);
							System.out.println("Enter the amount:");
							String iamt1 = br.readLine();
							amt = Double.parseDouble(iamt1);
							service.transferMoney(ao1, ao2, amt);
//			try {
//				service.withdraw(ao1, amt);
//			} catch (InsufficientFundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//							service.deposit(ao2, amt);
							System.out.println("Successful Transfer!");
				break;
				
			case "5": System.out.println("Enter the mobile no from where you need to Deposite amount:");
							String idi3 = br.readLine();
								mobileno = Long.parseLong(idi3);
								Account ao3 = service.findAccount(mobileno);
									System.out.println("Enter the amount you want to Deposite:");
									String iamt2 = br.readLine();
									amt = Double.parseDouble(iamt2);
									
									service.deposit(ao3, amt);
									break;
			
			case "6":   System.out.println("Exiting Program Thank You! :)");
							System.exit(0);
							break;
				
			default:
				System.out.println("Please Enter A Valid Number!!!");
		}
}
}
}














//AccountService service = new AccountService();
//SavingAccount ob2= new SavingAccount(105,2243432,"Manjiri",55000.00);
//
//service.printStatement(ob2);//calling default method of transaction
//double b1=0.0;
//
//try {
//b1=service.withdraw(ob2, 55000.00);
//System.out.println("After withdraw balance is"+b1);
//}
//catch(InsufficientFundException e)
//{
//	//System.err.println(e.getMessage());
//	System.err.println(e);
//}
//
//double tax=service.calculateTax(Gst.PCT_5, b1);
//System.out.println("Gst is :"+tax);
