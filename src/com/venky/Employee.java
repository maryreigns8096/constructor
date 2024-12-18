package com.venky;

public class Employee {
	String name;
	int salary;
	public Employee(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
		System.out.println(this.name + "--" + this.salary);
	}
	public static void main(String[] args) {
		Employee e1=new Employee("venky",25000);
	}
	
	
	

}
