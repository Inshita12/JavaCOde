/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;https://files.codingninjas.in/0000000000004032.png
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/
 class Solution {
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head,int pos, int data){
		//Your code goes here
    	LinkedListNode<Integer> nodeInserted= new LinkedListNode<Integer>(data);
          long count=0;
         if(pos==0){
            nodeInserted.next=head;
           return nodeInserted;
        }
        else {
            LinkedListNode<Integer> prev=head;
          
            while(count<pos-1 && prev!=null ){
                   prev=prev.next;
                   count++;
             
            }
            if(prev!=null){
                nodeInserted.next=prev.next;
                prev.next=nodeInserted;
            } 
	}
             return head;
}
}