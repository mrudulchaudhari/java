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
    }

}
