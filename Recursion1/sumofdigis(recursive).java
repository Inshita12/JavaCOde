class solution {

    public static int sumofDigits(int m) {
        // Write your code here
        if(m==0){
          return 0;
        }
     return m%10+ sumofDigits(m/10);
  
    }

    public static void main(String[] args) {
    int m=12345;
   System.out.println(sumofDigits(m));

    }
}
