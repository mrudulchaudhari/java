public class java02 {
    public static void main(String[] args) {
//        Widening Casting (automatic) - converting a smaller type to a larger type size
//        byte -> short -> char -> int -> long -> float -> double
//
//        Narrowing Casting (manual) - converting a larger type to a smaller type size
//        double -> float -> long -> int -> char -> short -> byte

        // Widening casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrow casting
        double d1 = 9.4;
        int n1 = (int) d1;
        System.out.println(d1);
        System.out.println(n1); // output will be 9

        final int MAXSCORE = 500;
        int totalScore = 423;

        double percentage = (double) totalScore / MAXSCORE * 100;
        System.out.println(percentage);



    }
}
