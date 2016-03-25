package arrayStrings;

public class OneAway {

	public static boolean oneAway(String os, String ns){
		if(os.equals(ns)){
			return true;
		}else if(oneEdit(os,ns)){
			return true;
		}else{
			return false;
		}
	}

	private static boolean oneEdit(String os, String ns) {
		int diff = os.length() - ns.length();
		if(Math.abs(diff)>1){
			return false;
		}else{
			if(diff == 0){
				return myStringCmp(os,ns);
			}else if(os.length() > ns.length()){
				return myStringCmp(os,ns);
			}else{
				return myStringCmp(ns,os);
			}
		}
	}

	private static boolean myStringCmp(String big, String small) {
		int count = 0;
		int si = 0;
		
		for(int k = 0; k <big.length();k++){
			if(big.charAt(k) != small.charAt(si)){
				count++;
				if(count >= 2){
					return false;
				}
			}else{
				si++;
			}
		}
		
		return true;
	}
	
	
}
