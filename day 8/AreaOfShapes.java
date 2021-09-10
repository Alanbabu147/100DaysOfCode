import java.io.*;
import java.lang.*;
import java.util.*;
class AreaOfShapes
{
	public static void main(String[] args)
	{
		int n;
		Shapes obj=new Shapes();
		Scanner s2=new Scanner(System.in);
		System.out.print("1 for square \n2 for Rectangle \n3 for Triangle\n4 for Circle \nEnter your choice :");
		n=s2.nextInt();
		obj.Shapes(n);
	}
}
class Shapes
{
	void Shapes(int n)
	{
		Scanner s1=new Scanner(System.in);
		int l,b;
		double a,area;
		switch(n)
		{
			case 1:
			System.out.print("Enter the length of one side : ");
			a=s1.nextInt();
			area=a*a;
			System.out.println("Area of the square is "+area);
			break;
			case 2:
			System.out.print("Enter the length of rectangle : ");
			a=s1.nextInt();
			System.out.print("Enter the bength of rectangle : ");
			l=s1.nextInt();
			area=a*l;
			System.out.println("Area of the rectangle is "+area);
			break;
			case 3:
			System.out.print("Enter the length of Triangle : ");
			a=s1.nextInt();
			System.out.print("Enter the length of the base of Triangle : ");
			b=s1.nextInt();
			area=(a*b)/2;
			System.out.println("Area of the Triangle is "+area);
			break;
			case 4:
			System.out.print("Enter the radius of circle : ");
			a=s1.nextInt();
			double a2=Math.PI*a*a;
			System.out.format("Area of the circle is %.2f/n",a2);
			break;
		}
	}
}

