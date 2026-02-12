package numberProg;

import java.util.Scanner;
public class AutoMorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		int sq=n*n;
		boolean flag=true;
		while(n>0)
		{
			if(n%10!=sq%10)
			{
				flag=false;
				break;
			}
			n/=10;
			sq/=10;
		}
		if(flag)
			System.out.println("automorphic");
		else
			System.out.println("not");

	}

}
