import java.util.Scanner;
class Largestnum {
    public static void main(String[] args) {
        int num1, num2, num3;//finding  largest of the three numbers entered by user
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.println("The largest number between " + num1 + "," + num2 + "," + num3 + " is " + mathfun(num1, num2, num3));
    }

    private static int mathfun(int num1, int num2, int num3) {
        int num = Math.max(num1, Math.max(num2, num3));
        return num;
    }
}

