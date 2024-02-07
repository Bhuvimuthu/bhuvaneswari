package org.batch;
//Child class
public class IOB extends RBI {
	public void amountInIOB() {
		System.out.println("Amount in IOB is 15 Lakhs");
	}
	public static void main(String[]args) {
		IOB i=new IOB();
		i.amountInIOB();
		i.amountToIOB();
	}
}
