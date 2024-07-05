public class Ch6_practiceQ7 {
    public static void main(String[] args) {
        int [] arr= {1,2,4,5,65};
        
        int notsort = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                // System.out.println("The array is sorted !!");
            }else{
                // System.out.println("the array is not sorted !!");
                notsort +=1;
            }
        }
        if(notsort==0){
            System.out.println("The array is sorted !!");
        }else{
            System.out.println("the array is not sorted !!");
        }
    }
}
