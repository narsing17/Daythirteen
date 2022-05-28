package max.com;

public class GenericsString {
    public static Integer compareToInteger(Integer a, Integer b, Integer c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static Float compareToFloat(Float a, Float b, Float c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }


    public static String compareToString(String str1, String str2, String str3) {

        int a = str1.compareTo(str2);
        int b = str1.compareTo(str3);
        int c = str2.compareTo(str3);

        //    System.out.println(a + " " + b + " " + c);

        if (a > b && a > c) {
            return str1;
        } else if (b > c) {
            return str2;
        } else {
            return str3;
        }

    }

    public static void main(String[] args) {
        // Welcome to Generics program.

        System.out.println("Maximum number out of three is: " + compareToInteger(5, 7, 8));
        System.out.println("Maximum number out of three is: " + compareToFloat(-5f, -7f, -8f));
        System.out.println("Maximum among three is: " + compareToString("Apple", "Peach", "Banana"));
    }
}
