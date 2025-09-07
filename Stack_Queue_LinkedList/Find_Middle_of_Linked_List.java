package Stack_Queue_LinkedList;

public class Find_Middle_of_Linked_List {

     public static node FindMiddle(node head) 
     {
    	 node slow=head;
    	 node fast=head;
    	 while(fast!=null && fast.next!=null) 
    	 {
    		 slow=slow.next;
    		 fast=fast.next.next;
    	 }
    	 return slow;
     }
	
}