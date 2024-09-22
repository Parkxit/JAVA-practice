import java.util.Scanner;
import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        //pattern1(n);  // stars in square
        //pattern2(n);  // stars as a right-angled triangle
        //pattern3(n);  // right-angled triangle reflection in x-axis
        //pattern4(n);  // numbers in a right-angled triangle
        //pattern5(n);  // pattern2 and pattern3 one below the other
        //pattern6(n);  // mirror img of right-angled triangle
        //pattern7(n);  // reflection of pattern6 in x-axis
        //pattern8(n);  // star pyramid of odd number of stars
        //pattern9(n);  // reverse star pyramid of even number of stars
        pattern10(n);   // star pyramid
    }


    static void pattern1(int n) // stars in each row equal to no. of rows
    {
        //1: outer=rows
        for(int i=0;i<n;i++)
        {
            //each row how many
            for(int j=0;j<n;j++)
            {
                //3:what
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern2(int n)  //right angled triangle start pattern
    {
        //step 1 ..outer loop = no of rows

        for(int i=0;i<n;i++)
        {
            //step 2... for each row how many columns and what type of elements
            for(int j=0;j<=i;j++)
            {
                //step 3..what to print
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void pattern3(int n) //down mirror img of right angled triangle
    {
        //1:outer=rows
        for(int i=0;i<n;i++)
        {
            //2:how many in each row?
            for(int j=n-i;j>0;j--)
            {
                //what?
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern4(int n)
    {
        //1:outer=rows
        for(int i=1;i<=n;i++)
        {
            //2:how many in each row?
            for(int j=1;j<=i;j++)
            {
                //what?
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //how many in each
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static void pattern6(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    static void pattern7(int n)
    {
        //1:outer=rows
        for(int i=0;i<n;i++)
        {
            //2:how many in each?
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern8(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++)
            {
                System.out.print("*");
            }
            for(int l=1;l<n-i;l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n)
    {
       for(int i=1;i<=2*n;i+=2)
       {
           for(int k=1;k<i;k+=2)
           {
               System.out.print(" ");
           }
           for(int j=2*n-i;j>0;j--)
           {
               System.out.print("*");
           }
           for(int j=1;j<i;j+=2)
           {
               System.out.print(" ");
           }
           System.out.println();
        }
    }

    static void pattern10(int n)
    {
        for(int i=0;i<n;i++)
        {

        }
    }
}
