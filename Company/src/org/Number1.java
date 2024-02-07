package org;
//array;
public class Number1 {
	public static void main(String[]args) {
	int a[]=new int[5];
		a[0]=23;
		a[1]=20;
		a[2]=24;
		a[3]=28;
		a[4]=27;
	int length=a.length;
	System.out.println(length);
	System.out.println(a[2]);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	for(int i:a) {
		System.out.println(i);
	}
	}
}
