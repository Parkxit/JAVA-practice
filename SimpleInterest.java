package FIrstAssignment;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double p;
        float r;
        int n;
        float SI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        p = sc.nextDouble();
        System.out.print("Enter rate of interest ");
        r = sc.nextFloat();
        System.out.print("Enter number of years: ");
        n = sc.nextInt();
        SI = (float) (p * r * n) / 100;
        System.out.println("The Simple Interest is " + SI+" Rs.");

    }
}
