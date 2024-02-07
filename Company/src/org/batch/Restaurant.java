package org.batch;
//Access modifiers;
public class Restaurant extends Vegmeals{
//static variable;
	public static String a="Veg and Non-veg Hotel";
	public static void Timing() {
		System.out.println("Timing is 12pm to 10pm");
	}
	public static void main(String[]args) {
		Timing();
		lunch();
		Nonvegmeals.lunch1();
		//static variable within same class;
		System.out.println(a);
		//static variable with different class using extends;
		System.out.println(b);
		//static variable with different class without extends;
		System.out.println(Nonvegmeals.c);
	}
}
