import java.util.Scanner;

class PopulateArray {
    public static void arrange(int[] arr, int n) {
        // Your code goes here
        int left=0;
        int right=n-1;
        int num=1;
        while(left<=right){
            if(num%2==0){
               arr[right] =num;
                num++;
                right--;
            }else{
                arr[left]=num;
                num++;
                left++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arrange(arr, n);
        printArray(arr);
    }
}