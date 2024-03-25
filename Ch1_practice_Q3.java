// WAP which ask user name and greats with Hello <name> , have a good day
import java.util.Scanner;

public class Ch1_practice_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.next();
        System.out.println("Hello "+name+" ,have a good day");
        sc.close();
    }
}
