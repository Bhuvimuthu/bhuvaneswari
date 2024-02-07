package org.batch;
//constructor with method overloading;
public class ClassC extends ClassD {
		public ClassC()
		{
			this("Ravi");
	System.out.println("Default Constructor");
		}
		public ClassC(String name) {
			this(1506);
	System.out.println("Name is "+name);
		}
		public ClassC(int num) {
			super(80.25f);
	System.out.println("Number is "+num);
		}
		public static void main(String[]args) {
			ClassC c=new ClassC();
		}
		}


