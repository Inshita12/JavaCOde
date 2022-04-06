class Solution {
    public static void printarr(int arr[]) {
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------------------");
    }

    public static int arrayRotateCheck(int[] arr) {
        // Your code goes here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return (i + 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(arrayRotateCheck(new int[] { 5, 6, 1, 2, 3, 4 }));

    }
}