import java.util.Scanner;

public class HcfandLcm {
    Scanner sc= new Scanner(System.in);
    private int num1, num2;

    void printlcm()
    {
        int j=1;
        if(num1>num2) {
            while (true) {
                int a = num1 * j;
                j++;
                if (a % num2 == 0) {
                    System.out.println("LCM: "+a);
                    break;
                }
            }
        }

        else{
            while (true) {
                int a = num1 * j;
                j++;
                if (a % num2 == 0) {
                    System.out.println("LCM: "+a);
                    break;
                }
            }

        }

    }

    void printhcf()
    {
        int i;
        if(num1>num2) {
            for (i = 2; i <= num2; i++)
            {
                if(num2%i==0 && num1%i==0)
                {
                    System.out.println("HCF: "+i);
                    break;
                }
                if(i==num2)
                {
                    System.out.println("HCF: 1");
                }
            }


        }

        else {
            for ( i = 2; i <= num1; i++)
            {
                if(num2%i==0 && num1%i==0)
                {
                    System.out.println("HCF: "+i);
                    break;
                }
                if(i==num1)
                {
                    System.out.println("HCF: 1");

                }
            }


        }
        }

    void getnums()
    {
        System.out.println("Enter two numbers: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
    }

    public static void main(String[] args)
    {
        HcfandLcm obj = new HcfandLcm();

        obj.getnums();
        obj.printhcf();
        obj.printlcm();
    }


}
