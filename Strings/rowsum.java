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

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < colu; j++) {
                sum += input[i][j];
            }
            System.out.println(sum);
        }
    }
}