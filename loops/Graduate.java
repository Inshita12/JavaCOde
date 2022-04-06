class Degree{
  public void getDegree(){
    System.out.println("I got a degree");
  }
}
class Postgraduate{
  public void getDegree(){
    System.out.println("I am a Postgraduate");
  }
}
class Undergraduate{
  public void getDegree(){
    System.out.println("I am an Undergraduate");
  }
}
 public class Graduate{
  public static void main(String[] args){
    Postgraduate a = new Postgraduate();
    Undergraduate b = new Undergraduate();
    Degree c = new Degree();
    
    a.getDegree();
    b.getDegree();
    c.getDegree();
  }
}