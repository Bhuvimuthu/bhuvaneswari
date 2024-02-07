package org;

public class Election {
	int age=19;
	public void eligibilityToVoting() {
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[]args) {
		Election e=new Election();
		e.eligibilityToVoting();
	}

}
