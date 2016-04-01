package linkedLists;

import codeLibrary.LinkListNode;

public class SumLists {
	
	public static LinkListNode sumLists(LinkListNode n, LinkListNode m){
		if( n == null){
			return m;
		}else if(m == null){
			return n;
		}
		
		int sum = nodeToInt(n) + nodeToInt(m);
		return convert(sum);
	}

	private static LinkListNode convert(int sum) {
		String strSum = String.valueOf(sum);
		LinkListNode n = null;
		for(int i = strSum.length()-1; i < 0; i--){
			String digit = String.valueOf((strSum.charAt(i)));
			n = new LinkListNode(Integer.getInteger(digit));
			n = n.next;
		}
		return n;
	}

	private static int nodeToInt(LinkListNode n) {
		int val = 0;
		int mult = 1;
		
		while(n != null){
			val = val + (n.data * mult);
			mult = mult*10;
			n = n.next;
		}
		
		return val;
	}

}
