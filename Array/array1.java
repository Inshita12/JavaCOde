
import java.util.Scanner;

public class array1 {

    static void max(int a[], int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);

        int max2 = a[0];
        for (int i = 1; i < n; i++) {
            if (max2 < a[i] && a[i] < max) {
                max2 = a[i];
            }
        }
        System.out.println(max2);

        int max3 = a[0];
        for (int i = 1; i < n; i++) {
            if (max3 < a[i] && a[i] < max2) {
                max3 = a[i];
            }
        }
        System.out.println(max3);
    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 17, 7, 25, 3, 100 };

        max(a, 7);
    }
}
