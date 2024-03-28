// WAP to encrypt a grade by adding 8 in it.Decrypt it to show the actual grade
import java.util.Scanner;

public class Ch2_practice_Q1 {
    public static void main(String[] args) {
        // Encrypted grade
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Grade :");
        char grade = sc.next().charAt(0);
        char newgrade = (char)(grade+8);
        System.out.println("Encrypted Grade :"+ newgrade);

        // Decrypted grade
        char actual_grade = (char)(newgrade-8);
        System.out.println("Decrypted Grade :"+ actual_grade);
        sc.close();
    }
}
