

class A{
	int a;
	public void getdata(){ a=67;}
	public void display(){System.out.println("a="+a);}
	//this is a method of Object class which is used to print message in place of hashcode
	public String toString(){	
		return ""+a;
	}
}
public class ToStringExample {

	public static void main(String[] args) {
		A obj=new A();
		obj.getdata();
		System.out.println(obj);
			}
}