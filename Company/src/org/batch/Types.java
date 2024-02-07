package org.batch;
//String;
public class Types {
public static void main(String[]args) {
	String s="Java";
	String s1="Java";
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	String s2="Java";
	String s3="Selenium";
	String concat=s2.concat(s3);
	System.out.println(concat);
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(concat));
	StringBuilder s4=new StringBuilder("Java");
	StringBuilder s5=new StringBuilder("Selenium");
	StringBuilder append=s4.append(s5);
	System.out.println(append);
	System.out.println(System.identityHashCode(s4));
	System.out.println(System.identityHashCode(s5));
	System.out.println(System.identityHashCode(append));	
}
}
