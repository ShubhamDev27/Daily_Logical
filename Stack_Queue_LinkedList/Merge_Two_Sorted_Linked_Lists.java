package Stack_Queue_LinkedList;

public class Merge_Two_Sorted_Linked_Lists {

	public static node mergeTwoLists(node l1, node l2)
	{
	    node dummy = new node(0), tail = dummy;
	    while (l1 != null && l2 != null)
	    {
	        if (l1.data < l2.data)
	        {
	            tail.next = l1; l1 = l1.next;
	        } else 
	        {
	            tail.next = l2; l2 = l2.next;
	        }
	        tail = tail.next;
	    }
	    tail.next = (l1 != null) ? l1 : l2;
	    return dummy.next;
	}

}
