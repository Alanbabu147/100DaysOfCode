import java.io.*;
import java.util.*;
class armstrongNumber
{
	public static void main(String[] args)
	{
		int n,r,sum=0,temp;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the number :");
		n=s1.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==temp)
			System.out.println("The number "+temp+" is Armstrong number");
		else
			System.out.println("The number "+temp+" is not Armstrong number");
	}
}
