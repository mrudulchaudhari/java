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
    }
}