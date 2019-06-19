package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public Employee selectInsurance(Employee e);
	public default void printStatement(Employee e)
	{
		System.out.println("======================================");
		System.out.println("Employee Name:"+e.getName());
		System.out.println("Employee Id:"+e.getId());
		System.out.println("Employee salary:"+e.getSalary());
		System.out.println("Employee Designation:"+e.getDesignation());
		
		System.out.println("Employee Allocated Insurance Scheme:"+e.getInsuranceScheme());
		System.out.println("======================================");
	}

}
