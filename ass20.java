package assignments;

public class ass20 {
static void Home() {
		
		System.out.println("This is home name");
		
	}
	
static void Home(String add) {
		
		System.out.println("This is home address");
		
	}

static void Home(String add,int a) {
	
	System.out.println("This is home number");
	
}

static void Home(String add,int a,float b) {
	
	System.out.println("This is home Rent");
	
}
	
void Car() {
	
	System.out.println("This is my car ");
	
}

void Car(int a) {
	
	System.out.println("This is my car name ");
	
}
void Car(int a,String b) {

System.out.println("This is my car model ");

}
void Car(int a,String b,long c) {

System.out.println("This is my car model number ");

}
public static void main(String[] args) {
	ass20 m1=new ass20();
	
	m1.Car();
	m1.Car(2);
	m1.Car(3, "Dezire");
	m1.Car(4, "Dezire", 4567l);
		
	
	Home();
	Home("Gulmohar");
	Home("Gulmohar",3245);
	Home("Gulmohar",3245,3200.5f);
	

}

}
