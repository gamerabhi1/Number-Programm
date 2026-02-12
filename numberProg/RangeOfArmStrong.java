package numberProg;

import java.util.Scanner;

public class RangeOfArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sobjr=new Scanner(System.in);
		int l=sobjr.nextInt();
		int u=sobjr.nextInt();
		for(int i=l;i<=u;i++)
		{
			int n=i;
			int count=(n+" ").length();
			int sum=0;
			while(n>0)
			{
				int d=n%10;
				sum+=(int)Math.pow(d,count);
				n/=10;
			}
			if(sum==i)
				System.out.println(i);
		}
		
	}

}
