import java.util.Scanner;

public class Ch1_takingInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first number :");   
        int a = s.nextInt();
        System.out.print("Enter your first number :");   
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("The sum is :"+sum);
        // String str =s.nextLine(); 
        s.close();
    }
}
