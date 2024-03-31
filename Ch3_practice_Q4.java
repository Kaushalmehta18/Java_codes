import java.util.Scanner;

public class Ch2_practice_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string :");
        String str =sc.nextLine();
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
        sc.close();
    }
}
