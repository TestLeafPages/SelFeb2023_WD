package week3.day3;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		int mark1[]= {45,65,78,98,45,89,54,67,54};
		
		Set<Integer>mark= new HashSet<Integer>();
		
		for (int i = 0; i < mark1.length; i++) {
			mark.add(mark1[i]);
		}
		
		System.out.println(mark);
		//m1
		boolean contains = mark.contains(65);
		
		System.out.println(contains);
		
		//m2
		
		boolean remove = mark.remove(98);
		System.out.println(remove);
		
		System.out.println(mark);
		
		//Collections.sort(mark);
	}

}
