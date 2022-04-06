class Solution {
    public static void printarr(int arr[]) {
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------------------");
    }

    public static int secondLargestElement(int[] arr) {
        // Your code goes here
        int max = arr[0];
        int secmax=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
         

        }
        for(int j=0;j<arr.length;j++){
            if( arr[j]<max&& secmax<arr[j]){
                secmax=arr[j];
            }
        }
        return secmax;
    }

    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[] { 2, 13, 4, 1, 3, 6, 28 }));
    }
}