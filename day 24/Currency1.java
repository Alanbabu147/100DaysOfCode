package currency;
import java.util.Scanner;
public class Currency1 {
	public static double convertEUROtoINR(double EURO)
	{
		return EURO * 80;
	}
	public static double convertDOLLARtoINR(double DOLLAR)
	{
		return DOLLAR * 66.89;
	}
	public static double convertYENtoINR(double YEN)
	{
		return YEN * 0.61;
	}
	public static double convertINRtoEURO(double INR)
	{
		return INR * 0.013;
	}
	public static double convertINRtoDOLLAR(double DOLLAR)
	{
		return DOLLAR * 0.015;
	}
	public static double convertINRtoYEN(double YEN)
	{
		return YEN * 1.63;
	}
	public static void userChoice()
	{
		Scanner input = new Scanner(System.in);
   	    int currency_choice = 0;
 		double money = 0;
 		while(currency_choice != 7){
 		System.out.println("\nCurrency Converter");
 		System.out.println("------------------");
		System.out.println("1. DOLLOR to INR\n2. EURO to INR\n3. YEN to INR\n4. INR to DOLLOR\n5. INR to EURO\n6. INR to YEN\n7.Exit\n\nEnter Your Choice :");
 		currency_choice = input.nextInt();
 		switch(currency_choice){
			case 1:
				System.out.println("Enter in DOLLER");
				money = input.nextDouble();
				System.out.println(money+" DOLLER is equal to "+Currency1.convertDOLLARtoINR(money)+" INR");
				break;
			case 2:
				System.out.println("Enter in EURO");
				money = input.nextDouble();
				System.out.println(money+" EURO is equal to"+Currency1.convertEUROtoINR(money)+" INR");
				break;
	 		case 3:
 				System.out.println("Enter in YEN");
 				money = input.nextDouble();
 				System.out.println(money+" YEN is equal to"+Currency1.convertYENtoINR(money)+" INR");
				break;
		    case 4:
 				System.out.println("Enter in INR");
 				money = input.nextDouble();
 				System.out.println(money+" INR is equal to "+Currency1.convertINRtoDOLLAR(money)+" DOLLORS");
 				break;
	 		case 5:
 				System.out.println("Enter in INR");
 				money = input.nextDouble();
 				System.out.println(money+" INR is equal to "+Currency1.convertINRtoEURO(money)+" EURO");
 				break;
	 		case 6:
 				System.out.println("Enter in INR");
 				money = input.nextDouble();
 				System.out.println(money+" INR is equal to "+Currency1.convertINRtoYEN(money)+" YEN");
 				break;
	 		case 7:
 				break;
	 		default:
 				System.out.println("Please choose valid option");
 				break;
	 		}
	 	}
	 }
}
