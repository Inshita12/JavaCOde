package code;
public class Bank extends Exception{
	int amt;

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}
	public void withdraw(int a)
	{
		try
		{
			if(a>amt)
			throw new Bank();
		}
		catch(Bank e)
		{
			System.out.println("Balance is insufficient");
		}
		
	}
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.setAmt(100);
		System.out.println(b.getAmt());
		b.withdraw(120);
	}
}
