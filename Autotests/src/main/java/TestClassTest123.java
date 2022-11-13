public class TestClassTest123 {
//    public static String text() {
//        String name = "Enter '#3540' in input below to delete goal";
//        // String confirmText = driver.findElement(confirmTextArea).getText();//.substring(confirmText.indexOf("'"), confirmText.indexOf("'"));
//        name.substring(name.indexOf(" '"));
//        return name;
//    }

    static int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public enum Enums {
        MONDAY(1, "P"),
        FRIDAY(5, "F"),
        TUESDAY(2, "V");

        private int value;
        private String l;

        Enums(int value, String l) {
            this.value = value;
            this.l = l;
        }

        public int getValue() {
            return value;
        }

        public String getL() {
            return l;
        }

    }

    static Enums[] values = Enums.values();

    public static void main(String[] args) {
        System.out.println("<----->");
        String str23 = "Enter '#45' in input below to delete item";
        int value223 = Integer.parseInt(str23.replaceAll("[^0-9]", ""));
        System.out.println("#"+value223);

        System.out.println("------");
        arrgfg();
        System.out.println("------");
        arrmain();


        for (Enums value : values) {
            System.out.println(value.ordinal() + " " + value.name() + " " + value.getValue() + " " + value.getL());
        }

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//объявили массив и заполнили его элементами
//        for (int i = 0; i < 3; i++) {  //идём по строкам
//            for (int j = 0; j < 3; j++) {//идём по столбцам
////                    if (i == j)
//                System.out.print(arr[i][arr.length - i] + " "); //вывод элемента
//            }
//            System.out.println();//перенос строки ради визуального сохранения табличной формы
        System.out.println();

        int rowsCount = array[0].length;
        for (int row = 0; row < rowsCount; row++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                int cell = array[i][row];
                sum += cell;
                // debug (remove next line if not needed!)
//                System.out.print(cell + (i < array.length - 1 ? " + " : " = "));
            }

            System.out.print(sum + " ");
        }
        System.out.println();


//  главная

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

//  Побочная
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - 1 - i] + " ");
        }
        System.out.println();


        sums(array);
        System.out.println();

        poly(arr23);


    }

    public static int sums(int[][] source) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];

            }
            System.out.print(sum + " ");
            sum = 0;
        }
        return sum;


    }

    static int[] arr23 = {1, 1, 2, 3, 3, 2, 1, 2};

    public static void poly(int[] srcc) {
        boolean b = true;
        int len = srcc.length;
        for (int i = 0; i < len / 2; i++) {
            if (srcc[i] != srcc[len - i - 1]) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.print("Yes ");
        }
        else {
            System.out.println("No ");
        }
    }

    public static void arrgfg() {
    int[][] arr545 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//объявили массив и заполнили его элементами
        for (int i = 0; i < arr545.length; i++) {  //идём по строкам
            for (int j = arr545.length - 1; j >= 0; j--) {//идём по столбцам
                if (j == arr545.length - 1 - i)
                    System.out.print(arr545[i][j] + " "); //вывод элемента
            }

        }
        System.out.println();
        System.out.println("----");//перенос строки ради визуального сохранения табличной формы



    }

    public static void arrmain() {
        int[][] arr545 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr545.length; i++) {
            for (int j = 0; j < arr545.length; j++) {
                if (j == i)
                    System.out.print(arr545[i][j] + " ");
            }

        }
        System.out.println();
    }
        }






