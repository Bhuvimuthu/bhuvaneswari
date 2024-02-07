package org.batch;
public class Week {
	public void daySelection(int day) {
		switch(day) {
		case 1:{
			System.out.println("Monday");
			break;
		}
		case 2:{
			System.out.println("Tuesday");
			break;
		}
		case 3:{
			System.out.println("Wednesday");
			break;
	    }
		case 4:{
			System.out.println("Thursday");
			break;
		}
		case 5:{
			System.out.println("Friday");
			break;
		}
		case 6:{
			System.out.println("Saturday");
			break;
		}
		case 7:{
			System.out.println("Sunday");
			break;
		}
		default:{
			System.out.println("No day");
			break;
		}
		}
		}
		public static void main(String[]args) {
			Week w=new Week();
			w.daySelection(2);
			w.daySelection(7);
			w.daySelection(8);
			}
}
