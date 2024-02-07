package realtimeprgm;
//add or sum of odd numbers n even numbers
public class Sumnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0)//for even number
			//if(i%2==1) 
				{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
