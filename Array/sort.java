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
            if (arr[i] == 0) {
                temp++;
            } else if (arr[i] == 1) {
                count++;
            }

        }
 for (int j = 0; j < temp; j++) {
     arr[j]=0;
 }
 for(int k=temp;k<arr.length;k++){
        arr[k]=1;
 }

        printarr(arr);
    }

    public static void main(String[] args) {
        Sort(new int[] { 0, 1, 1, 0, 1, 0, 1 });
    }
}