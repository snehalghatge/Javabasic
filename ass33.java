package assignments;

import java.util.Scanner;

public class ass33 {

	public static void main(String[] args) {
		//circumference of circle
		
		Scanner A1= new Scanner(System.in);
		
		double PI=3.14;
		System.out.println("Enter the value of r");
		
		int r= A1.nextInt();
		
		double c= 2*PI*r;
		
		System.out.println("the circumference of circle is --->"+c);

	}

}
