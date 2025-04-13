package assignments;
abstract class Amazon_1
{
		abstract void login();
		abstract void logout();
		void address()
		{
			
		}
		static void payment()
		{
			
		}
	
}
abstract class Amazon_2 extends Amazon_1
{
	abstract void twowayauth(); //needs to be overrideen
	abstract void otp();//needs to be overrideen
	void cart()//can be overridden
	{
		
	}
	static void addtowishlist()//it cannot be overridden
	{
		
	}

}
public class Amazon_Program extends Amazon_2
{
	
public static void main(String[] args) 
{

	
}

@Override
void twowayauth() {
	// TODO Auto-generated method stub
	
}

@Override
void otp() {
	// TODO Auto-generated method stub
	
}

@Override
void login() {
	// TODO Auto-generated method stub
	
}

@Override
void logout() {
	// TODO Auto-generated method stub
	
}
}
