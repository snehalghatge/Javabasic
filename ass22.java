package assignments;

public class ass22 {
	
	
	static int a; //global variable
	static int b=10;  // global variable
	 
	static void add () {
		
		int sum=a+b;
		
		System.out.println(sum);
		
	}
	
static void sub() {
	
	int A=20;// Local variable
	int B=40;// Local variable
		
		int Sub=a-b;
		
		System.out.println(Sub);
		
	}
    		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();

}
}
