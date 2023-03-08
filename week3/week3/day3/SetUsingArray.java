package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetUsingArray {
	
public static void main(String[] args) {
	
	//remove duplicates
	
	/*
	 * declare values in array
	 * declare set for unique number
	 * declare another set for duplicate number
	 * use loop,if condition to check number
	 * add number set
	 * 
	 */
	
	int number[]= {2,4,6,1,5,8,9,5,3,4,7,9,11};
	//5,4,9
	
	Set<Integer>unique= new TreeSet<Integer>();
	
	Set<Integer>dup= new HashSet<Integer>();
	
	for (int i = 0; i < number.length; i++) {
		if(!unique.add(number[i])) {
			dup.add(number[i]);
		}
	}
	System.out.println("set data"+unique);
	System.out.println(dup);
	
	//convert set in list --to use the get()
	
	List<Integer>nums= new ArrayList<Integer>(unique);
	System.out.println("list data"+nums);
	
	Integer integer = nums.get(5);
	System.out.println(integer);
}
}
