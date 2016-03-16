package linkedLists;

public class Problem2_3 {
	public static boolean deleteMiddleNode(Node head){
		
		Node n = head;
		Node m = head;
		if(n == null || n.next == null){
			return false;
		}
		while(m.next.next != null){
			m =m.next.next;
			n = n.next;
		}
		n = n.next;
		n.data = n.next.data;
		n.next = n.next.next;
	
		
		return true;
	}
	
	
}
