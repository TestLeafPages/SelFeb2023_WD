package week2.day1;

import java.util.Arrays;

public class LearningArrays {

	public static void main(String[] args) {
		
		int tenthMark[]= {89,67,98,100,68};
		
		//array indexs will start at 0
		//0-89,1-67,2-98,3-100,4-67
		
		//find the length of array
		//length is property
		int length = tenthMark.length;
		System.out.println("total number of mark: "+length);

		System.out.println("3rd value : "+tenthMark[3]);
		
		//need sort values 
		Arrays.sort(tenthMark);
		for (int i = 0; i < tenthMark.length; i++) {
			System.out.println(tenthMark[i]);
		}
		
		for (int i = tenthMark.length-1; i >=0 ; i--) {
			System.out.println(tenthMark[i]);
		}
		
		
		//exception ---ArrayIndexOutOfBoundsException
		System.out.println("5rd value : "+tenthMark[5]);
	}

}
