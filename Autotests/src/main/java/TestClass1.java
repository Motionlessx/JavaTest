import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class TestClass1 {

    public static void main(String[] args) {
//        for (int i = 0; i <= 8; i++) {
//
//            System.out.print("*");
//            for (int j = 8; j > i; j--){
//                if (j == i)
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int a = 5, b = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a + i - 1); j++) {
                if (j <= (a - i)) {
                    System.out.print(' ');
                    b++;
                } else {
                    System.out.print('*');
                }
            }
            for (int j = 1; j <= b; j++) {
                System.out.print(' ');
            }
            b = 0;
            System.out.println();
        }


        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((i + j) % 2 == 0) System.out.print(board[i][j] = "B ");
                else System.out.print(board[i][j] = "W ");

            }
            System.out.println();
        }


        String jsText = "<script>\n" +
                "(function(arg) {\n" +
                "    var _pxl = document.createElement(\"script\");\n" +
                "    _pxl.type = \"text/javascript\";\n" +
                "    _pxl.defer = true;\n" +
                "    _pxl.setAttribute('data-hmtrackerscriptquery', JSON.stringify(arg));\n" +
                "    _pxl.src = \"https://leads-inst334-client.phonexa.xyz/hitmetrix/analize.js?v=65131df4bc2f2dc\";\n" +
                "    document.getElementsByTagName(\"head\")[0].appendChild(_pxl);\n" +
                "})({\"token\": \"11f84321c0391a4741e2250256d2ffa3272a5532\"});\n" +
                "</script>";
        jsText = jsText.replaceAll("\\<.*?>", "");//driver.findElement(By.xpath("//textarea[@id='jsFormCode']")).getText();

//        jsText = jsText.replaceAll("\\<.*?>", "");
        System.out.println(jsText);


        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);

        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
//        System.out.println(list.size());





    }


}










