package assignments;

public class ass48 {
	
	// WAP on constructor chaining
	
	ass48(String name){
		
		String Student = name;
		
		System.out.println("name of student is--->" +Student );
		
		
		
	}
ass48(String name ,int roll){
	this("snehal");
		
		String Student = name;
		int rollno= roll;
		
		System.out.println("rollno of student is--->" +rollno );
		
		
		
	}ass48(String name ,int roll,double id){
		this("snehal",879);
		String Student = name;
		int rollno= roll;
		double idno= id; 
		
		System.out.println("id no of student is--->" +id );
		
		
		
	}
	
	

	public static void main(String[] args) {
		// WAP on constructor chaining

		ass48 d1= new ass48("snehal",46,87.89);
		
		
	}

}
