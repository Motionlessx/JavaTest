import java.util.*;

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
 //       list.remove(0);
//        list.clear();
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(10);

        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(200));
//        list.removeAll(list2);
        System.out.println(list.containsAll(list2));


        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set.size());
        System.out.println("----");

        Iterator<Integer> iterator1 = set.iterator();

//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }

//        for (int j : set) {
//            System.out.println(j);
//        }

        System.out.println();
        System.out.println(set.contains(1));;
        System.out.println(set.size());

        System.out.println("-----");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "black");
        map.put(2, "white");
        map.put(3, "blue");
        System.out.println(map.get(3));

        System.out.println(map.size());
//        map.clear();
//        System.out.println(map.size());

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("blue"));
        System.out.println(map.keySet());

//        Set<Integer> keys = map.keySet();
//        Iterator<Integer> iterator3 = keys.iterator();
//        while (iterator3.hasNext()) {
//            System.out.println(map.get(iterator3.next()));
//        }
        System.out.println(map.get(2));
        map.put(2, "pink");
        System.out.println(map.get(2));
    }


}
