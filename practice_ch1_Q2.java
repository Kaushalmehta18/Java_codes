import java.util.Scanner;

public class practice_ch1_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your three subject marks :");
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float per = ((sub1+sub2+sub3)/300)*100;
        float CGPA = (per / 1)/9.5f;
        System.out.print("Your current semester CGPA is :"+CGPA);
        sc.close();
    }
}
