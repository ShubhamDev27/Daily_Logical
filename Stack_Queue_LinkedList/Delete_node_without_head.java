package Stack_Queue_LinkedList;

public class Delete_node_without_head {
	
	public static void deleteNode(node node) {
	    if (node == null || node.next == null) return;
	    node.data = node.next.data;
	    node.next = node.next.next;
	}

}
