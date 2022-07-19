import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 4;
        int sum = getSum(10, 22);
        System.out.println(sum);
        showSum(10, 20, 30);
//        String name = sc.nextLine();
        sayHello("name");

    }
    static int getSum (int x, int y) {
        int sum = x + y;
        return sum;
    }

    static void showSum(int x, int y, int w) {
        int sum = x + y + w;
        System.out.println("Sum: " + sum);
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
