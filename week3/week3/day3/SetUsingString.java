package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetUsingString {

	public static void main(String[] args) {
		
		String companyName="amazon";
		//e
		
		char[] charArray = companyName.toCharArray();
		
		Set<Character> name= new LinkedHashSet<Character>();
		
		Set<Character>dup=new LinkedHashSet<Character>();
		//chararray.length
		for (Character ch : charArray) {
			if(!name.add(ch)) {
				dup.add(ch);
			}
		}
		System.out.println(name);
		System.out.println(dup);
	}

}
