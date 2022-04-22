import java.util.*;

class c {
   public static void subsettok(int[] input, int index, ArrayList<Integer> output, int k) {
      if (index == input.length) {
         int sum = 0;
         for (int i = 0; i < output.size(); i++) {
            sum += output.get(i);          
         }
         if (sum == k) {
            System.out.println(output);
         }
         return;
      }
      subsettok(input, index + 1, output, k);
      output.add(input[index]);
      subsettok(input, index + 1, output, k);
      output.remove(output.size() - 1);
   }

   public static void subsettok(int[] input, int k) {
      subsettok(input, 0, new ArrayList<>(), k);
   }

   public static void main(String[] args) {
      subsettok(new int[] { 1, 2, 3, 4, 5 }, 5);
   }
}