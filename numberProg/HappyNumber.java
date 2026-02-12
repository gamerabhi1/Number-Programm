package numberProg;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		
		int sum=0;
		
		while(sum!=1 && sum!=4)
		{
			sum=0;
			
			while(n>0) {
				int d=n%10;
				sum=d*d;
				n/=10;
			}
			n=sum;
		}
		if(sum==1)
			System.out.println("Happy number");
		else
			System.out.println("not");
		
	}

}
