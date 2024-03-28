public class Ch2_operators {
    public static void main(String[] args) {
        // Types of operators
        // 1.Arithematic operator
        int num1 = 34;
        int num2 = 54;
        int sum = (num1+num2);
        int mod = (num1%num2); //modulous gives remainder as output
        System.out.println(sum);
        System.out.println(mod);

        // 2. Assignment operator
        num1 +=67;
        System.out.println(num1);

        // 3. Comprasion operator 
        System.out.println(num1==num2);

        // 4. Logical operator
        System.out.println(67>8 && 67>7);

        // 5. Bitwise operator
        System.out.println(2&3);
        //  10
        //  11
        // ----
        //  10

    }
}