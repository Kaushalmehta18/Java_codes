public class Ch6_practiceQ3 {
    public static void main(String[] args) {
        int [] marks = {23,45,65,74,48};
        int sum =0;
        for(int elements : marks){
            sum+=elements;
        }

        int avg = sum/marks.length;
        System.out.println(avg);
    }
}
