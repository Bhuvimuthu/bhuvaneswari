package org;
//Exception Handling;
import java.util.List;
import java.util.InputMismatchException;
import java.awt.Robot;
import java.awt.AWTException;
import java.util.Scanner;
public class Office1 {
	public static void main(String[]args)throws AWTException,InterruptedException {
	try {
		System.out.println(10/0);
	}
	catch(NullPointerException e) {
		System.out.println(e.getMessage());
	}
	catch(InputMismatchException e) {
		System.out.println(e.getMessage());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("Test Message");
	}
	Robot r=new Robot();
	r.keyPress(0);
	throw new InterruptedException();
	}
}
