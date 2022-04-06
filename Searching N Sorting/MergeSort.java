class Solution {

    public static void merge(int arr1[], int arr2[]) {

        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                k+=1;
                i+=1;
                

            } else {
                ans[k] = arr2[j];
                k+=1;
                j+=1;
               
            }
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            k++;
            i++;

        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        printarr(ans);
    }

    public static void printarr(int arr[]) {
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------------------");
    }

    public static void main(String[] args) {
        merge(new int[] {10 ,100, 500 }, new int[] {4 ,7 ,9 ,25, 30, 300, 450});
    }
}