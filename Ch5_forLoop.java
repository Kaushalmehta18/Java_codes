public class Ch5_forLoop {
    public static void main(String[] args) {
        // using modulous
        int n = 10;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

        // using 2n+1 
        int num  = 10;
        for(int i=0;i<num;i++){
            System.out.println(2*i+1);
        }

        // Decremanting for loop --> print in reverse order
        for(int i=10;i>0;i--){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
