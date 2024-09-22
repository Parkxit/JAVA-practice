package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of elements: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("The entered numbers are: "+ Arrays.toString(arr));

        System.out.println("Enter target number: ");
        int target=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Number found at index "+i);
                return;
            }
        }
        System.out.println("Number not present in array");



    }
}
