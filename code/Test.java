
interface Interface1{
	int id=101;
	void print();
  
}
class Test_Interface implements Interface1{
	public void print(){
		System.out.println("JAVA Class");
	}
   
	public static void main(String args[]){
		Test_Interface T1=new Test_Interface();
		T1.print();
		System.out.println(id);
	}
}
