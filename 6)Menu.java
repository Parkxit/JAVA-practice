import java.util.Scanner;
class Menu {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ch;

        int num1, num2;

        do {
            System.out.print("Choose the operation that you want to perform on 2 numbers:'+'  '-'  '*'  '/'  '%': \nOR.......Enter x to exit: ");
             ch = sc.next();
            switch (ch) {
                case "+":
                    System.out.println("Enter two numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("Addition of " + num1 + " and " + num2 + " is " + addnum(num1, num2));
                    break;
                case "-":
                    System.out.println("Enter two numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("Substraction of " + num1 + " and " + num2 + " is " + subnum(num1, num2));
                    break;
                case "*":
                    System.out.println("Enter two numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + mulnum(num1, num2));
                    break;
                case "/":
                    System.out.println("Enter two numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("Division of " + num1 + " and " + num2 + " is " + divnum(num1, num2));
                    break;
                case "%":
                    System.out.println("Enter two numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("Remainder after " + num1 + " is divided by " + num2 + " is " + remnum(num1, num2));
                    break;

                case "x" :

                case "X" :
                    break;
                default:
                    System.out.println("Enter valid choice.");
                    break;

            }
        } while (ch!= "x" || ch!="X");
    }

    private static int mulnum(int num1, int num2) {
        return num1*num2;
    }

    private static int remnum(int num1, int num2) {
        if(num2==0)
        {
            System.out.println("The second number input is zero and division by zero is not possible.Enter valid numbers .");
            return num2;
        }
        else{
            return num1%num2;
        }

    }

    private static int divnum(int num1, int num2) {

        if(num2==0)
        {
            System.out.println("The second number input is zero and division by zero is not possible.Enter valid numbers .");
            return num2;
        }
        else{
            return num1/num2;
        }

    }

    private static int subnum(int num1, int num2) {
        return num1-num2;
    }

    private static int addnum(int num1, int num2) {
        return num1+num2;
    }
}
