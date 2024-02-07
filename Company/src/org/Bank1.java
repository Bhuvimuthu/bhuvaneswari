package org;
//partial abstraction;
public class Bank1 extends Bank2 {
	public void atmPin(int pin) {
	System.out.println("AtmPin is "+pin);	}
	public static void main(String[]args) {
		Bank1 b=new Bank1();
		b.atmPin(1990);
		b.kyc();
	}
}
