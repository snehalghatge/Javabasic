package assignments;

import java.util.Scanner;

public class ass29 {

	public static void main(String[] args) {
		double PI=3.14;
		
		
		 
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter the redius");
      int R  = sc.nextInt();
      double area= PI*R*R;
      System.out.println("Area of circle-->"+area);
      
	}

}
