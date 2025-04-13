package assignments;

public class ass41 {

	public static void main(String[] args) {
		// WAP to print 1 to 31 and skip 4,17,28 number using continue keyword
		
		for(int i=1;i<=31;i++) {
			
			
			if(i==4||i==17||i==28) {
				
				continue;
				
			}
			
			System.out.println(i);
		}
		
		
		
		
		

	}

}
