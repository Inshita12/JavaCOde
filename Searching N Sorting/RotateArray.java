class Solution {
    public static void printarr(int arr[]) {
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------------------");
    }

    public static void rotate(int[] arr, int d) {
        // Your code goes here
        int temp[] = new int[d];
        int i = 0;
        for (i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        printarr(temp);
        int j = d;
        for (j = d; j < arr.length; j++) {
            arr[j - d] = arr[j];
        }
        printarr(arr);
        i = 0;
        for (int k = arr.length - d; k < arr.length; k++) {
            arr[k] = temp[i];
            i++;
        }
        printarr(arr);
    }

    public static void main(String[] args) {
        rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2);
    }
}public class RotateArray {
    
}
