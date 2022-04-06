
class solution {
    public static void printSubSequence(String input,String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        printSubSequence(input.substring(1), output);
        printSubSequence(input.substring(1), output+input.charAt(0));
    }
    public static void printSubSequence(String input) {
        printSubSequence(input,"");
    }
    public static void main(String[] args) {
       
        printSubSequence("xyz");
    }
}