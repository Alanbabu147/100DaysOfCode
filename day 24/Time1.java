package time;
import java.util.Scanner;
public class Time1
{
	public static double convertHoursToMinutes(double hours)
	{
		return hours * 60;
	}
	public static double convertHoursToSeconds(double hours)
	{
		return hours * 60 * 60;
	}
	public static double convertMinutesToHours(double minutes)
	{
		return minutes/60;
	}
	public static double convertSecondsToHours(double seconds)
	{
		return seconds/3600;
	}
	public static void userChoice()
	{
		Scanner input = new Scanner(System.in);
		int time_choice = 0;
		double time = 0;
		while(time_choice != 5)
		{
			System.out.println("\nTime Converter");
			System.out.println("-----------------");
			System.out.println("1. HOURS to MINUTES\n2. HOURS to SECONDS\n3. MINUTES to HOURS\n4. SECONDS to HOURS\n5.Exit\n\nEnter Your Choice");
		 	time_choice = input.nextInt();
		 	switch(time_choice){
			 	case 1:
				 	System.out.println("Enter in HOURS");
				 	time = input.nextDouble();
				 	System.out.println(time+" HOURS is equal to "+Time1.convertHoursToMinutes(time)+" MINUTES");
				 	break;
				case 2:
				 	System.out.println("Enter in HOURS");
				 	time = input.nextDouble();
				 	System.out.println(time+" HOURS is equal to "+Time1.convertHoursToSeconds(time)+" SECONDS");
				 	break;
			 	case 3:
				 	System.out.println("Enter in MINUTES");
				 	time = input.nextDouble();
				 	System.out.println(time+" MINUTES is equal to "+Time1.convertMinutesToHours(time)+" HOURS");
					break;
				case 4:
					System.out.println("Enter in SECONDS");
					time = input.nextDouble();
					System.out.println(time+" SECONDS is equal to "+Time1.convertSecondsToHours(time)+" HOURS");
					break;
				case 5:
					break;
				default:
					System.out.println("Please choose valid option");
					break;
			}
		}
	 }
}
