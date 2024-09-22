import java.util.Scanner;
public class Factorial {
 private int fact,num;
 
 public void getnum()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number for its factorial:");
	 num=sc.nextInt();	 
 }
 
 public void op()
 {
	 fact=1;
	 for(int i=1;i<=num;i++)
	 {
		 fact=fact*i;
	 }
 }
 
 public int display()
 {
	 System.out.println("The factorial of the entered number is:"+fact);
	 return 0;
 }
 
}
