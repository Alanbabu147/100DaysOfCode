import java.util.*;
class TriangleNumberPattern
{
	public static void main(String[] args)
	{
		number obj=new number();
		Scanner s1=new Scanner(System.in);
		int n;
		System.out.print("Enter number of rows");
		n=s1.nextInt();
		obj.row1(n);
		obj.row2(n);
		obj.row3(n);
		obj.row4(n);
		obj.row5(n);
		obj.row6(n);
	}
}
class number
{
	int i,j,k;
	void row1(int n)
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	void row2(int n)
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	void row3(int n)
	{
		k=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		System.out.println();
	}
	void row4(int n)
	{
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	void row5(int n)
	{
		for(i=1;i<=n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	void row6(int n)
	{
		int z=1;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for (k=1;k<=i;k++)
			{
				System.out.print(z+"  ");
				z++;
			}
			System.out.println();
		}
	}
}
