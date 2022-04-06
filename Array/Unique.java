import java.util.Scanner;

class Runner {

    public static int findUnique(int[] arr) {
        // Your code goes here
      
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (j = j; j < arr.length; j++) {
                if(i!=j){
                if (arr[i] == arr[j]) {
                    break;
                }
            }
        }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; ++i) {
            input[i] = sc.nextInt();
        }
        System.out.println(findUnique(input));
    }
}