package numberProg;

public class binToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bintodec(100);

	}
	
	public static void bintodec(int binnum)
	{
		int pow=0;
		int mynum=binnum;
		int decnum=0;
		while(binnum > 0)
		{
			int d=binnum%10;
			decnum=decnum+(d*(int)Math.pow(2, pow));
			pow++;
			binnum=binnum/10;
		}
			System.out.println(decnum);
		
	}

}
