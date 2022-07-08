public class Mfp {
    public static void main (String[] args) {
        hello("world");
        hello("user");

        Square s = new Square(5);
        System.out.println(s.area());

        Rectangle r = new Rectangle(4, 5);
        System.out.println(r.area());

        Triangle t = new Triangle(4, 5, 6);
        System.out.println(t.area());
    }
    public static void hello (String somebd) {
        System.out.println("hello " + somebd);
    }
    public static void zazz() {
        System.out.println("zozz");
    }

}

