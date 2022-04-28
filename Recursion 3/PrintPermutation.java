import java.util.Arrays;
import java.util.Scanner;

// 
class solution {
   public static void permutations(String input){
		// Write your code here
        
        helper(input,"");

	}
    
    private static void helper(String input,String output){
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        
        for(int i=0;i<input.length();i++){
            String str = input.substring(0,i) + input.substring(i+1,input.length());    
            helper(str , output + input.charAt(i));
        }
        
        // input = input.substring(1);
        // print(input,output);
        
        
    }


   public static void main(String[] args) {
      permutations("abc");
   }
}