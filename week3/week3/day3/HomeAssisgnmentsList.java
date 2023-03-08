package week3.day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeAssisgnmentsList {

	public static void main(String[] args) {
		
		int nums[]= {1,3,4,2,6,7};
		
		
		List<Integer> miss= new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length-1; i++) {
			miss.add(nums[i]);
				
			}
		Collections.sort(miss);
		for (int i = 0; i < miss.size(); i++) {//miss[i]
			if(miss.get(i)!=(i+1)) {
				System.out.println((i+1));
				break;
			}
			
		}
		}	

}
