package numberProg;

import java.util.Scanner;

public class AlterNetPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobjr=new Scanner(System.in);
		int l=sobjr.nextInt();
		int u=sobjr.nextInt();
		int count=0;
			for(int i=l;i<=u;i++)
			{
				boolean flag=true;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						flag=false;
						break;
					}
				}
				if(flag) 
				{
					count++;
				
				if(count%2!=0)
					System.out.println(i);
				}
		
			}

	}

}
