package org.batch;

public class WorkOut {
	public void eligiblityForGym(int age,int weight) {
		if(age>=18||weight>=45) {
			System.out.println("Eligible for gym");
		}
		else {
			System.out.println("Not eligible");
		}
	}
	public static void main(String[]args) {
		WorkOut w=new WorkOut();
		w.eligiblityForGym(17,44);
		w.eligiblityForGym(20,50);
	}
}
