import java.util.Scanner;

public class reverse {

    static String strrev(String input) {
        String output = "";
        int temp = 0, i;
        StringBuilder sb = new StringBuilder(input);
        for (i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                output = sb.substring(temp, i + 1) + output;
                temp = i + 1;
            }
        }
        output = sb.substring(temp, i) + " " + output;
        return output.substring(0, output.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "The quick brown fox jumps over the lazy dog";

        System.out.println(input);
        System.out.println(strrev(input));

    }
}