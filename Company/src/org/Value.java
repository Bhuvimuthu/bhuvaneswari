package org;
//ASCII Value;
public class Value {
	public static void main(String[]args) {
char c='M';
int x=c;
System.out.println(x);
String s="B";
int compareto=s.compareTo("D");
System.out.println(compareto);
String s1="ABCD";
int compareto1=s1.compareTo("ABFK");
System.out.println(compareto1);
String s2="ABCD";
int compareto2=s2.compareTo("AB");
System.out.println(compareto2);
}
}