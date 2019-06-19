package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeMain implements EmployeeService{

	@Override
	public Employee selectInsurance(Employee e) {
		String insuranceScheme = null;
		String tempDes = e.getDesignation();
		if((e.getSalary()>5000) && (e.getSalary()<20000) && (tempDes.equals("SystemAssociate")))
		{
			insuranceScheme = "Scheme C";
		}
		else if((e.getSalary()>20000) && (e.getSalary()<40000 ) && (tempDes.equals("Programmer")))
		{
			insuranceScheme = "Scheme B";
		}
		else if((e.getSalary()>=40000) && (tempDes.equals("Manager")))
		{
			insuranceScheme = "Scheme A";
		}
		else if((e.getSalary()<5000) && (tempDes.equals("Clerk")))
		{
			insuranceScheme = "No Scheme";
		}
		else
			insuranceScheme = "Invalid";
		
		e.setInsuranceScheme(insuranceScheme);
		return e;
	}
}
