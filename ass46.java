package assignments;

// WAP on super calling statement


class first{
	
	first(){
		
		System.out.println(" This is constructor1");				
		
	}
}


public class ass46 extends first {

	
		
			
	
				
				
				ass46(){
					super();
					System.out.println(" This is constructor2");	
					
				}
				
				
				public static void main(String[] args) {
					// TODO Auto-generated method stub
					new ass46();
			}
			
		}
	

	

