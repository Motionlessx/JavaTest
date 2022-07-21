import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 4;
//        int sum = getSum(10, 22);
//        System.out.println(sum);
//        showSum(10, 20, 30);
//        String name = sc.nextLine();
//        sayHello("name");

//        sum = getSum(10, 33, 45);
//        System.out.println("sum: " + sum);



        int[] array = {10, 20, 30, 40, 50};
        int sum = getSum(array);
        System.out.println();
        System.out.println(sum + 100);
        System.out.println();
        division(10, 10);

    }
    static int getSum (int x, int y) {
        int sum = x + y;
        return sum;
    }

    static int getSum (int x, int y, int w) {
        int sum = x + y + w;
        return sum;
    }

    static int getSum (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum is: " + sum);
        return sum;

    }

//    static void showSum(int x, int y, int w) {
//        int sum = x + y + w;
//        System.out.println("Sum: " + sum);
//    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void division (int a, int b) {
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("zxczxc");
        }
        finally {
            System.out.println("WWWWWW");
        }
    }
}
