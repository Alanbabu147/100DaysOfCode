import java.io.*;
import java.util.*;
class binarySearch
{
	public static void main(String[] args)
	{
		int a[]={12,23,34,45,56};
		int n,i;
		Scanner s1=new Scanner(System.in);
		System.out.println("Elements in list");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.print("Enter the number to Search:");
		n=s1.nextInt();
		i=0;
		while(i<a.length)
		{
			if(a[i]==n)
				break;
			i++;
		}
		if(a[i]==n)
		{
			i++;
			System.out.println("Element found at position "+i);
		}
		else
			System.out.println("Not Found");

	}
}
