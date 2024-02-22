package DataTypes;

public class Q1 {
	public static String minuteDivider(int min) {
		int day = 0;
		int year = 0;
		for(int i = 1; i<= min; i++) {
			if (i == 1440) {
				day += 1;
				i = 0;
				min -= 1440;
				if(day == 365) {
					year+=1;
					day-=365;
				}
			}
			
		}
		return year + " year and "+day+" day. And extra "+min+" minutes";
	}
	public static void main(String[] args) {
		System.out.println(minuteDivider( 3456789));
	}

}


/*
 *  ******* Instructions*********** 
 4. Write a Java program to convert minutes into years and days.

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days

1day 1440 min 
1 year 525600 min
 */