class Solution {

    public static int binarySearch(int[] arr, int x) {
        // Your code goes here
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length;
            while (start < end) {
                int mid = (start + end) / 2;

                if (arr[mid] == x) {
                    return mid;
                } else if (arr[mid] > x) {
                    end = mid - 1;
                } else if (arr[mid] < x) {
                    start = mid + 1;
                }
            }
        }
        return arr[i];
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] { 1, 3, 7, 9, 11, 12, 45 }, 9));
        // Sort(new int[] { 0, 1, 1, 0, 1, 0, 1 },2);
        // int arr[] = Sort(new int[] { 0, 1, 1, 0, 1, 0, 1 }, new int[] { 0, 1, 1, 0,
        // 1, 0, 1 });
        // print(arr);
    }
}