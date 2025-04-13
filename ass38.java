package assignments;

import java.util.Scanner;

public class ass38{

	public static void main(String[] args) {
		// program of dii math class method using scanner class
		
		
		Scanner g1= new Scanner (System.in);
		
		System.out.println("Enter the value of A");
		
		int A= g1.nextInt();
		
System.out.println("Enter the value of B");
		
		int B= g1.nextInt();
		
System.out.println("Enter the value of B");
		
		int C= g1.nextInt();
		
		System.out.println("Result--->"+Math.addExact(A, B));
		System.out.println("Result--->"+Math.subtractExact(A, B));
		System.out.println("Result--->"+Math.abs(C));
		System.out.println("Result--->"+Math.max(A, B));
		System.out.println("Result--->"+Math.min(A, B));
		
		
	}

}
