import java.util.*;

class Solution {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine(); 
        int i=0;
        while(i<n.length()){
            for(int j=i;j<n.length();j++){
                System.out.println(n.substring(i, j+1));
            }
            i++;
        }
}
}