import java.util.Scanner;
public class Ch1_exrecise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your marks are out off :");
        float out_off = sc.nextFloat();
        System.out.println("Enter Your marks");
        float ML = sc.nextFloat();
        float TTl = sc.nextFloat();
        float MC = sc.nextFloat();
        float CC = sc.nextFloat();
        float DA = sc.nextFloat();
        float per = ((TTl+ML+MC+CC+DA)/(5*out_off))*100;
        System.out.println("Your percantage is :"+ per);
        sc.close();
    }
}
