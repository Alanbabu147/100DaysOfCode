import java.util.*;
import java.io.*;
class palindrome
{
	static int n,r;
	static int temp,sum=0;
	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the number :");
		n=s1.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}
