/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/
import java.util.Scanner;
public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        if(head==null){
         System.out.println("");
        }
        else{
            int count=0;
            while(head!=null && count<i ){
            head=head.next;
            count++;       
           if(count==i)
           {
                System.out.println(head.data);
           }
        }
	}
}
}