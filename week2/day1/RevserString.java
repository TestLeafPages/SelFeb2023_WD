package week2.day1;

public class RevserString {

	public static void main(String[] args) {
		String str="TestLeaf";
		char[] ch = str.toCharArray();
//		for (int i = ch.length-1; i >=0; i--) {
//			System.out.print(ch[i]);
//		}
		
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}
	}

}
