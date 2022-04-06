import java.util.*;

class Solution {
    public static void spiral(int input[][]) {
        int row = input.length;
        int col = input[0].length;
        int sum = 0;
        for (int j = 0; j < col; j++) {
            sum += input[0][j];
            sum += input[row - 1][j];
            sum += input[j][0];
            sum += input[j][col - 1];
        }
        for (int i = 1; i <= row - 2; i++)
            sum += input[i][i];
        for (int i = 1, j = row - 2; i <= row - 2; i++, j--)
            sum += input[i][j];
        sum = sum - input[0][0] - input[row - 1][0] - input[0][col - 1] - input[row - 1][col - 1] - input[row / 2][col / 2];
        System.out.println(sum);
    }

    public static void main(String[] arg) {
        spiral(new int[][] { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 },
                { 41, 42, 43, 44, 45 }, { 51, 52, 53, 54, 55 } });
    }
}

// import java.util.*;

// class Solution {
//     public static void spiral(int input[][]) {
//         int row = input.length;
//         int col = input[0].length;
//         int sum = 0;
//         for (int j = 0; j < col; j++)
//             sum += input[0][j];
//         for (int k = 1; k < row; k++)
//             sum += input[k][4];
//         for (int a = col - 1 - 1; a >= 0; a--)
//             sum += input[4][a];
//         for (int b = row - 1 - 1; b > 0; b--)
//             sum += input[b][0];
//         for (int c = 1; c < row - 1; c++) {
//             int j = c;
//             sum += input[c][j];
//         }
//         for (int d = 1, e = col - 1 - 1; d < row - 1; d++, e--)
//             if (d != e)
//                 sum += input[d][e];
//         System.out.println("sum is:" + sum);
//     }

//     public static void main(String[] arg) {
//         spiral(new int[][] { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 },
//                 { 31, 32, 33, 34, 35 }, { 41, 42, 43, 44, 45 }, { 51, 52, 53, 54, 55 } });
//     }
// }