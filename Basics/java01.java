class java01{


    public static void main(String[] args) {
    //public - accessible from anywhere. JVM is outside this class, therefore it should be able to access it
    // static - belongs to class and not an object, calls main() without creating any object
    // we need a static object because if we ask JVM to create object, it wont how to create, as it wont know about the constructor

    // void - returns nothing, doesnt give any value to JVM
    // main - name of the method, JVM looks for this method name
    // we can override main method, but it will only call the one with (String[] args
    // we cannot override main method as static methods cannot be overriden.

    // (String[] args) - parameter that receives command line arguments, it can be String[] mrudul as well,



        System.out.print("Hello Mrudul");
        // System is a final class in java that has static methods which need not be instantiated and directly used for
        // operations, commonly the System.out and System.in
        // here System.in is a stream used to take data in your computer from console,
        // here System.out is used to put out data on console

        //println(), print(), printf()

        System.out.println();
        int x = 5;
        int y = 6;
        System.out.println("Hello the number is "+ x + y);
        // Here it shows 56 because it first converts x, i.e 5 to string and then y to string

        System.out.println("Hello the number is "+(x+y));
        // Where as we calculate (x+y) -> (5+6) = 11, which eventually gets converted to string.

        /*
        This is example of a
        multiline
        comment.
         */

        // Variables
//        String - stores text, such as "Hello". String values are surrounded by double quotes
//        int - stores integers (whole numbers), without decimals, such as 123 or -123
//        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//        boolean - stores values with two states: true or false

        int mrudul;
        mrudul = 20;
        System.out.println(mrudul);

        /*
        Type        Size        Range/Precision
        byte        1           -128 to 127
        short       2           -32768 to 32767
        int         4           -2^31 to 2^31 - 1
        long        8           -2^63 - 2^63 - 1
        float       4           ~6-7 decimal digits
        double      8           `15-16 decimal digits
        char        2            0 to 65,535 (Unicode)
        boolean  jvm-dependent   true or false

         */

        byte num= 100;
        short num2= 12000;
        int num3 = 120134;
        long num4 = 123141244;
        float num5 = 5.75f;
        double num6 = 5.3141513343452524d;
        float num7 = 35e3f;
        double num8 = 12E4d;

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);

        char c1 = 'A';
        char c2 = '%';
        char c3 = 82;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        String greeting = "Hello world";
        String greeting1 = "A";
        System.out.println(greeting);
        System.out.println(greeting1);


        // var keyword
        var nums = 5;
        System.out.println(nums);
        // it came in Java 10, The var keyword lets the compiler automatically detect
        // the type of a variable based on the value you assign to it.



        // Non-primitive data types depend on JVM implementation
        // object size depends on
        // object header
        // pointer size (32-bit or 64-bit jvm)
        // internal fields

        // Java Constants
        // final keyword

        // we use final when we know we would not change the value that the identifier holds
        final int MINUTES_PER_HOUR = 60;
        System.out.println(MINUTES_PER_HOUR);

        int length = 4;
        int width = 6;
        int area;
        area = length * width;

        System.out.println(area);
    }
}