package org;
//child class
	public class Family extends Family1{
		public void ChildName() {
			System.out.println("ChildName is Deepthi");
		}
	public static void main(String[]args) {
		Family f=new Family();
		f.ChildName();
		f.ParentName();
		f.GrandparentName();
	}
}
