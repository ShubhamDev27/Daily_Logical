package Stack_Queue_LinkedList;

public class Reverse_Linked_List {

    public static node ReverseLinkedList(node head) 
    {
    	node prev=null;
    	node curr=head;
    	node next=null;
    	while(curr!=null) 
    	{
    		next=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    	}
    	
    	return prev;
    }

}

//         1) 
//         prev → null
//         curr → [1|addr2] → [2|addr3] → [3|addr4] → [4|null]
//
//         2)
//         prev → [1|null]
//         curr → [2|addr3] → [3|addr4] → [4|null]
//
//         3)
//         prev → [2|addr1] → [1|null]
//         curr → [3|addr4] → [4|null]
//
//         4)
//         prev → [3|addr2] → [2|addr1] → [1|null]
//         curr → [4|null]
//
//         5)
//         prev → [4|addr3] → [3|addr2] → [2|addr1] → [1|null]
//         curr → null
