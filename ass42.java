package assignments;

import java.util.Scanner;

public class ass42 {
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int input= s1.nextInt();
		switch(input)
		{
		
		
		case 1: System.out.println("monday");
		break;
		
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default:System.out.println("Please enter 1,2,3,4,5,6,7");
		}
		
		}

	

	

}