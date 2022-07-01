public class Mfp {
    public static void main (String[] args) {
        hello("world");
        hello("user");

        Square s = new Square(5);
        System.out.println(area(s));

        Rectangle r = new Rectangle(4, 5);
        System.out.println(area(r));
    }
    public static void hello (String somebd) {
        System.out.println("hello " + somebd);
    }

    public static double area(Square s) {
        return s.l * s.l;
    }
    public static double area(Rectangle r) {
        return r.a * r.b;
    }
}

