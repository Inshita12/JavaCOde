package code;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Candidate {
	String name, candID, city,grade;
	int marks1, marks2, marks3, avg;
	Scanner sc = new Scanner(System.in);
	
	
	//const here says ,,  i'm gonna throw an exception MarksNotInRangeException,
	//i'll not handle it.. i'm signaling this using throws keyword
	//this exception must be handled by the method which calls me.
	public Candidate(){
		
	}
	public void accept() throws MarksNotInRangeException {
		System.out.println("=============Default Const=========");
		System.out.print("Enter the values as per the sequence --");
		System.out.println("name,candidateid,city,m1,m2,m3");
		name = sc.next();
		candID = sc.next();
		city = sc.next();
		try{
			marks1 = sc.nextInt();
			marks2 = sc.nextInt();
			marks3 = sc.nextInt();
			
			if(marks1<0 || marks2<0 || marks3<0){   //if true
				throw new MarksNotInRangeException();
			}
		}
		catch(InputMismatchException m){
			m.printStackTrace();
		}
	}

	public Candidate(String name, String candID, String city, int marks1,
			int marks2, int marks3) {
		System.out.println("===========Parameterized const=======");
		this.name = name;
		this.candID = candID;
		this.city = city;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	public String calculateAvg(){
		avg = (marks1+marks2+marks3)/3;
		
		if(avg>80){
			grade ="A";
			System.out.println("Grade A..  Congrats :-)");
		}
		else if(avg>=60 && avg<80){
			grade ="B";
			System.out.println("Grade "+grade);
		}
		else if(avg>=40 && avg<59){
			grade ="C";
			System.out.println("Grade "+grade);
		}
		else {
			grade ="fail";
			System.out.println("Grade "+grade);
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		Candidate obj ;
		obj = new Candidate();
				
		try{
			obj.accept();
		}
		catch (MarksNotInRangeException e) {
			//e.printStackTrace();
			try {
				obj.accept();
			} 
			catch (MarksNotInRangeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println(obj.calculateAvg());
		
	}

}
















