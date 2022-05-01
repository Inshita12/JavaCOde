class Solution {
    public static int[] leftLarge(int n, int[] arr) {
        int[] arr1 = new int[arr.length];
        int max = Integer.MIN_VALUE;int i = 0;
        int j=0;
        for ( i = 0,j=0; i < n && j<arr1.length; i++,j++) {      
                if (arr[i] > max) {
                    max = arr[i];
                    arr1[j] = max;
                }
                else{
                   arr1[j] = max;
                }
        }
        // public static int[] leftLarge(int n, int[] arr) {
        //     for (int i = 1; i < arr.length; i++)
        //         Math.max(arr[i], arr[i - 1]);
        //     return arr;
        // }

      return  arr1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,4,1};
        int n = 4;
        int a[]=leftLarge(n, arr);
       for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
       }
    }
}