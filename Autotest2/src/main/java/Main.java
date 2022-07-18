import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int i;
        int[] arr = new int[15];
        for (i = 0; i < 15; i++) {
            arr[i] = i * 1;

        }
        System.out.println(arr[arr.length - 1]);

        System.out.println();


        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(20);
        list.set(0, 200);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.size());

    }


}
