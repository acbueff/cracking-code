package linkedLists;
/**
 * write code to partition a linked list around a value x,
 * such that all nodes less than x come before all nodes greater than or equal to x
 * @author Andreas
 *
 */
public class My_Solution2_4 {
	
	
	public static class Node{
		int data;
		Node next = null;
		Node(int d){
			data =d;
		}
		
		
		
	}
	
	static Node partition(Node head, int x){
		Node n = head;
		Node i = n;
		Node j = n;
		
		while(j.next != null){
			if(j.next.data < 5){
				head = j.next;
				j.next = j.next.next;
				//s.next = n;
				head.next = i;
			}
			j =j.next;
		}
		
		return head;
		
	}
	
	public static void main(String[] args){
		
		
		Node node1 = new Node(3);
		Node node2 = new Node(5);
		Node node3 = new Node(8);
		Node node4 = new Node(5);
		Node node5 = new Node(10);
		Node node6 = new Node(2);
		Node node7 = new Node(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		Node n = node1;
		
		while(n != null){
			System.out.print("["+n.data+"]-->");
			n = n.next;
		}
		System.out.println();
		Node m = node1;
		partition(node1, 5);
		while(m!= null){
			System.out.print("p["+m.data+"]-->");
			m= m.next;
		}
		
	}

}
