import java.util.Arrays;

public class Ch6_practiceQ5 {
    public static void main(String[] args) {
        // works only with odd elements !!
        
        // int [] arr = {1,2,3,4,5,5,6};
        // int mid = arr.length/2;
        // int swap=0;
        // for(int i=1;i<=mid;i++){
        //     swap = arr[mid-i];
        //     arr[mid-i]=arr[mid+i];
        //     arr[mid+i]=swap;
        // }

        // System.out.println(Arrays.toString(arr));
        
        // works with both odd and even  
        int [] arr = {1,2,3,4,5,6};
        int swap = 0;
        int l = arr.length ;

        for(int i=0;i<=arr.length/2;i++){
            swap = arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=swap;
        }
        System.out.println(Arrays.toString(arr));
    }
}
