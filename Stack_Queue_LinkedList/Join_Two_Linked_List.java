//package Stack_Queue_LinkedList;
//
//import java.util.LinkedList;
//
//public class Join_Two_Linked_List {
//
//	// join two lists in O(1)
//	static void join(LinkedList list1, LinkedList list2) {
//		
//	    if (list1.head == null)
//	    {  
//	    	// Case 1: list1 is empty
//	        list1.head = list2.head;  
//	        list1.tail = list2.tail;  
//	    } 
//	    else if (list2.head != null)
//	    {   // Case 2: list1 is not empty but list2 is not empty
//	    	
//	        list1.tail.next = list2.head;  // O(1) → connect tail of list1 to head of list2
//	        list1.tail = list2.tail;       // update tail to new last element
//	    }
//	}
//
//}
