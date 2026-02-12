package numberProg;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		int m=n;
		int prod=1;
		int sum=0;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		n=m;
		while(n>0) {
			prod=1;
			int d=n%10;
			for(int i=1;i<=count;i++) {
				prod*=d;
			}
			sum+=prod;
			n/=10;
		}
		//System.out.println(count);
		if(sum==m)
			System.out.println("Armstrong");
		else
			System.out.println("not");
;
	}

}
