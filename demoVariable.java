package day4;

public class demoVariable {

	 
		int a=10;
		static int c=30;
		public void local(int x)
		{ int b=20+x;
			System.out.println("localvaribal==>"+b);
			
		}
		public static void main(String[] args) {
		 demoVariable d= new  demoVariable ();
		
		 d.local(40);
		
		System.out.println("instance==>"+d.a);
		System.out.println("static==>"+c);
		}
	}


