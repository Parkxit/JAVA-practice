import java.util.Scanner;
public class Fibonacci
{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.print("\n\n1)Print the fibonacci sequence containing n numbers:" +
                    "\n2)nth number in the fibonacci series:\n3)Exit\n\nEnter choice: ");
            ch=sc.nextInt();

        switch (ch) {
            case 1:
                printfibo();
                break;
            case 2:
                System.out.print(" " + findnum());
                break;
            case 3:
                System.out.println("OK");
                break;
            default:
                System.out.println("Enter valid choice: ");
        }
    }while(ch!=3);
    }

    private static int findnum() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position of the number: ");
        int p=sc.nextInt();
        if(p==1){
            System.out.print("The number at the position "+p+" is ");
            return 0;
        }
        else if(p==2)
        {
            System.out.print("The number at the position "+p+" is ");
            return 1;
        }
        else{
            int s=1;
            int f=0;
            int count=3;
            while(count<=p)
            {
                int temp=s;
                s=s+f;
                f=temp;
                count++;
            }
            System.out.print("The number at the position "+p+" is ");
            return s;


        }
    }

    private static void printfibo() {
        int f=0;
        int s=1;
        System.out.println("How many numbers to print: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=3;
        System.out.print(f+" "+s+" ");
        while(count<=n)
        {
            int temp=s;
            s=s+f;
            f=temp;
            System.out.print(s+" ");
            count++;

    }


                }

    }

