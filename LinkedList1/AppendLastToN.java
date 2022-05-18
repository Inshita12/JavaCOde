/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/
 class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        if(n==0 || head==null){
            return head;
        }

        LinkedListNode<Integer> temp=head;
                LinkedListNode<Integer> prev=head;
        LinkedListNode<Integer> initial=head; 
          for(int i=0;i<n;i++){
            temp=temp.next;            
           } 
           while(temp.next!=null){
            prev=prev.next;
            temp=temp.next;
        }
         LinkedListNode<Integer> temp1=prev.next; 
         prev.next=null;
        temp.next=initial;
        head=temp1;
         return head;
	}
   

}