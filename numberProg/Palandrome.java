package numberProg;

import java.util.Scanner;

public class Palandrome {
	public static void main(String [] args) {
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		int m=n;
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=(rev*10)+d;
			n/=10;
		}
		if(m==rev)
		System.out.println("palandrome");
		else
			System.out.println("not");
	}

}
