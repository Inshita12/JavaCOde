class Solution {

    public static String replacepi(String input) {
        // System.out.println(input);
        // int s=input.length();
        // if(s==0){
        //     return "";
        // }
        // if(s==1 ){
        //     return input;
        // }
        // if(input.charAt(0)=='p' && input.charAt(1)=='i' ){
        //     return "3.14" + replacepi(input.substring(2, input.length()));
        // }
        // return input.charAt(0)+replacepi(input.substring(1, input.length()));
        return input.replaceAll("pi", "3.14");

    }

    public static void main(String[] args) {
        String input = "pippiippip";
        System.out.println(replacepi(input));
    }
}