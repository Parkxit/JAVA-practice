package FIrstAssignment;

import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Enter choice: \n1)+\n2)-\n3)*\n4)/\n");
        System.out.println("Enter the serial number of the operation that you want to perform: ");
        ch=sc.nextInt();
        int n1,n2;
        System.out.println("Enter the two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();

        if(ch==1)
        {
            System.out.println("Addition is "+ (n1+n2));
        }
        else if(ch==2)
        {
            System.out.println("Substraction is "+ (n1-n2));
        }
        else if(ch==3)
        {
            System.out.println("Multiplication is "+ (n1*n2));
        }
        else if(ch==4)
        {
            System.out.println("Division is: "+ (n1/n2));
        }
    

    }
}
