package com.cg.eis.pl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeMain;

public class Main {

	public static void main(String[] args) {
		EmployeeMain empm = new EmployeeMain();
		
//		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//		String choice="";
//		while(true)
//		{
//		System.out.println("Menu");
//		System.out.println("==================");
//		System.out.println("1.Create new Account");
//		System.out.println("2.Print all Accounts");
//		System.out.println("3.exit");
//		System.out.println("Enter Your Choice :");
//		System.out.println("==================");
//		choice = br.readLine();
//		switch(choice)
//		{
//			case "1":
//				break;
//			case "2":
//				break;
//			case "3": 	System.out.println("Exiting Program Thank You! :)");
//							System.exit(0);
//							break;
//			default:
//				System.out.println("Please Enter A Valid Number!!!");
//		}
		
		Employee e = new Employee(100,"Shashank",21000,"Programmer");
		System.out.println(e);
		//String instype = empm.selectInsurance(e);
		
		//System.out.println(instype);
		empm.printStatement(e);
		
		

	}

}
