package org.batch;
//default constructor;
public class ClassA {
public ClassA()
{
	System.out.println("Default Constructor");
}
public ClassA(String name) {
	System.out.println("Name is "+name);
}
public static void main(String[]args) {
	ClassA c=new ClassA();
	ClassA c1=new ClassA("Ravi");
}
}
