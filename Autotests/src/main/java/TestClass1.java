import java.util.Arrays;

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
    }
}










