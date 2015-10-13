package arrayStrings;

import java.util.Arrays;
import java.util.Scanner;

public class herAnswer1_1 {
	
	/**
	 * time complexity is 0(n), where n is the length of the string.
	 * the space complexity is 0(1).
	 * @param obj
	 * @return
	 */
	public static boolean unique(String obj){
		if(obj.length()>128){
			return false;
		}
		
		boolean[] char_set = new boolean[256];
		//Arrays.fill(char_set, false);
		for(int i = 0; i < obj.length(); i++ ){
			int val =  obj.charAt(i);
			System.out.println("Value of obj["+i+"]: " + val);
			if(char_set[val] == true){
				//System.out.println("value of char_set["+val+"]: "+ char_set[val]);
				return false;
			}
			else{
				//System.out.println("val stored in char_set as true");
				char_set[val] = true;
			}
		}
		return true;
	}
	
	public static boolean bitUnique(String str){
		int checker = 0;
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i);
			if((checker & (1 << val))>0){
				return false;
			}
			checker |= (1 << val);
		}
		return true;
		
	}
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		boolean state = true;
		while(state){
			System.out.println("Enter string: ");
			String d = input.nextLine();
			System.out.println("You entered: " + d);
			if(unique(d)){
				System.out.println("string is unique");
				
			}
			else{
				System.out.println("string is not unique");
				state = false;
			}
			
		}
		
	}
}
