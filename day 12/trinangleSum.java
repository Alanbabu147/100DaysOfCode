import java.util.*;
import java.lang.*;
import java.io.*;
class TriSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int size;
		while(n-->0)
		{
		    size=sc.nextInt();
		    int[][] arr=new int[size][];
		    int[][] sum_arr=new int[size][];
		    for(int i=0;i<size;i++)
		    {
		        arr[i]=new int[i+1];
		        for(int j=0;j<=i;j++)
		        {
		            arr[i][j]=sc.nextInt();
		        }
		    }
		    for(int i=size-1;i>=0;i--)
		    {
		        sum_arr[i]=new int[i+1];
		        for(int j=i;j>=0;j--)
		        {
		            if(i==size-1)
		                sum_arr[i][j]=arr[i][j];
		            else
		                sum_arr[i][j]=arr[i][j]+Math.max(sum_arr[i+1][j],sum_arr[i+1][j+1]);
		        }
		    }
		    System.out.println(sum_arr[0][0]);
		}
	}
}
