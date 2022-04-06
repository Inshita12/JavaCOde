class solution {

    public static boolean isStringPalindrome(String input) {
      // Write your code here
      int len = input.length();
      if (input.length() == 0) {
        return true;
      }
      if (input.length() == 1) {
        return true;
      }
      if (input.charAt(0) == input.charAt(len -1)) {
        
        return isStringPalindrome(input.substring(1, len - 1));
      }
      return false;
  
    }
  
    public static void main(String[] args) {
      String input = "naan";
      System.out.println(isStringPalindrome(input));
    }
  }
  