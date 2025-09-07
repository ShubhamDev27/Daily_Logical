package Stack_Queue_LinkedList;

public class Find_Cycle_in_Linked_List {

	 public static boolean FindMiddle(node head) 
     {
    	 node slow=head;
    	 node fast=head;
    	 while(fast!=null && fast.next!=null) 
    	 {
    		 slow= slow.next;
    		 fast=fast.next.next;
    		 if(slow==fast) return true;
    	 }
    	 return false;
 
     }
}