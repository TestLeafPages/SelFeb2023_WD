package week2.day1;

public class LearningString {

	public static void main(String[] args) {

		//string literal
		String str="Testleaf";
		String str2="Testleaf";
		String str4="TestLeaf";
		//method 1-tofind length
		int length = str.length();
		//length is a method
		System.out.println(length);
		
		//method 2-change in uppercase
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		
		//method 3-change inlowercase
		
	String lowerCase = str.toLowerCase();
	System.out.println(lowerCase);
	
	//method 4- tocharArray
	char[] text = str.toCharArray();
	for (int i = 0; i < text.length; i++) {
		System.out.println(text[i]);
	}
	
	//string object
	
	String str1= new String("Testleaf");
	String str3= new String("Testleaf");
	int length2 = str1.length();
	System.out.println(length2);
	
	//method 5-- .equals
	
	boolean equals = str.equals(str1);
	
	System.out.println(equals);
	
	//method 6- .equalIngoreCase
	boolean eic = str.equalsIgnoreCase(str1);
	System.out.println(eic);
	
	//==--- will check memory address
	if(str1==str3) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	//method 7- trim
	String data= "  all are welcome to TestLeaf ";
	String trim = data.trim();
	System.out.println(data);
	System.out.println(trim);
	
	//method 8- split
	
	String name="  all are welcome to TestLeaf ";
	String[] split = name.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	//method 9-replace
	String str5="testleaf";
	String replace = str5.replace('t', '@');
	System.out.println(replace);
	
	//method 10-replace all
	
	String st="amazon have 1000 Bag outof 12000 product";
	String replaceAll = st.replaceAll("[0-9 a-z]", "");
	System.out.println(replaceAll);
	
	//method 11--contains
	
	boolean contains = str.contains("Leaf");
	System.out.println(contains);
	
	//method 12 --charAt
	
	char charAt = str.charAt(4);
	System.out.println(charAt);
	
	
	//method 13 -substring
	//String str="Testleaf";
	String substring = str.substring(4);
	System.out.println(substring);
	
	String substring2 = str.substring(5, 7);
	System.out.println(substring2);
	
	}

}
