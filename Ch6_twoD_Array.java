import java.util.Scanner;

public class Ch6_twoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2-D array :
        int [][] flats = new int [2][3];
        /* 
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        */

        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print("Enter your flats number :");
                flats[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        // 3-D array :
        // int [][][] flats = new int [2][2][2];

        // for(int i=0;i<flats.length;i++){
        //     for(int j=0;j<flats[i].length;j++){
        //         for(int k=0;k<flats[j].length;k++){
        //             System.out.print("Enter your flats number :");
        //             flats[i][j][k] = sc.nextInt();
        //         }
        //     }
        // }

        // for(int i=0;i<flats.length;i++){
        //     for(int j=0;j<flats[i].length;j++){
        //         for(int k=0;k<flats[j].length;k++){
        //             System.out.print(flats[i][j][k]);
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(" ");
        // }
        sc.close();
    }
}
