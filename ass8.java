package assignments;

public class ass8 {

	static void add() {
		int A=67;
		int B=98;
		int C= A+B;
		
		System.out.println(C);
		
	}
	static void MUL() {
		int A=67;
		int B=98;
		int C= A*B;
		
		System.out.println(C);
		
	}
	
	static void sub() {
		int A=67;
		int B=98;
		int C= A-B;
		
		System.out.println(C);
	}
		
		 void div() {
			int A=67;
			int B=98;
			int C= A/B;
			
			System.out.println(C);
			
		
	}
		 
		 void result() {
			 
			 System.out.println("All oprations are performed");
			 
		 }
		 
	public static void main(String[] args) {
		ass8 s1= new ass8();
		
		add();
		 MUL();
		 sub();
		 
		s1.div();
		s1.result();
}
}