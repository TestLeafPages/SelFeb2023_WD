package week2.day1;

import java.util.Arrays;

public class DuplicateNumber {

	public static void main(String[] args) {
		int dup[]= {1,2,4,5,7,8,6,4,9,2,7,3};
		
		//nested for loop
		//method 1
		for (int i = 0; i < dup.length; i++) {
			//i=4
			//j=5
			for (int j = i+1; j < dup.length; j++) {
				if(dup[i]==dup[j]) {
					System.out.println(dup[i]);
				}
			}
		}
		
		
		//method 2
		//1,2,2,3,4,4,5,6,7,7,8,9,_
		Arrays.sort(dup);
		//10
		//0 to 9--10
		//0 to 9--10
		for (int i = 0; i <dup.length-1; i++) {
			if(dup[i]==dup[i+1]) {
				System.out.println(dup[i]);
			}
		}
	}

}
