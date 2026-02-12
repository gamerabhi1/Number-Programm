package numberProg;

import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("prime");
		else
			System.out.println("not");

	}

}
