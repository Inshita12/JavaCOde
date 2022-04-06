
public class MarksNotInRangeException extends Exception{
	
	
	public MarksNotInRangeException() {
		super("Exception raise.. marks should be >0");
		System.out.println("msg from exceptin const = marks not in range exception");
	}
}
