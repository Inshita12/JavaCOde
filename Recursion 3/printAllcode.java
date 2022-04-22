import java.util.Arrays;
import java.util.Scanner;

// 
class solution {
   public static void getCode(String input) {
      String output = "";
      helper(input, output);
      return;
   }
   public static void helper(String input, String output) {
      if (input.length() == 0) {
         System.out.println(output);
         return;
      }
      if (input.length() > 1 && Integer.parseInt(input.substring(0, 2)) <= 26) {
         char ans2 = helper2(input.substring(0, 2));
         helper(input.substring(2), output + ans2);
      }
      char ans1 = helper2(input.substring(0, 1));
      helper(input.substring(1), output + ans1);
   }
   public static char helper2(String input) {
      int smallAns = Integer.parseInt(input);
      return (char) (smallAns + 'a' - 1);
   }
   public static void main(String[] args) {
      getCode("1234");
   }
}
