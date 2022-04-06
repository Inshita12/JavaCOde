import java.util.Scanner;

class Solution {

    public static void findLargest(int mat[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int sumrow = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sumrow += mat[i][j];
            }
            if (sumrow > largest) {
                largest = sumrow;
            }
        }
        int k = 0;
        int i=0;
        for ( k = 0; k < mat[0].length; k++) {
            int sumcol = 0;
            for (int l = 0; l < mat.length; l++) {
                sumcol += mat[l][k];
                // System.out.println("col is" + k + "row is" + l);
            }
            if (sumcol > largest) {
                largest = sumcol;
            }
          i=k;
          

        }          
        System.out.println("column" + " " + i + " " + largest);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int colu = s.nextInt();
        int mat[][] = new int[rows][colu];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colu; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        findLargest(mat);
    }
}