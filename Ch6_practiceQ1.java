import java.util.Scanner;

public class Ch6_practiceQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [] marks = new float[5];

        for(int i=0;i<marks.length;i++){
            System.out.print("Enter your marks :");
            marks[i] = sc.nextFloat();
        }

        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum +=marks[i];
        }
        System.out.print("the sum of marks is : "+sum);
        sc.close();
    }
}
