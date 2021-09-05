import java.io.*;
import java.util.*;
class insertionSort
{
	public static void sort(int a[],int n)
	{
			int i, key, j;
			for (i = 1; i < n; i++)
			{
				key = a[i];
			    j = i - 1;
			    while (j >= 0 && a[j] > key)
			    {
					a[j + 1] = a[j];
			        j = j - 1;
			    }
	        	a[j + 1] = key;
			}
	}
	public static void main(String[] args)
	{
		int a[]={12,15,34,23,10,67,90};
		int i,n;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("After sorting:");
		sort(a,a.length);
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}


}
