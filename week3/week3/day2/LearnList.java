package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//starting index size-----'0'
		List<String> mentors= new ArrayList<String>();
		
		//m1-add
		
		mentors.add("Dilip");
		mentors.add("Aravind");
		mentors.add("Ram");
		mentors.add("Easwar");
		mentors.add("Raghu");
		
		System.out.println(mentors);
//m2-size
		
		int size = mentors.size();
		System.out.println(size);
		
		//m3-get
		
		String string = mentors.get(4);
		System.out.println(string);
		
		//
		mentors.add(3, "Vinoth");
		
		System.out.println(mentors);
		
		//m4-remove
		String remove = mentors.remove(0);
		System.out.println(remove); 
		
		
		System.out.println(mentors);
		
		//m5-removeall
		
		boolean removeAll = mentors.removeAll(mentors);
		System.out.println(removeAll);
		
		
		System.out.println(mentors);
		
		//m6-clear
		
		mentors.clear();
		
		System.out.println(mentors);
		
	}

}
