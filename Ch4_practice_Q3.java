// WAP to find out the day of the week given by the number[1 to 7] 
import java.util.Scanner;

public class Ch4_practice_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of the week :");
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter day number between 1 to 7 !!");
        }
        sc.close();
    }
}
