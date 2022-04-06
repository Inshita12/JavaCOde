class solution {
    public static int helper(int input[], int first, int last, int element) {       
        if(last-first<0){
            return -1;
        }
        int mid = (first + last) / 2;
        if (element == input[mid]) {
            return mid;
        }
        else if (element > input[mid]) {
            return helper(input, mid + 1, input.length - 1, element);
        }
        else if (element < input[mid]) {
            return helper(input, 0, mid - 1, element);
        }
        return 0;
    }
    public static int binarySearch(int input[], int element) {
        return helper(input, 0, input.length - 1, element);
    }
    public static void main(String[] args) {
        int[] input = {10,11,13,15,16,18,20};
        int element = 20;
        System.out.println(binarySearch(input, element));
    }
}
  