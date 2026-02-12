package numberProg;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day,year,month,week;
		day=1050;
		year=day/365;
		day=day%365;
		month=day/30;
		week=day/7;
		day=day%7;
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(week);
		System.out.println(day);
	}

}
