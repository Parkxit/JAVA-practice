import java.util.Scanner;

public class Sumtill_x
{
    Scanner sc= new Scanner(System.in);

    private int sum=0;


    private void printsum()
    {
        System.out.println(sum);
    }

    int getnum()
    {
        int num;
        do{
            System.out.println("Enter number: ");
            try {
                num = sc.nextInt();
            }
            catch (Exception e) {
                return sum;
            }
            if(num=='x' || num=='X')
            {
                return sum;
            }
            else {
                sum += num;
            }
           }while(num!='x' || num!= 'X');

          return 0;
    }

    public static void main(String[] args)
    {
        Sumtill_x num = new Sumtill_x();
        num.getnum();
        num.printsum();
    }
}
