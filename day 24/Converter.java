import java.util.*;
import currency. *;
import time. *;
import distance. *;
public class Converter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Currency ob1=new Currency();
		int choice = 0;
		while(choice != 4){
			System.out.println("Converters");
			System.out.println("**********");
			System.out.println("1. Currentcy\n2. Distance\n3. Time\n4. Exit\n\nEnter Your Choice");
			choice = input.nextInt();
			switch(choice)
			{
				case 1:
					ob1.Currency1.userChoice();
					break;
				case 2:
					Distance.userChoice();
					break;
				case 3:
					Time1.userChoice();
					break;
				case 4:
					break;
				default:
					System.out.println("Please choose valid option");
					break;
			}
		}
		System.out.println("Thank You !!!!");
	}
}
