package defaultiostream;

import java.util.Date;

public class JavaFormatter {

	public static void main(String[] args) {

		int amount=10000;
		double piValue=3.14159265259;
		String str = "Luminar Technolab";
		Date date = new Date();
		
		char ch = 'g';
		char option = 'o';
		
		System.out.printf("%,d%n",amount);
		
		System.out.printf("%f\n",piValue);
		System.out.printf("%.3f\n",piValue);
		System.out.printf("%.2f\n",piValue);
		
		System.out.println("Double upto 2 decimal places : "+String.format("%.2f", piValue));

		
		System.out.printf("'%15s' %n","luminar");
		
		System.out.printf("%tT%n",date);
		
		System.out.printf("hours %tH: minutes %tM: seconds %TS%n",date,date,date);

		System.out.printf("%1$tA, %1$tB, %1$tY %n",date);
		
		System.out.printf("%1$td %1$tm %1$ty %n",date);
		
		System.out.printf("%c\n",ch);
		
		System.out.printf("%C\n",ch);
		
		System.out.printf("%c\n",Character.toLowerCase(ch));
		
		System.out.printf("%c\n",option);
		
		System.out.printf("%c\n",Character.toLowerCase(option));
		
		System.out.printf("%C\n",option);
		
		System.out.printf("%s \n",str);
		
		System.out.printf("%S \n",str);
		
		
	}

}
