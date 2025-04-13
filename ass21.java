package assignments;



public class ass21 {
ass21(String emp ){
		
		
		System.out.println("This is constructor1");
	}
	
ass21(String emp ,int id){
		
		
		System.out.println("This is constructor2");
	}
ass21(String emp,int id, String company ){
	
	
	System.out.println("This is constructor3");
}
ass21(String emp,int id, String company,int salary ){
	
	
	System.out.println("This is constructor4");
}
	
	
	

	public static void main(String[] args) {
		
		ass21 a1=new ass21 ("snehal");
		new ass21("snehal",32);
		new ass21("snehal",32,"infosys");
		new ass21("snehal",32,"infosys",60000 );

	
		

		

	}
}
