
import java.util.Arrays;
import java.util.Scanner;

// 
class solution {
   public static String[] getCode(String input) {
      if (input.length() == 0) {
         String[] ans = { "" };
         return ans;
      }
      char ans2 = ' ';
      String[] ans = { "" };
      if (input.length() > 1 && Integer.parseInt(input.substring(0,2))<=26) {
         ans2 = helper(input.substring(0, 2));
         ans = getCode(input.substring(2));
      }
      String[] small = getCode(input.substring(1));

      char ans1 = helper(input.substring(0, 1));

      String[] finalAns = new String[small.length + ans.length];

      for (int i = 0; i < small.length; i++) {
         finalAns[i] = ans1 + small[i];
      }
      int k = 0;
      for (int i = small.length; i < finalAns.length; i++) {
         finalAns[i] = ans2 + ans[k];
         k++;
      }
      return finalAns;
   }

   public static char helper(String input) {
      int smallAns = Integer.parseInt(input);
      return (char) (smallAns + 'a' - 1);
   }

   public static void main(String[] args) {
      System.out.println(Arrays.toString(getCode("1234")));
   }
}