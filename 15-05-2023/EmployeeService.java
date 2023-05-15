package com.emp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.emp.entity.Address;
import com.emp.entity.Employee;
import com.emp.exceptions.GlobalException;

public class EmployeeService {
	
	Scanner sc = new Scanner(System.in);
	public List<Employee> employee = new ArrayList<Employee>();
	
	// method to add employee details in array list
	public void addEmployee(int empId,String empName,double empSal,String city,String country)
	{
		
		Address add = new Address(city,country);
	
		employee.add(new Employee(empId, empName, empSal, add));
		
	}
	
	public void addEmp(Employee emp)
	{
		employee.add(emp);
	}
	
	public int lengthOfList()
	{
		return employee.size();
	}
	
	
	// method to display employee details using id
	
	public Employee displayEmpById(int id) throws GlobalException{
		boolean flag = false;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId() == id)
			{
				System.out.println("Employee ID : "+employee.get(i).getEmpId());
				
				flag = true;
				return employee.get(i);
			}
		}
		if(flag!= true)
		{
			throw new GlobalException("Employee Id not found");
		}
		return null;
	}
	
	// method to delete employee details using id
	
	public boolean deleteEmployeeById(int id) throws GlobalException
	{
		boolean flag = false;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId() == id)
			{
				employee.remove(i);
				flag = true;
				return flag;
			}
		}
		
		if(flag == false)
		{
			throw new GlobalException("Employee Id not found");
		}
		return flag;
	}
	
	// method to update emoployee details by id
	
	public void updateEmployeeById(int id ) throws GlobalException
	{
		boolean flag = false;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId() == id)
			{
				System.out.println("Enter id :");
				int id1 = sc.nextInt();
				System.out.println("Enter the Name :");
				String name = sc.nextLine();
				System.out.println("Enter the Salart :");
				double sal = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the City :");
				String city = sc.nextLine();
				System.out.println("Enter the country :");
				String country = sc.nextLine();
				
				Address add = new Address(city, country);
				employee.set(i, new Employee(id1, name, sal, add));
				flag = true;
				break;
				
			}
		}
		
		if(flag == false)
		{
			throw new GlobalException("Employee Id not found");
		}
	}
	
	//way 2 to update employee details
	public Employee updateEmployee(int index,Employee emp)
	{
		return employee.set(index, emp);
	}
	
	public Employee findId(int id)
	{
		Employee emp = null;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId() == id)
			{
				emp = employee.get(i);
			}
		}
		return emp;
	}
	
	public String deleteAllEmployees()
	{
		return "All Employee Deleted Successfully!";
	}
	
	
	public double CalculateSalary(int id) throws GlobalException
	{
		boolean flag = false;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId() == id)
			{
				double lpa = (employee.get(i).getEmpSal() * 12);
				System.out.println("-------------------------------------------");
				System.out.println("LPA : "+lpa);	
				
				flag = true;
				return lpa;
			}
		}
		
		if(flag == false)
		{
			throw new GlobalException("Employee Id not found");
		}
		return 0;
	}
	
	
	
	public double EmpAppraisal(int id) throws GlobalException
	{
		boolean flag = false;
		double appraisal =0;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId() == id)
			{
				
				if(employee.get(i).getEmpSal() >= 10000 && employee.get(i).getEmpSal() <= 20000)
				{
					appraisal = 2000;
				}
				else if(employee.get(i).getEmpSal() >= 30000)
				{
					appraisal = 3000;
				}
				else
				{
					appraisal = 1000;
				}
				System.out.println("Employee Salary : "+employee.get(i).getEmpSal());
				System.out.println("Employee Appraisal : "+appraisal);
				System.out.println("-------------------------------------------");
				
				flag = true;
				return appraisal;
			}
		}
		
		if(flag == false)
		{
			throw new GlobalException("Employee Id not found");
		}
		return 0;
	}
	
	

}
