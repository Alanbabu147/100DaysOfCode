import java.util.*;

public class StudentGrade1
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        int i;
        String name,n;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Reg.No of the student :");
        n=s1.nextLine();
        System.out.print("Enter the name of the student :");
        name=s1.nextLine();
        for(i=0; i<6; i++){
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           int b=scanner.nextInt();
		   if(b<0||b>100)
		   {
			   System.out.println("Invalid Mark");
		       System.out.print("Enter mark for subject "+(i+1)+":");
		       b=scanner.nextInt();
            }
           marks[i] = b;
           total = total + marks[i];
        }
        scanner.close();
        avg = total/6;
        System.out.println("-------------------------------------------------");
        System.out.println("Reg.No    : "+n);
        System.out.println("Name      : "+name);
        for(i=0; i<6; i++)
        {
           System.out.println("Subject "+(i+1)+" : "+marks[i]);
	   	}
	   	System.out.println("Total : "+total);
        System.out.print("The student Grade is : ");
        if(avg>90)
        {
            System.out.print("O");
        }
        else if(avg>80 && avg<=90)
        {
           System.out.print("A+");
        }
        else if(avg>70 && avg<=80)
		{
		   System.out.print("A");
        }
        else if(avg>60 && avg<=70)
		{
		   System.out.print("B+");
        }
        else if(avg>=50 && avg<=60)
        {
            System.out.print("B");
        }
        else
        {
            System.out.print("D");
        }
        System.out.println("\n-------------------------------------------------");
    }
}
