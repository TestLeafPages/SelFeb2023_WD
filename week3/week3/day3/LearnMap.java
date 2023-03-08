package week3.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		
		
		Map<Integer,String> mentors=new TreeMap<Integer,String>();
		
		Map<String,Integer>name= new TreeMap<String,Integer>();
		
		
		name.put("dilip",101);
		name.put("aravind",102);
		mentors.put(103, "ram");
		mentors.put(104, "raghu");
		mentors.put(105, "easwar");
		
		System.out.println(mentors);
		System.out.println(name);
		
		Set<Entry<Integer, String>> entrySet = mentors.entrySet();
		
		System.out.println(entrySet);
		
		//i need to get key-values(101,102,103....)
		
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +""+value);
			
		}
	}
	

}
