class Solution {

    public static boolean checkNumber(int input[], int x) {
        if(input.length==0){
            return false;
        }
        if (input[0] == x) {
            return true;
        }

        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }

        boolean smallAns = checkNumber(smallInput, x);
        if (smallAns) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int input[] = { 9, 8, 10 };
        int x = 8;
        System.out.println(checkNumber(input, x));
    }
}

// class Solution {


//     public static boolean helper(int input[], int startIndex, int x) {
//         if (startIndex==input.length) {
//             return false;
//         }
//         if (input[startIndex] == x) {
//             return true;
//         }
//         return helper(input, startIndex + 1, x);

//     }

//     public static boolean checkNumber(int input[],int x){
//         return helper(input, 0, x);
//     }

//     public static void main(String[] args) {
//         int input[] = { 9, 0, 10 };
//         int x = 8;
//         System.out.println(checkNumber(input,  x));
//     }
// }