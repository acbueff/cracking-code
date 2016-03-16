package recursionDynamicProg;


import java.util.ArrayList;

/**
 * robot sitting on the upper left corner of grid with r rows n c columns
 * the robot can only move in two directions, right, and down but certain cells are "offlimits"
 * such that the robot cannot step on them. design an algorithm to find a path
 * for the robot from the top left to the bottom right
 * 
 * @author Andreas
 *
 */

public class findGridPath {
	/**
	 * 
	 * Okay my first solution is just pure garbage. I  have a recursive function
	 * inside another recursive function...so much stackoverflow
	 * But I'm not posting that mistake...I'll post the corrected solution
	 *This solution uses simple recursion 
	 */
	 public static class Pair{
		int row;
		int col;
		public Pair(int r, int c){
			row = r;
			col = c;
		}
		public void toSting(){
	
			System.out.println("(r = " + row + ", col = " + col+ ")");
		}
	}
	 
	 
	
	 public static ArrayList<Pair> getPath(boolean[][] map){
		 ArrayList<Pair> path = new ArrayList<>();
		 if(map == null || map[0].length == 0){
			 return null;
		 }
		 if(checkPath(map[0].length - 1,map.length - 1,map,path)){
			 return path;
		 }
		 return null;
	 }
	 
	 
	 public static boolean checkPath(int r, int c, boolean[][] map, ArrayList<Pair> path){
		 if(r < 0 || c < 0 ||!map[r][c]){
			 return false;
		 }
		 
		 boolean atOriginHa = (r == 0 && c ==0);
		 
		 if(atOriginHa || checkPath(r- 1,c,map,path)||checkPath(r,c-1,map,path)){
			 path.add(new Pair(r,c));
			 return true;
		 }
		 
		 return false;
	 }
	 
	
	 
	 
	 
	 
	
	public static void main(String[] args){
		boolean map[][] = new boolean[4][4];
		map[0][0] = true;
		map[0][1] = true;
		map[0][2] = true;
		map[0][3] = true;
		map[1][3] = true;
		map[2][3] = true;
		map[3][3] = true;
		map[1][0] = true;
		map[2][0] = true;
		map[3][0] = true;
		map[2][1] = true;
		
		ArrayList<Pair> path = getPath(map);
		if(path != null){
			for(Pair p : path){
				p.toSting();
			}
		}else{
			System.out.println("no good");
		}
	}

}
