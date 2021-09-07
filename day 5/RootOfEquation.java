import java.io.*;
import java.util.*;
import java.lang.*;
public class RootOfEquation
{
	public static void main(String[] args)
	{
    	double a,b,c;
    	Scanner s1=new Scanner(System.in);
    	double root1, root2;
    	System.out.print("Coefficient of x^2 :");
    	a=s1.nextInt();
    	System.out.print("Coefficient of x:");
    	b=s1.nextInt();
    	System.out.print("Constant :");
    	c=s1.nextInt();
    	double determinant = b * b - 4 * a * c;
    	if (determinant > 0)
    	{
      		root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      		root2 = (-b - Math.sqrt(determinant)) / (2 * a);
      		System.out.println("root1 = "+root1+" and root2 = "+root2);
    	}
    	else if (determinant == 0)
    	{
	    	System.out.println("two real and equal roots");
        	root1 = root2 = -b / (2 * a);
        	System.out.println("root1 = root2 = "+root1);
    	}
    	else
    	{
    		double real = -b / (2 * a);
    	    double imaginary = Math.sqrt(-determinant) / (2 * a);
    	    System.out.format("root1 = %.2f+%.2fi", real, imaginary);
    	    System.out.format("\nroot2 = %.2f-%.2fi\n", real, imaginary);
        }
	}
}
