class Solution {
    public static int helper(int input[], int endIndex, int x) {
        if (endIndex == 0 ) {
            return -1;
        }
       

        if(input[endIndex]==x){
            return endIndex;
        }
        return helper(input, endIndex - 1, x);
      
    }

    public static int firstIndex(int input[], int x) {
        return helper(input, input.length-1, x);
    }

    public static void main(String[] args) {
        int input[] = { 9,10,5 };
        int x = 8;
        System.out.println(firstIndex(input, x));
    }
}