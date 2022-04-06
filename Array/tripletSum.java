
class Solution {

    public static int pairSum(int arr[], int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == sum) {
                        count = count + 1;
                    }
                    System.out.println(arr[i] + " " + arr[j]+ " "+arr[k]);

                }
            }

        }
        System.out.println(count);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(pairSum(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 12));
    }
}