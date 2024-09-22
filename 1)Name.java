import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        String name;
        System.out.print("Enter name: ");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Hello "+ name+". Nice to meet you. How are you doing?");
    }
}

