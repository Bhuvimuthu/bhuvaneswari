package org;
//method overriding;
public class Chocolate extends Chocolate1 {
	public void chocoName(String name) {
	super.chocoName("Dairymilk");
System.out.println("Chocolate Name "+name);
	}
	public static void main(String[]args) {
		Chocolate c=new Chocolate();
		c.chocoName("MilkyBar");
	}

}
