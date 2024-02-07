package org;

public class School {
	public void tallestInClass(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println("a is tallest");
		}
		else if(b>c&&b>a) {
			System.out.println("b is tallest");
		}
		else {
			System.out.println("c is tallest");
		}
	}
	public static void main(String[]args) {
		School s=new School();
		s.tallestInClass(180,130,170);
		s.tallestInClass(100,110,150);
	}
}
