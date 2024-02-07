package org.batch;
//string;
public class Word1 {
	public static void main(String[]args) {
		String s="Welcome to java class";
		String subString=s.substring(8,21);
		System.out.println(subString);
	    String subString1=s.substring(5);
	    System.out.println(subString1);
	    int indexOf=s.indexOf("c");
	    int indexOf1=s.indexOf("u");
	    System.out.println(indexOf);
	    System.out.println(indexOf1);
	    int lastIndexOf=s.lastIndexOf("o");
	    int lastIndexOf1=s.lastIndexOf("x");
	    System.out.println(lastIndexOf);
	    System.out.println(lastIndexOf1);
	    String replace=s.replace("java","selenium");
	    System.out.println(replace);
	    String s1=" ";
	    boolean empty=s1.isEmpty();
	    System.out.println(empty);
	    boolean startswith=s.startsWith("welcome");
	    System.out.println(startswith);
	    boolean endswith=s.endsWith("class");
	    System.out.println(endswith);   
	}
}
