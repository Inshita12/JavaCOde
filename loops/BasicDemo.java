  import java.math.BigDecimal;
  
  class BasicsDemo {
      // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
      static void print() {
          System.out.println("\n\nInside print ...");
          System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
          System.out.println();                 // Print empty line
          System.out.print("Hello, world!!");   // Cursor stayed after the printed string
          System.out.println("Hello,");
          System.out.print(" ");                // Print a space
          System.out.print("world!!");
      }
	  
	  static void primitives() {
	      System.out.println("\n\nInside primitives ...");
		  int intHex = 0x0041; // 16 power 0 * 1 + 16 power 1 * 4
		  System.out.println("intHex: " + intHex);
		  
		  // Java 7
		  int intBinary = 0b0100_0001;
		  System.out.println("intBinary: " + intBinary);
		  
		  int intOctal = 0101;
		  System.out.println("intOctal: " + intOctal);	
		  
		  int intChar = 'A';
		  System.out.println("intChar: " + intChar);

          char charInt = 65;
		  System.out.println("charInt: " + charInt);	
		  
		  char charHex = 0x0041;
		  System.out.println("charHex: " + charHex);	
		  
		  char charBinary = 0b0100_0001;
		  System.out.println("charBinary: " + charBinary);	
	  }
	  
	  public static void main(String[] args) {	
	   	  // Language Basics 1
		  //print();	  
		  primitives();
	  }       
}