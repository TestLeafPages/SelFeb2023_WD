package week3.day3;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {
		/*
		 * declare string values
		 * convert into toharArray
		 * declare map
		 * use loop,if condition
		 * add to map
		 * print count number
		 */

		
		
		
		
		String name="Test Leaf";
		char[] ch = name.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		//1=f
		//f=1
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				
				Integer add = map.get(ch[i]);
				map.put(ch[i], add+1);
			
			}else {
				map.put(ch[i], 1);
				
			}
		}
		System.out.println(map);
		
		
		
	}

}
