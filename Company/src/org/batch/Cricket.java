package org.batch;
import java.util.Set;
import java.util.Collection;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Map.Entry;
public class Cricket{
public static void main(String[]args) {
Map<String,Integer>m=new HashMap<String,Integer>();
	m.put("CSK",1);
	m.put("MI",10);
	m.put("SRH",7);
	m.put("CSK",9);
	m.put(null,2);
	m.put(null,null);
	m.put("RCB",null);
	System.out.println(m);
Map<String,Integer>m1=new LinkedHashMap<String,Integer>();
	m1.put("CSK",1);
	m1.put("MI",10);
	m1.put("SRH",7);
	m1.put("CSK",9);
	m1.put(null,2);
	m1.put(null,null);
	m1.put("RCB",null);
	System.out.println(m1);
Map<String,Integer>m2=new TreeMap<String,Integer>();
	m2.put("CSK",1);
	m2.put("MI",10);
	m2.put("SRH",7);
	m2.put("CSK",9);
	m2.put("RCB",null);
	System.out.println(m2);	
Map<String,Integer>m3=new Hashtable<String,Integer>();
	m3.put("CSK",1);
	m3.put("MI",10);
	m3.put("SRH",7);
	m3.put("CSK",9);
	System.out.println(m3);
	int Size=m.size();
	System.out.println(Size);
	boolean ContainsKey=m.containsKey("CSK");
	System.out.println(ContainsKey);
	Integer integer=m.get("CSK");
	System.out.println(integer);
	Integer remove=m.remove("MI");
	System.out.println(m);
	Set<String>KeySet=m.keySet();
	System.out.println(KeySet);
	Collection<Integer>Values=m.values();
	System.out.println(Values);
	Set<Entry<String,Integer>>entryset=m.entrySet();
	for(Entry<String,Integer>entry:entryset) {
		//System.out.println(entry);
	   System.out.println(entry.getKey());
	   System.out.println(entry.getValue());  
	}	
}
}