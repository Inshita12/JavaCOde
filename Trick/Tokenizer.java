// import java.util.*;

// class avs {
//     public static String helper(float n) {
//        String s= Float.toString(n);
//        String a="";
//     //    String b="";
//     for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)=='.'){
//      a="Integr"+":"+s.substring(0, i)+"Decimal"+":"+s.substring(i+1, s.length());
            
//            }
          
//     }
//     return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float n = sc.nextFloat();
//         System.out.println(helper(n));
//     }
// }
// import java.util.*;

// class avs {
//     public static String helper(float n) {
//         StringTokenizer st = new StringTokenizer(Float.toString(n), ".");
//         return "Integer: " + Integer.parseInt(st.nextToken()) + " Float: " + Integer.parseInt(st.nextToken());
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // float n = sc.nextFloat();
//         float n = 203.204f;

//         System.out.println(helper(n));
//     }
// }
import java.util.*;

class avs {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("1,2,3,4,5", ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken() + " ");
        }
    }
}