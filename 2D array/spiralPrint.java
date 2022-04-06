import java.util.*;

class Solution {

    public static void spiral(int input[][]) {
        int row = input.length;
        int col = input[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < input.length; i++) {
            // right
            for (int j = i; j < col-i; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
            // down
            for (int j = i+1; j < row-i; j++) {
                System.out.print(input[j][col - 1-i] + " ");
            }
            System.out.println();
            // left
            for (int j = col - 1 - 1-i; j >= i; j--) {
                System.out.print(input[row - 1-i][j] + " ");
            }
            System.out.println();
            // up
            for (int j = row - 1 - 1-i; j > i; j--) {
                System.out.print(input[j][i] + " ");
            }
            System.out.println();
            System.out.println();

        }

    }

    public static void main(String[] arg) {
        // Scanner s = new Scanner(System.in);
        // int rows = s.nextInt();
        // int colu = s.nextInt();
        // int input[][] = new int[rows][colu];
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < colu; j++) {
        // input[i][j] = s.nextInt();
        // }
        // }
        // spiral(input);
        spiral(new int[][] { { 11, 12, 13, 14, 15, 16, 17, 18, 19 }, { 21, 22, 23, 24, 25, 26, 27, 28, 29 },
        { 31, 32, 33, 34, 35, 36, 37, 38, 39 }, { 41, 42, 43, 44, 45, 46, 47, 48, 49 },
        { 51, 52, 53, 54, 55, 56, 57, 58, 59 }, { 61, 62, 63, 64, 65, 66, 67, 68, 69 },
        { 71, 72, 73, 74, 75, 76, 77, 78, 79 }, { 81, 82, 83, 84, 85, 86, 87, 88, 89 },
        { 91, 92, 93, 94, 95, 96, 97, 98, 99 } });     }

}
