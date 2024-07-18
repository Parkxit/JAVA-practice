package FIrstAssignment;

import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            System.out.print(rem);
        }

    }
}
