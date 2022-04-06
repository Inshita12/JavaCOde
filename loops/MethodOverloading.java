
public class MethodOverloading {
  static  void methodint(double d) {
	  System.out.println(d=d++);
  }
  static  void methodint(float b) {
	  System.out.println(b=b++);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MethodOverloading obj=new MethodOverloading();
     obj.methodint(5);
     obj.methodint(6.5);
      
	}

}
