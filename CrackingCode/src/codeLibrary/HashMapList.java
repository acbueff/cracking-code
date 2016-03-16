package codeLibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * 
 * @author Andreas
 * Thanks to Gale, I now have a nice collection
 * of data structures provided in the 6th edition..still mad that I bought the 5th
 * This HashMap will as a means to map objects T to ArrayList E
 * @param <T>..OBEJECTS
 * @param <E>..ArrayList<E>
 */
public class HashMapList<T,E> {
	private HashMap<T,ArrayList<E>> map = new HashMap<>();
	
	/*Insert item into list at key*/
	public void put(T key, E item){
		if(!map.containsKey(key)){
			map.put(key, new ArrayList<E>());
		}
		map.get(key).add(item);
	}
	
	/**
	 * Insert list of items at key 
	 */
	public void put(T key, ArrayList<E> items){
		map.put(key, items);
	}
	
	/**
	 * get list of items at key
	 */
	public ArrayList<E> get(T key){
		return map.get(key);
	}
	
	/**
	 * check if hashmaplist contains key
	 */
	public boolean containsKey(T key){
		return map.containsKey(key);
	}
	
	/**
	 * check if list at key contains value
	 */
	public boolean containsKeyValue(T key, E value){
		ArrayList<E> list = get(key);
		if(list == null){
			return false;	
		}
		return list.contains(value);
	}
	
	/**
	 * get list of keys
	 */
	public Set<T> keySet(){
		return map.keySet();
	}
	
	/**
	 * 
	 */
	public String toString(){
		return map.toString();
	}
	
}
