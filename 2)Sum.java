package FIrstAssignment;

import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        int a=10,b=20,sum=0;
        sum=a+b;
        System.out.println("Sum of "+a+ " and " +b+ " is "+sum );
        System.out.println();
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum of "+a+ " and " +b+ " is "+sum );

    }
}
