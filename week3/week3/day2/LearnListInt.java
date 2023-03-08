package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnListInt {

	public static void main(String[] args) {
		
		List<Integer> mark= new ArrayList<Integer>();
            mark.add(45);
            mark.add(67);
            mark.add(98);
            mark.add(46);
            mark.add(78);
		
            System.out.println(mark);
		
            Object[] array = mark.toArray();
           for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
            
            Collections.sort(mark);
            System.out.println(mark);
	}

}
