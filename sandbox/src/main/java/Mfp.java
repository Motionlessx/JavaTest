public class Mfp {
    public static void main (String[] args) {
        hello("world");
        hello("user");

        double x = 5;
        System.out.println(bbs(x));

        double a = 4;
        double b = 6;
        System.out.println(bbs(a, b));
    }
    public static void hello (String somebd) {
        System.out.println("hello " + somebd);
    }

    public static double bbs (double l) {
        return l * l;
    }
    public static double bbs (double a, double b) {
        return a * b;
    }
}

