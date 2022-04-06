class Solution {
    public static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = max < arr[i] ? arr[i] : max;
        }
        return max;
    }
    public static void intersections(int arr1[], int arr2[]) {
        int hash1[] = new int[max(arr1) + 1];
        int hash2[] = new int[max(arr2) + 1];
        for (int i = 0; i < arr1.length; i++)
            hash1[arr1[i]]++;
        for (int i = 0; i < arr2.length; i++)
            hash2[arr2[i]]++;
        int big = arr1.length > arr2.length ? arr1.length : arr2.length;
        for (int i = 0; i < big; i++)
            if (hash2.length > arr1[i] && hash1[arr1[i]] == hash2[arr1[i]])
                System.out.println(arr1[i]);
    }

    public static void main(String[] args) {
        intersections(new int[] { 2, 6, 8, 5, 4, 3 }, new int[] { 2, 3, 4, 7 });
    }
}