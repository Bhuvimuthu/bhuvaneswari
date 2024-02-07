package org.batch;
//string;
public class Word {
public static void main(String[]args) {
	String s="WELCOME";
	int length=s.length();
	System.out.println(length);
	char charAt=s.charAt(2);
	System.out.println(charAt);
	boolean equals=s.equals("Welcome");
	System.out.println(equals);
	boolean equalsIgnoreCase=s.equalsIgnoreCase("welcome");
	System.out.println(equalsIgnoreCase);
	boolean contains=s.contains("CO");
	System.out.println(contains);
	String s1="Welcome to java class";
	System.out.println("String length is "+s1.length());
	String[]split=s1.split(" ");
	System.out.println(split.length);
	for(String s2:split) {
		System.out.println(s2);
	}
	String UpperCase=s1.toUpperCase();
	System.out.println(UpperCase);
	String LowerCase=s1.toLowerCase();
	System.out.println(LowerCase);
}
}
