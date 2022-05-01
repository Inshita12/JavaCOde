
public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        if(head==null){
            return 0;
        }
        
        int temp=0;
        while(head!=null){
          head=head.next;
            temp++;
        }
        return temp;
        
	}
}