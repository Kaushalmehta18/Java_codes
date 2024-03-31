// WAP to make a letter template with " Dear <\name> , thanks a lot " replace <\name> with user name 

import java.util.Scanner;

public class Ch2_practice_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.next();
        String template = "Dear <\name> , thanks a lot";
        System.out.println(template.replace("<\name>", name));
        sc.close();
    }
}
