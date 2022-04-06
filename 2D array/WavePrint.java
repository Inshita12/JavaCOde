import java.util.*;

class Solution {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int colu = s.nextInt();
        int input[][] = new int[rows][colu];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colu; j++) {
                input[i][j] = s.nextInt();

            }

        }
        int j = 0;
        int i = 0;
        j = input[0].length;

        for (i = 0; i < colu; i++) {

            for (j = 0; j < rows; j++) {
                System.out.print(input[i][j] + " ");

            }
        }
    }
}
