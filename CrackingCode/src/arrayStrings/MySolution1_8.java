package arrayStrings;

public class MySolution1_8 {

	public static boolean isSubstring(String s1, String s2){
		int i = 0;
		int j = 0;
		int c = s1.length();
		if(s1.length() != s2.length()){
			System.out.println("length not equal");
			return false;
		}
		
		while(i == s1.length()){
			if(s1.charAt(i) != s2.charAt(j)){
				j = (j++)%s2.length();
				i=0;
			}
			else{
				if(i == s1.length()-1){return true;}
				i++;
				j = (j++)%s2.length();
				
			}
			
		}
		
		
		return false;
	}
	
	public static void main(String[] args){
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println("value of subString is: "+isSubstring(s1,s2));
	}
}
