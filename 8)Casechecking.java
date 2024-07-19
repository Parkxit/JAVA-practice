import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

class Casechecking {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        casecheck(str);
    }

    private static void casecheck(String str) {
        char m=str.trim().charAt(0);
            if (m>='A' && m<='Z')
            {
                System.out.println("First letter is capital.");
            }
            else if(m>='a' && m<='z')
            {
                System.out.println("First letter is small.");
            }
            else 
            {
                System.out.println(" First letter of string is not a letter.");
            }
    }
}
