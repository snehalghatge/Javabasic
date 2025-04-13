package assignments;

import java.util.Scanner;

public class ass30 {

	public static void main(String[] args) {
		// triangle program
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of base");
		int Base=s1.nextInt();
		System.out.println("Enter the value of Hight");
		int Height=s1.nextInt();
		
		double Area=1/2*Base* Height;
		
		System.out.println("Enter the value of Area--->"+Area);
	}

}
