package arrayStrings;

public class Problem1_2 {
	
	static boolean function(String st1, String st2){
		
		if(st1.length() != st2.length()) return false;
		
		boolean ary[] = new boolean[st2.length()];
		boolean check;
		for(int i = 0; i<st1.length();i++){
			check = false;
			for(int j = 0; j<st2.length();j++){
				if(st1.charAt(i) == st2.charAt(j) && !ary[j]){
					check = true;
					ary[j] = true;
					break;
				}
			}
			if(!check) return false;
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args){
		
		
		System.out.println("if true, then it works: " + function("dogde", "godde"));
		System.out.println("if false, then it works: " + function("dogde", "god e"));
		System.out.println("if false, then it works: " + function("hurgblurga", "godde"));
		System.out.println("if false, then it works: " + function("ddd", "dde"));
	}

}
