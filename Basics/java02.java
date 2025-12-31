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

        // Operators
        int sum1 = 100 + 50;
        int sum2 = sum1 + 75;
        int sum3 = sum1 + sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);


        // Arithmetic operators
        int a1 = 10;
        int b1 = 3;
        System.out.println(a1 + b1);
        System.out.println(a1 - b1);
        System.out.println(a1 * b1);
        System.out.println(a1 / b1);
        System.out.println(a1 % b1);

        double d11 = 10;
        double d12 = 3;
        System.out.println(d11/d12);

        int z = 5;
        z++;
        System.out.println(z); //6
        System.out.println(z++); // 6
        System.out.println(++z); //8
        System.out.println(--z); //7
        System.out.println(z--); //7


        // Logical operators
        boolean isLoggedIn = true;
        boolean isSignedIn = false;

        System.out.println(isSignedIn && isSignedIn);
        System.out.println(isSignedIn || isLoggedIn);
        System.out.println(!isSignedIn);

        System.out.println("*********************");


        // Assignment Operators
        int ao1 = 100;
        int ao2 = 30;

        ao1 += 40;
        System.out.println(ao1); // 140
        System.out.println(ao1-=40); //100
        System.out.println(ao2/=3); //10
        System.out.println(ao2*=6); //60
        System.out.println(ao2%=7); //4


        // Comparison Operators
        int co = 100;
        int co2 = 100;
        int co3 = 75;

        System.out.println(co==co2);
        System.out.println(co>=co2);
        System.out.println(co<=co3);
        System.out.println(co>co3);
        System.out.println(co<co3);
        System.out.println(co==co3);
        System.out.println(co!=co2);
        System.out.println("*********************");

//        Order of Operations
//        Here are some common operators, from highest to lowest priority:
//
//        () - Parentheses
//        *, /, % - Multiplication, Division, Modulus
//        +, - - Addition, Subtraction
//        >, <, >=, <= - Comparison
//        ==, != - Equality
//        && - Logical AND
//        || - Logical OR
//        = - Assignment



    }
}
