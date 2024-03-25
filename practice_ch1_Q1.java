// WAP to sum of three numbers
import java.util.Scanner;

public class practise_ch1_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        System.out.println("The sum of numbers are :"+ sum);
        sc.close();
    }
}
