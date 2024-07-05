public class Ch6_practiceQ4 {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,4},{3,4,4}};
        int [][] mat2 = {{5,6,4},{7,8,4}};

        int [][] mat3 = new int[2][3];

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                mat3[i][j] = mat1[i][j]+mat2[i][j];
                System.out.print(mat3[i][j]+" "); 
            }
            System.out.println();
        }
    }
}
