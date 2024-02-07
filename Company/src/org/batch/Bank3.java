package org.batch;
//fully abstraction;
public class Bank3 implements Bank4,Bank5 {
	public void atmPin(int pin) {
		System.out.println("Pin is "+pin);
	}
	public void pin() {
		System.out.println("Pin is 1990");
	}
	public static void main(String[]args) {
		Bank3 b=new Bank3();
		b.atmPin(1987);
		b.pin();
	}
}
