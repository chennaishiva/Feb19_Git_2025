package com.cts;
//import org.tcs.Company;
//import org.tcs.Employee;
import org.tcs.*;
//Different Package - Differnet class
//child class
public class Client {
	
	public void clientAddress() {
		System.out.println("Client Address is vadapalani");
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.clientAddress();
		
		
		Employee e = new Employee();
		e.empId();
		e.empName();
	}

}
