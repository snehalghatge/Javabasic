package assignments;

import java.util.Scanner;

public class ass31 {

	public static void main(String[] args) {
		// Area of rectangle
		
		Scanner d1= new Scanner(System.in);
		System.out.println("Enter the lenght");
		int lenght=d1.nextInt();
		System.out.println("Enter the width");
        int width=d1.nextInt();
        
        double rect=lenght*width;
        
        System.out.println("Area of rectangle-->"+rect);
	}

}
