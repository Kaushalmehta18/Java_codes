import java.util.Arrays;
import java.util.Scanner;

public class Ch6_basic {
    public static void main(String[] args) {

        // way to print array in java
        String [] names = {"kaushal","shruti"};
        System.out.println(Arrays.toString(names));


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] marks = new int[n]; // declaration + memory allocation
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
            // System.out.println("array elements : "+marks[i]);
        }

        for(int i=n-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        for(int elements : marks){
            System.out.println(elements);
        }
        sc.close();
    }
}
