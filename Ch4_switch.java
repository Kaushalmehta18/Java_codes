import java.util.Scanner;

public class Ch4_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();

        // Normal swotch
        switch (age) {
            case 18:
                System.out.println("Your are an Adult now!");
                break;
        
            default:
                System.out.println("Enjoy your life !");
                break;
        }

        // if we doesn't use break , it will run all the code after the matched condition

        // Enhanced switch
        switch (age) {
            case 18 -> System.out.println("Your are an Adult now!");
        
            default -> System.out.println("Enjoy your life !");
        }

        sc.close();
    }
}
