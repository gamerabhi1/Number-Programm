package numberProg;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		int m=n;
		int sum=0;
		int prod=1;
		while(n>0)
		{
			int d=n%10;
			sum+=d;
			prod*=d;
			n/=10;
			
		}
		
		if(sum==prod)
			System.out.println("Spy ");
		else
			System.out.println("not");
		

	}

}
