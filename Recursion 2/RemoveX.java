class solution {

    // Return the changed string
    public static String removeX(String input) {
        // Write your code here
        if(input.length()==0){
            return "";
        }
         if(input.charAt(0)=='x'){
             return removeX(input.substring(1));
         }
         return input.charAt(0)+removeX(input.substring(1));
    }

    public static void main(String[] args) {
        String input = "xx";
        System.out.println(removeX(input));
    }
}

// import java.util.StringTokenizer;
// public class solution {
//     public static String removeX(String input) {
//         StringTokenizer abc = new StringTokenizer(input, "x");
//         String output = "";
//         while (abc.hasMoreTokens())
//             output += abc.nextToken();
//         return output;
//     }
// }