class solution {

    public static int count(int m) {
      // Write your code here
      if (m == 0) {
        return 1;
      }
      if(m<10){
        return 0;
      }
      if (m % 10 == 0) {
        return 1 + count(m / 10);
      }
      return count(m / 10);
    }
  
    public static void main(String[] args) {
      int m = 70800;
      System.out.println(count(m));
    }
  }
  