import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

	public static void main(String[] args) {

		double amount, dollar, pound, code, euro, yen, ringgit, rupee;
		DecimalFormat f = new DecimalFormat("##.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("hi, Welcome to the Currency Converter!");
		System.out.println("which currency You want to Convert ? ");
		System.out.println("1:Ruppe \n2:Dollar \n3:Pound \n4:Euro \n5:Yen \n6:Ringgit ");
		System.out.println("Enter your choice : ");
		code = sc.nextInt();
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
		if (code == 1)
		{
			dollar = amount / 73.7;
			System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
			pound = amount / 101.26;
			System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");
			euro = amount / 86.41;
			System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
			yen = amount / 0.67;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
			ringgit = amount / 17.67;
			System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " ringgit");
		}
		else if (code == 2)
		{
			rupee = amount * 73.7;
			System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
			pound = amount * 0.73;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
			euro = amount * 0.85;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
			yen = amount * 109.93;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
			ringgit = amount * 4.17;
			System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
		}
		else if (code == 3)
		{
			rupee = amount * 101.26;
			System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");
			dollar = amount * 1.37;
			System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
			euro = amount * 1.17;
			System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
			yen = amount * 151.05;
			System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");
			ringgit = amount * 5.73;
			System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " ringgit");
		}
		else if (code == 4)
		{
			rupee = amount * 86.41;
			System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");
			dollar = amount * 1.17;
			System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
			pound = amount * 0.85;
			System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
			yen = amount * 128.98;
			System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");
			ringgit = amount * 4.89;
			System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");
		}
		else if (code == 5)
		{
			rupee = amount * 0.67;
			System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");
			dollar = amount * 0.0091;
			System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");
			pound = amount * 0.0066;
			System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");
			euro = amount * 0.0078;
			System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");
			ringgit = amount * 0.038;
			System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
		}
		else if (code == 6)
		{
			rupee = amount * 17.67;
			System.out.println("Your " + amount + " ringgit is : " + f.format(rupee) + " Ruppes");
			dollar = amount * 0.24;
			System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");
			pound = amount * 0.17;
			System.out.println("Your " + amount + " ringgit is : " + f.format(pound) + " pound");
			euro = amount * 0.20;
			System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");
			yen = amount * 26.24;
			System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");
		}
		else
		{
			System.out.println("Invalid input");
		}

		System.out.println("Thank you for choosing our Example Programs");
	}

}
