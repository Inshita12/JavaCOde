import java.util.Scanner;

class a {
   public static int[][] subsets(int input[]) {
      return helper(input, 0);
   }

   public static int[][] helper(int input[], int index) {
      if (index >= input.length) {
         int temp[][] = new int[1][];
         temp[0] = new int[] {};
         return temp;
      }
      int[][] smallAns = helper(input, index + 1);
      int[][] ans = new int[2 * smallAns.length][];
      for (int i = 0; i < smallAns.length; i++) {
         ans[i] = new int[smallAns[i].length];
         for (int j = 0; j < smallAns[i].length; j++) {
            ans[i][j] = smallAns[i][j];
         }
      }
      for (int i = smallAns.length, j = 0; i < ans.length && j < smallAns.length; i++, j++) {
         ans[i] = new int[smallAns[j].length + 1];
         ans[i][0] = input[index];
      }
      
      int k = 0;
      for (int i = smallAns.length; i < ans.length; i++) {
          for (int j = 0; j < smallAns[k].length; j++) {
              ans[i][j + 1] = smallAns[k][j];
          }
          k++;
      }
      return ans;
   }
}

class sd {
   public static void main(String[] args) {
      int[] input = { 11, 12, 13 };
      int output[][] = a.subsets(input);
      for (int i = 0; i < output.length; i++) {
         for (int j = 0; j < output[i].length; j++) {
            System.out.print(output[i][j] + " ");
         }
         System.out.println();
      }
   }
}