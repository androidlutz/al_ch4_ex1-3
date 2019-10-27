package CH_4_Exercises;

public class Exercise3 {
	
	
	
	public static void printAmerican(String day, String month, int date, int year) {
		System.out.print(day);
		System.out.print(",");
		System.out.print(" ");
		System.out.print(month);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(",");
		System.out.print(" ");
		System.out.println(year);
		
	}
		public static void printEuropean(String day, int date, String month, int year) {
			System.out.print(day);
			System.out.print(",");
			System.out.print(" ");
			System.out.print(date);
			System.out.print(" ");
			System.out.print(month);
			System.out.print(",");
			System.out.print(" ");
			System.out.println(year);
	
			
		}
	
		public static void main(String[] args) {
			String day = "Friday";
			String month = "October";
			int date = 25;
			int year = 2019;
			printEuropean(day, date, month, year);
			
	}

}


/*
 * printAmerican
	Friday, October 25, 2019
	
	printEuropean
	Friday, 25 October, 2019

 * 
 * 
*/

