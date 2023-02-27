package week2.day1;

import java.util.Arrays;

public class FindThridLargestNumber {

	public static void main(String[] args) {

		int data[] = { 100, 45, 34, 67, 37, 89, 43, 67, 32, 69, 90, 47, 87, 67 };
		Arrays.sort(data);

		
		  for (int i = 0; i < data.length; i++) { System.out.println(data[i]); }
		  
		  System.out.println(data[data.length-3]);
		 

	}

}
