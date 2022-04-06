
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("rows:");
        int row = s.nextInt();
        System.out.println("cols:");
        int col = s.nextInt();
        int a[][] = new int[10][10];

        System.out.println("before:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("after:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
    }
}