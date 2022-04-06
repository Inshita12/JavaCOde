package code;
abstract class Bicycle2{
	void run(){
		System.out.println("running safely");
	}	
}  
class MountainBike2 extends Bicycle2{
	public static void main(String args[]){  
		MountainBike2 b = new MountainBike2();  
		b.run();  
	}  
} 
