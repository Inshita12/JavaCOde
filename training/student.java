package training;

public class student {

    String id="100";
    String name="Inshita";
    String gender="Female";
    
    boolean update_profile(String str) {
    	name=str;
    	return true;
    }
	public static void main(String[] args) {
	student s=new student();
	s.update_profile("xyz");
	System.out.println(s.id);
	System.out.println(s.name);
	System.out.println(s.gender);
	}



}
