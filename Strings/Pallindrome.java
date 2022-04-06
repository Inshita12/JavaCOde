import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        int left=0;
        int right=t.length()-1;
        while(left<right){
            if(t.charAt(left)!=t.charAt(right)){
              
           
            System.out.println(false);
            }
            ++left;
            --right;
        }
        System.out.println(true);
       
    }
}