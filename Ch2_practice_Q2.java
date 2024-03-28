// Use a comprasion operator to check whaether a given number is grater than the user entered value
import java.util.Scanner;

public class Ch2_practice_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int given_num = 99;
        System.out.print("Enter any number :");
        int user_num = sc.nextInt();
        if (given_num>user_num) {
            System.out.println("Given number is greater than User entered value ");
        }else{
            System.out.println("User entered value is greater than the Given number");
        }
        sc.close();
    }
}
