import java.io.*;
import java.util.*;
public class PascalsTriangle
{
	static int fact(int n)
	{
		int f=1,i;
        for(i = 1; i<=n; i++)
        {
			f *= i;
        }
        return f;
   }
   static int ncr(int n,int r)
   {
	   return fact(n)/( fact(n-r)*fact(r) );
   }
   public static void main(String[] args)
   {
	   int n, i, j;
	   Scanner s1=new Scanner(System.in);
	   System.out.print("Number of rows to print:");
       n = s1.nextInt();
       for(i = 0; i < n; i++)
       {
		   for(j = 0; j <= n-i; j++)
		   {
			   System.out.print("  ");
           }
           for(j = 0; j <= i; j++)
           {
			   System.out.print("  "+ncr(i, j)+" ");
           }
           System.out.println();
      }
   }
}
