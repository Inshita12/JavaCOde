class Solution {
    public static void printarr(int arr[]) {
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------------------");
    }

    public static void Sort(int arr[]) {
        int i = 0;
        int temp = 0;
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[temp]=arr[i];
                temp++;
            
            } 
        }
        // System.out.println(temp);
        // System.out.println(count);
        for (int k = temp; k < arr.length; k++) {
            arr[k] = 0;
        }
        printarr(arr);
    }

    public static void main(String[] args) {
        Sort(new int[] { 2, 0, 0, 1, 3, 0, 0 });
    }
}