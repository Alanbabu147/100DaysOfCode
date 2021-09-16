import java.io.*;
import java.util.*;
class Celsius
{
	public static void main(String[] args)
	{
		int n,cel;
		Scanner s1=new Scanner(System.in);
		convert ob=new convert();
		System.out.print("Enter the Temperature in fahrenheit : ");
		n=s1.nextInt();
		cel=ob.convert(n);
		System.out.println("Temperature in celsius is: "+cel);
	}
}
class convert
{
	int convert(int n)
	{
		return ((n-32)*5)/9;
	}
}

