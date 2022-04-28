import java.util.Arrays;
import java.util.Scanner;

// 
class solution {
   public static String[] permutation(String input) {
   if(input.length()==0){
      String[] ans={""};
      return ans;
   }

      String[] ans= permutation(input.substring(1));
      
      char ch=input.charAt(0);
      String[] output=new String[ans.length*input.length()];
   int k=0;
      for (int i = 0; i < ans.length; i++) {
         for (int j = 0; j <=ans[i].length(); j++) {
            
           output[k++]=ans[i].substring(0,j)+input.charAt(0)+ans[i].substring(j);
         }
      }
      return output;
   }


   public static void main(String[] args) {
      System.out.println(Arrays.toString(permutation("abc")));
   }
}