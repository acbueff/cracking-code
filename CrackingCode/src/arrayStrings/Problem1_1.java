package arrayStrings;

import java.io.Console;
import java.util.Scanner;

public class Problem1_1 {
	
	/**
	 * time complexity of 0(n^2) and 0(1) space
	 * @param obj
	 * @return
	 */
	public static boolean unique(String obj){
		for(int i = 0; i < obj.length(); i++){
			char test = obj.charAt(i);
			System.out.println("value at obj["+ i+"]: " + obj.charAt(i));
			for(int j = i + 1; j < obj.length();j++){
				System.out.println("value at obj["+ j+"]: " + obj.charAt(j));
				if(test == obj.charAt(j)){
					return false;
				}
			}
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
