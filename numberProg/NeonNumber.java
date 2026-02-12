package numberProg;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			int d=sq%10;
			sum+=d;
			sq/=10;
		}
		if(n==sum)
			System.out.println("Neon Number");
		else
			System.out.println("not");

	}

}
