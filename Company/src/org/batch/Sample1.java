package org.batch;

public class Sample1 {
	public void eligibilityForBloodDonation(int age,int weight) {
		if(age>=18&&weight>=50)
		{
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not eligible");
			}
	}
	public static void main(String[]args) {
		Sample1 s=new Sample1();
		s.eligibilityForBloodDonation(23,54);
	}
}



