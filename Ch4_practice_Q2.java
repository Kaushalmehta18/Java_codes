// Calculate income tax paid by an employee to the government as per the slots :
// 2.5L - 5.0L ----- 5%
// 5L - 10L -------- 20%
// above 10L ------- 30%
import java.util.Scanner;

public class Ch4_practice_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income :");
        float income = sc.nextFloat();
        float tax;

        if(income >= 250000 && income <= 500000){
            tax = (income)*(5.0f/100);
            System.out.println("You have to pay "+tax+" as tax !!");
        }
        else if(income >= 500000 && income <= 1000000){
            tax = (income)*(20.0f/100);
            System.out.println("You have to pay "+tax+" as tax !!");
        }
        else if(income >= 1000000){
            tax = (income)*(30.0f/100);
            System.out.println("You have to pay "+tax+" as tax !!");
        }else{
            System.out.println("You don't have to pay any tax !!");
        }
        sc.close();
    }
}
