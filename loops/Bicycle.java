abstract class Bicycle{  
	abstract void run();  
}  
class MountainBike extends Bicycle{  
	void run()
	{
		System.out.println("running safely");
	}  
	public static void main(String args[]){  
		Bicycle b = new MountainBike();  
		b.run();  
	}  
} 