package org.batch;
//Child class
public class SBI extends RBI {
	public void amountInSBI() {
		System.out.println("Amount in SBI is 9 Lakhs");
	}
	public static void main(String[]args) {
		SBI s=new SBI();
		s.amountInSBI();
		s.amountToSBI();
	}
}
