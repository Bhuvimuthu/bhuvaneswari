package org;

public class Election1 {
	int age=11;
	public void eligibilityToVoting() {
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
	}
	public static void main(String[]args) {
		Election1 e=new Election1();
		e.eligibilityToVoting();
	}
}
