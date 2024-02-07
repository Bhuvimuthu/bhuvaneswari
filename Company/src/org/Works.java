package org;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Works{
	public static void main(String[]args){
Set s=new HashSet();
	s.add(90);
	s.add(10);
	s.add(true);
	s.add('m');
	s.add(null);
	System.out.println(s);
Set s1=new LinkedHashSet();
    s1.add(90);
	s1.add(10);
	s1.add(true);
	s1.add('m');
	s1.add(null);
	s1.add("Ravi");
	System.out.println(s1);
Set s2=new TreeSet();
    s2.add(90);
	s2.add(10);
	s2.add(70);
	s2.add(90);
	s2.add(105);
	System.out.println(s2);
int size=s.size();
System.out.println(size);
boolean contains=s.contains('m');
System.out.println(contains);
s.remove('m');
System.out.println(s);
List l=new ArrayList();
l.addAll(s2);
l.add(40);
l.add(50);
System.out.println(l);
l.removeAll(s2);
System.out.println(l);
System.out.println(s2);
//l.retainAll(s2);
//System.out.println(l);
//System.out.println(s2);
for(Object object:s) {
	System.out.println(object);
}	
}
}

