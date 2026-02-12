package numberProg;

import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);

	}

}
