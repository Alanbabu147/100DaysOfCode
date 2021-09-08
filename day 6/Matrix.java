import java.io.*;
import java.util.*;
class Matrix
{
	int[][] add(int[][] a,int[][] b)
	{
		int add[][]=new int [2][2];
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				add[i][j]=a[i][j]+b[i][j];
			}
		}
		return add;
	}
	int[][] sub(int[][] a,int[][] b)
	{
		int i,j;
		int sub[][]=new int [2][2];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		return sub;
	}
	int[][] multi(int[][] a,int[][] b)
	{
		int i,j,k;
		int multi[][]=new int [2][2];
		for (i = 0; i < 2; i++)
		{
			for (j = 0; j < 2; j++)
			{
				for (k = 0; k < 2; k++)
                    multi[i][j] += a[i][k] * b[k][j];
		    }
	 	}
	 	return multi;
 	}
 	public static void main(String []args)
 	{
		int m1[][]=new int [2][2];
		int m2[][]=new int [2][2];
		int mAdd[][]=new int [2][2];
		int mSub[][]=new int [2][2];
		int mMulti[][]=new int [2][2];
		Matrix mat= new Matrix();
		display data= new display();
		System.out.println("Enter the values of 1st Matrix(2X2)");
		m1=data.getdata();
		System.out.println("Enter the values of 2st Matrix(2X2)");
		m2=data.getdata();
		System.out.println("Matrix 1");
		data.display(m1);
		System.out.println("Matrix 2");
		data.display(m2);
		System.out.println("Addition of two matrix");
		mAdd=mat.add(m1,m2);
		data.display(mAdd);
		System.out.println("subtraction of two matrix");
		mSub=mat.sub(m1,m2);
		data.display(mSub);
		System.out.println("Multiplication of two matrix");
		mMulti=mat.multi(m1,m2);
		data.display(mMulti);

	}

}
class getdata
{
	Scanner s1=new Scanner(System.in);
	int [][] getdata()
	{
		int m[][]=new int[2][2];
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				m[i][j]=s1.nextInt();
			}
		}
		return m;
	}
}
class display extends getdata
{
	void display(int [][]a)
	{
		int i,j;
		int m[][]=a;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(m[i][j]+"  ");
			}
			System.out.print("\n");
		}
	}
}
