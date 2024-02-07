package org;

import org.batch.Employee;

public class CompanyDetails extends Employee{
	public void CompanyId() {
		System.out.println("Company Id is 2402");
		}
    public void CompanyName() {
    	System.out.println("Company Name is HCL");
        }
    public void CompanyAddress() {
    	System.out.println("Company Address is Kodampakkam");
        }
    public static void main(String[]args) {
    	CompanyDetails c=new CompanyDetails();
    	c.CompanyId();
    	c.CompanyName();
    	c.CompanyAddress();	
    	c.employeeId();
    	c.employeeName();
      }
    }