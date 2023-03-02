package week2.day4;

public class LearningAccessModifier {

	//work anywhere
		public void add() {
			int a=5,b=6;
			int c=a+b;
			System.out.println(c);
		}
		
		//work in same classs
		private void mul() {
			int b=6,c=8;
			int d= b*c;
			System.out.println(d);
		}
		
		//work in same package
		void sub() {
			int e=9,f=4;
			int g= e-f;
			System.out.println(g);
		}
		
		public static void main(String[] args) {
			LearningAccessModifier am= new LearningAccessModifier();
			
			am.add();
			am.mul();
			am.sub();
			
		}

}
