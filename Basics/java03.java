public class java03 {
    // Strings
    public static void main(String[] args) {
        String greeting = "hello";
        System.out.println(greeting.length());
        String a = "Hello";
//        String b = "Hello";
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        String b = "Hello this Is meant to be searched";
        System.out.println(b.indexOf("is"));
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(4));


        String a1 = "Hello";
        String b1 = "Greeting";
        String b2 ="Great things";
        System.out.println(a.equals(a1));
        System.out.println(b1.equals(b2));

        String txt = "   Hello World   ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After:  [" + txt.trim() + "]");

        // Concatenation
        System.out.println(a1 + " " + b1);
        System.out.println(a1 + b1);
        System.out.println(a1.concat(b1));
        String c1 = "Hi ".concat(a1 + " ").concat(b1).concat(" "+b2);
        System.out.println(c1);

        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z); //1020

        // Math
        int minn = Math.min(10, 5);
        int maxx = Math.max(10, 5);
        int abss = Math.abs(-5);
        double poww = Math.pow(2, 8);

        double roundd = Math.round(4.6);  // 5
        double ceill = Math.ceil(4.1);   // 5.0
        double floorr =Math.floor(4.9);  // 4.0

        System.out.println(minn); //5
        System.out.println(maxx); //10
        System.out.println(abss); //5
        System.out.println(poww); //256.0
        System.out.println(roundd); // 5.0
        System.out.println(ceill); // 5.0
        System.out.println(floorr); // 4.0

        double rand = Math.random();
        System.out.println(rand);

        int rand2 = (int) (Math.random() * 101);
        System.out.println(rand2);




    }

}
