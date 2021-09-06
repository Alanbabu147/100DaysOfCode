import java.util.*;
import java.io.*;
class SquareRoot
{
  int n;
  float i,c;
  public SquareRoot(int a)
  {
     n=a;
  }
  public void squareRoot()
  {
	  c=n/2;
	  i=(c+n/c)/2;
	  while(i !=c)
	  {
		  c=i;
		  i=(c+n/c)/2;
	  }
      System.out.println("The squareRoot of "+n+" =" +i);
  }
}
class Square extends SquareRoot
 {
    public Square(int a,int b)
    {
       super(b);
       n=a;
    }
    public void square()
    {
      c=n*n;
      System.out.println("The square of "+n+" =" +c);
    }
 }
 class Factorial extends Square
 {
    public Factorial(int a,int b,int x)
    {
       super(b,x);
       n=a;
    }
    public void factorial()
    {
	  c=1;
      for(i=1;i<=n;i++)
      {
		  c=c*i;
      }
      System.out.println("The factorial of "+n+" =" +c);
    }
 }
class inheritance
{
  public static void main(String[] args)
  {
      Factorial ob=new Factorial(4,10,15);
      ob.squareRoot();
      ob.square();
      ob.factorial();
	}
}
