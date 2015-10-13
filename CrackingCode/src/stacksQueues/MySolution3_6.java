package stacksQueues;

import linkedLists.My_Solution2_4.Node;
/**
 * write a program to sort a stack in ascending order(biggest on top)
 * you may use at most on additional stack to hold items, but you may not copy
 * the elements into any other data structure. stack support push, pop, peep, isEmpty
 * @author Andreas
 *
 */

public class MySolution3_6 {
	
	private static class Node{
		int data;
		Node next = null;
		Node(int d){
			data = d;
		}
	}
	
	private static class Stack{
		Node top;
		int pop(){
			if( top != null){
				int item = top.data;
				top = top.next;
				return item;
			}
			return (Integer) null;
		}
		
		void push(int item){
			Node t = new Node(item);
			t.next = top;
			top = t;
		}
		
		int peek(){
			if(top != null){
				return top.data;
			}
			return 0;
		}
		
		boolean isEmpty(){
			if(top == null){
				return true;
			}
			return false;
		}
	}
		
	public static  Stack sortAscending(Stack a){
		Stack b = new Stack();
		int big = 0;
		if(a.isEmpty()){return a;}		
		int temp;
		while(!a.isEmpty()){
			if(a.peek()>big){
				big = a.peek();
			}
			temp = a.pop();
			if(b.isEmpty()){b.push(temp);}
			else{
				while(b.peek() > temp){
					a.push(b.pop());
				}
				b.push(temp);
				while(!a.isEmpty()){
					if(b.peek() == big){
						b.push(a.pop());
						break;
					}
					b.push(a.pop());
				}
			}
			
		}
		
		return b;
	}
	
	public static void main(String[] args){
		Stack stack =  new Stack();
		stack.push(3);
		stack.push(9);
		stack.push(7);
		stack.push(11);
		stack.push(1);
		stack.push(4);
		Stack n = stack;
		Stack m = stack;
		
		System.out.println();
		m = sortAscending(m);
		while(!m.isEmpty()){
			System.out.print("p["+m.pop()+"]-->");
			
		}
		
	}

}
