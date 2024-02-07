package org;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;
//list interface;
public class Library {
	public static void main(String[]args) {
		List ex=new ArrayList();
		ex.add(2402);
		ex.add("Name");
		ex.add(235.45f);
		ex.add('A');
		ex.add(true);
		ex.add(10);
		ex.add(10);
		System.out.println(ex);
	int size=ex.size();	
	System.out.println(size);
	int indexOf=ex.indexOf('A');
	System.out.println(indexOf);
	int lastIndexOf=ex.lastIndexOf(10);
	System.out.println(lastIndexOf);
	boolean contains=ex.contains(false);
	System.out.println(contains);
	Object object=ex.get(2);
	System.out.println(object);
	for(int i=0;i<ex.size();i++) {
		System.out.println(ex.get(i));
	}
	for(Object object1:ex) {
		System.out.println(object1);
	}
	List<Integer>ex1=new LinkedList<Integer>();
	ex1.add(90);
	ex1.add(10);
	ex1.add(10);
	ex1.add(30);
	ex1.add(10);
	System.out.println(ex1);
	List<Integer>ex2=new Vector<Integer>();
	ex2.add(90);
	ex2.add(10);
	ex2.add(20);
	ex2.add(90);
	ex2.add(70);
	System.out.println(ex2);
	ex1.removeAll(ex2);
	System.out.println(ex1);
	System.out.println(ex2);
	List<Integer>d=new ArrayList<Integer>();
	d.addAll(ex2);
	d.add(50);
	System.out.println(d);
	System.out.println(ex2);
	d.clear();
	System.out.println(d);			
	}
}
