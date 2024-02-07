package org;
import org.batch.College2;
//private access specifier;
public class College extends College2 {
private void busRoute() {
	System.out.println("Busroute is Erode to Salem");
}
public static void main(String[]args) {
	College c=new College();
	c.busRoute();
	c.busTime();
}
}
