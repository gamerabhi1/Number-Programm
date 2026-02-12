package numberProg;

import java.util.Scanner;
public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
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
			System.out.println("spy number");
		else
			System.out.println("not");

	}

}
