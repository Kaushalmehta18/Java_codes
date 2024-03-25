// WAP to convert Kilometer into Miles
import java.util.Scanner;

public class Ch1_practice_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Kilometer value :");
        float KM = sc.nextFloat();
        float Miles = (KM*0.62f);
        System.out.println(KM +" Kilometer is = "+ Miles +" Miles");
        sc.close();
    }
}
