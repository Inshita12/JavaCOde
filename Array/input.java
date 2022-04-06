

import java.util.Scanner;

class Runner {
    public static void swapAlternate(int arr[]) {
        // Your code goes here

        for (int i = 0; i < arr.length; i += 2) {

            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }

    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {

            int size = sc.nextInt();
            int[] input = new int[size];
            for (int i = 0; i < size; ++i) {
                input[i] = sc.nextInt();
            }
            swapAlternate(input);
            printArray(input);

            t -= 1;
        }
    }
}