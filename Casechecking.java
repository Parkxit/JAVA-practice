import java.util.Scanner;

public class Casechecking {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(casecheck(str));
    }

    private static boolean casecheck(String str) {
        char m=str.trim().charAt(0);
            return (m>='A' && m<='Z');
    }
}
