import java.util.*;

class c {
   public static void subsettok(int[] input, int index, ArrayList<Integer> output, int k,
         ArrayList<ArrayList<Integer>> ans) {
      if (index == input.length) {
         int sum = 0;
        
         for (int i = 0; i < output.size(); i++) {
            sum += output.get(i);
         }
         if (sum == k) {
            ArrayList<Integer> temp=new ArrayList<>();
            for (int i = 0; i < output.size(); i++) {
               temp.add(output.get(i));
            }
            ans.add(temp);
         }
         return;
      }
      subsettok(input, index + 1, output, k, ans);
      output.add(input[index]);
      subsettok(input, index + 1, output, k, ans);
      output.remove(output.size() - 1);
   }

   public static ArrayList<ArrayList<Integer>> subsettok(int[] input, int k) {
      ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
      subsettok(input, 0, new ArrayList<>(), k, ans);
      return ans;
   }

   public static void main(String[] args) {
     System.out.println(subsettok(new int[] { 1, 2, 3, 4, 5 }, 5)); 
   }
}