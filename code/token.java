import java.util.Scanner;
import java.util.StringTokenizer;

public class token {

    static String strrev1(String input) {
        StringTokenizer st = new StringTokenizer(input);
        String output = "";
        while (st.hasMoreTokens()) {
            output = st.nextToken() + " " + output;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "The quick brown fox jumps over the lazy dog";

        System.out.println(input);
        System.out.println(strrev1(input));
    }
}