class Solution {

    public static void InsertionSort(int[] arr) {
        // Your code goes here

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 1,7,4,0,9,4 };
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        // Sort(new int[] { 0, 1, 1, 0, 1, 0, 1 },2);
        // int arr[] = Sort(new int[] { 0, 1, 1, 0, 1, 0, 1 }, new int[] { 0, 1, 1, 0,
        // 1, 0, 1 });
        // print(arr);
    }
}