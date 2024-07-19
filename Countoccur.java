import java.util.Scanner;

 class Countoccur {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the number whose occurrences you have to count: ");
       int n=sc.nextInt();
        System.out.println(occur(num,n)+ " times.");
    }

    private static int occur(int num,int n) {
        int count =0;
        while(num>0)
        {
            int temp=num%10;
            if(temp==n)
            {
                count ++;
            }
            num/=10;
        }
        return count;
    }
}
