package stacksQueues;

import java.util.Stack;

public class SortStack {
	public static void sortStack(Stack<Integer> s1){
		Stack<Integer> s2 = new Stack<Integer>();
		int small,big,temp;
		small = s1.pop();
		big = small;
		while(!s1.isEmpty()){
			temp = s1.pop();
			if(s2.peek() <= temp){
				s2.push(temp);
				big = temp;
			}else{
				if(temp < small){
					small =temp;
					popContents(s1,s2,small);
					s2.push(small);
					popContents(s2,s1,big);
					s2.push(s1.pop());
				}else{
					popContents(s1,s2,small);
					s2.push(temp);
					popContents(s2,s1,big);
					s2.push(s1.pop());
				}
			}
		}
		//rebuild s1
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
	}

	private static void popContents(Stack<Integer> dest, Stack<Integer> src, int stop) {
		while(!src.isEmpty()){
			if(src.peek()==stop){
				break;
			}
			dest.push(src.pop());
		}
		
	}
	
}
