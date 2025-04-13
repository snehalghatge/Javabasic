package assignments;

import java.util.Scanner;

public class ass44 {
	// WAP on multilevel inheritance
	
class superparent {
		
		static void signin() {
			Scanner d1= new Scanner(System.in);
			
			System.out.println(" please enter name");
			
			String name = d1.next();
		}
		}

class parent extends superparent {
	
	static void sigin(int a) {
		Scanner d1= new Scanner(System.in);
		
		System.out.println(" please enter mobile number");
		
		int mobile = d1.nextInt();
	}
	}
class child extends parent {
	
	static void sigin(int a,int b) {
		Scanner d1= new Scanner(System.in);
		
		System.out.println(" please enter id");
		
		int id= d1.nextInt();
	}
	}
	

	public static void main(String[] args) {
		
		child.signin();
		child.sigin(6);
		child.sigin(9,9);
		

	}

}
