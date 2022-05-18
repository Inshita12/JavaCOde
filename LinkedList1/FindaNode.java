/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

 class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        if(head==null){
            return -1;
        }
        int i=0;
        while(head!=null){
            if(head.data==n){
                return i;       
            }
            head=head.next;
              i++;
        }
        return -1;
	}
}