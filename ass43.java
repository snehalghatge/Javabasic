package assignments;

import java.util.Scanner;

public class ass43 {
	
	
	
	class parent1 {
		
		static void login() {
			Scanner d1= new Scanner(System.in);
			
			System.out.println(" please enter userid");
			
			int input= d1.nextInt();
		}
		}
		
		
		class child extends parent1{
			static void login(int a) {
				
				Scanner f1= new Scanner(System.in);
			
			System.out.println(" please enter password");
			
			int inp = f1.nextInt();
		}
		
	}

	public static void main(String[] args) {
		// WAP on single level inheritance
		
		child.login();
		child.login(2);
		
		
		

	}

}
