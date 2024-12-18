package com.venky;

public class Sample {
	int id;
	String name;
	int age;
	String gender;
	public Sample(int id, String name, int age, String gender) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println(this.id+""+this.name+""+this.age+""+this.gender);
	}
	public static void main(String[] args) {
		Sample s1=new Sample(102,"venky",25,"male");
		Sample s2=new Sample(104,"maryreigns",26,"male");
		Sample s3=new Sample(105,"koti",24,"male");
	}
	

}
