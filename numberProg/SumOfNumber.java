package numberProg;
import java.util.Scanner;
public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		int n=sobjr.nextInt();
		int sum=0;
		while(n>0) {
			int d=n%10;
		sum+=d;
		n/=10;
		}
		System.out.println(sum);

	}

}
