// WAp to check a number is entered is integer od not
import java.util.Scanner;

public class practice_ch1_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        System.out.print("Enter a number :");
        boolean check = sc.hasNextInt();
        if (check == true) {
            System.out.println("Entered number is Integer !!");
        }else{
            System.out.println("Entered number is not an Integer !!");
        }
        sc.close();
    }
}
