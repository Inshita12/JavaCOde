import java.util.Scanner;
 class Solution {

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
           }
         System.out.println(head.count.data);
        }
	}
}