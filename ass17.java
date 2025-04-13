package assignments;

public class ass17 {

	public static void main(String[] args) {
		//  logical oprator AND,OR,NOT
		
		int mark= 78;
		
		if(mark>=100 && mark<=90) {
			
			
			System.out.println(" student pass with grade A");
		}
		
		else if(mark==70 || mark>70){
			
			System.out.println(" student pass with grade B");
			
			
		}
		
		
		else if(!(mark>=100 && mark<=90)&&(mark==70 || mark<70)) {
			
			
			System.out.println(" student pass with grade c");
		}
		
		else {
			
			System.out.println(" student fail");
		}
	}

}
