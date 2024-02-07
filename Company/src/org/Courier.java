package org;
//methods overloading
public class Courier {
	public void CourierDelivery(int phonenumber) {
	    System.out.println("Phonenumber is"+phonenumber);	
	}
	public void CourierDelivery(int doorno,String name) {
		System.out.println("Doornumber is"+doorno);
		System.out.println("Customer name is"+name);
	}
	public void CourierDelivery(String place,int pincode) {
		System.out.println("Place is"+place);
		System.out.println("Pincode is"+pincode);
	}
  public static void main(String[]args) {
	  Courier c=new Courier();
	  c.CourierDelivery(996755432);
	  c.CourierDelivery(14,"Muthu");
	  c.CourierDelivery("Pondy",605010);  
  }
}
