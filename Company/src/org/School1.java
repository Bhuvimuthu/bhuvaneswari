package org;
//multilevel inheritance
public class School1 extends School2 {
	public void schoolName()
	{
		System.out.println("School name is Amirtha");
	}
	public static void main(String[]args) {
		School1 sn=new School1();
		sn.schoolName();
		sn.schoolClass();
		sn.schoolGrade();	
	}
}
