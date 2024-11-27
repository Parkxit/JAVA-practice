import java.util.Scanner;

public class LeapYear {
    Scanner sc = new Scanner(System.in);
    private int year;

    void getyear()
    {
        System.out.println("Enter the year: ");
        year=sc.nextInt();
    }

     boolean check() {
         if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
             return true;

         }
         return false;
     }

     void display()
    {
        if(check())
        {
            System.out.println("It is a leap year.");
        }
        else
        {
            System.out.println("Not a leap year.");
        }
    }
    public static void main(String[] args) {
        LeapYear ly = new LeapYear();
        do {

            ly.getyear();
            ly.check();
            ly.display();
        }while(ly.year!=0);
    }


}
