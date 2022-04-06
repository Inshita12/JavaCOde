import java.util.Scanner;

class Runner {
    public static void printarr(int[] arr) {
        System.out.println("-----------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n-----------------------------------");
    }

    public static int findUnique(int[] arr) {
        int hash[] = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            hash[arr[i]]++;
            // System.out.println(temp);
            // printarr(hash);
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findUnique(new int[] { 5, 3, 1, 5, 1, 3, 4, 7, 4, 8, 8 }));
    }
}