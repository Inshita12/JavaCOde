
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int a[] = { -2, 3, 4, -1, -3, 1, 2, -4, 0 };
        int k = 0;
        int min = 0;
        for (int j = 0; j < 8; j++) {
            min = a[j];
            for (int i = j + 1; i < 9; i++) {
                if (min > a[i]) {
                    min = a[i];
                    k = i;
                }
            }
            int temp = a[j];
            a[j] = a[k];
            a[k] = temp;
        }

        for (int i = 0; i < 9; i++) {
        System.out.print(a[i]+" ");
        }
    }
}
