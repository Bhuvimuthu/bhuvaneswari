package org.batch;
//types of variables;
public class Hotel {
	//Instance variable;
	public String b="Chicken";
	//Static variable;
	protected static String c="Mutton";
	//method
	public void lunch() {
		//local variable;
		String a="Veg and Non-Veg";
		System.out.println(a);
		}
	public static void main(String[]args) {
		Hotel h=new Hotel();
		h.lunch();
		System.out.println(h.b);
		System.out.println(c);
	}
}
