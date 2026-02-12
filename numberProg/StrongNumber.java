package numberProg;

import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		int fact=1;
		int sum=0;
		int m=n;
		while(n>0) {
		
			int d=n%10;
			fact=1;
			if(d>0) {
			for(int i=1;i<=d;i++) {
				fact*=i;
			}
			
			//System.out.println(fact);
			sum+=fact;
			n/=10;
			}
		}
		
		if(m==sum)
			System.out.println("Strong");
		else
			System.out.println("not");

	}

}
