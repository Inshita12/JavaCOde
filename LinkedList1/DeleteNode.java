/****************************************************************
 * 
 * Following is the Node class already written for the Linked List
 * 
 * class LinkedListNode<T> {
 * T data;
 * LinkedListNode<T> next;
 * 
 * public LinkedListNode(T data) {
 * this.data = data;
 * }
 * }
 * 
 *****************************************************************/

class Solution {
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
      // Write your code here.
    
      LinkedListNode<Integer> prev = head;
      if (head == null) {
        return null;
      }
      if (pos == 0) {
        prev = head.next;
        return prev;
      } else {
       int count = 0;
          
        while (count < pos - 1 && prev != null) {   
            prev=prev.next;
            count++;
        }
           if (prev != null && prev.next != null) {
          prev.next = prev.next.next;
        }
      }
      return head;
    }
  }