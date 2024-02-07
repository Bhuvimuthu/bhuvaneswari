package org.batch;
//Default constructor with this keyword;
public class ClassB {
	public ClassB()
	{
		this("Ravi");
		System.out.println("Default Constructor");
	}
	public ClassB(String name) {
		this(1506);
		System.out.println("Name is "+name);
	}
	public ClassB(int num) {
		System.out.println("Number is "+num);
	}
	public static void main(String[]args) {
		ClassB c=new ClassB();
	}
	}


