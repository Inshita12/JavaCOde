import java.util.Scanner;

public class increasedec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int prev = s.nextInt();
		int count=2,curr;
	
		boolean isdec=true;
		while(count<=n) {
			curr=s.nextInt();
			count++;
			if(curr==prev) {
				System.out.println("false");
			     return ;
				}
				if(curr<prev) {
					if(isdec==false) {
						System.out.println("false");
						return;
					}
				}
					else {
						if(isdec==true) {
						isdec=false;
						}
					}	
						prev=curr;
						
					
				}
				System.out.println("true");
			}
		
			
		}
	


