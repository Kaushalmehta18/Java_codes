// WAP to find out wheather a student is pass or fail , if it requires total 40% marks and atleast 33% in each subject to pass 
import java.util.Scanner;

public class Ch4_practice_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks ->");
        System.out.print("Enter your sub1 marks :");
        float sub1 = sc.nextFloat();
        System.out.print("Enter your sub2 marks :");
        float sub2 = sc.nextFloat();
        System.out.print("Enter your sub3 marks :");
        float sub3 = sc.nextFloat();

        float per = ((sub1+sub2+sub3)/300)*100;
        if(sub1>33.0f && sub2>33.0f && sub3>33.0f && per>40.0f){
            System.out.println("Student get passed in the exam !!");
        }else{
            System.out.println("Student is failed !!");
        }
        sc.close();
    }
}
