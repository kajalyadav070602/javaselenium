package OOPS_1;

public class child extends Parent{
 int x=20;
	public static void main(String[]args) {
		child ch = new child();
			
	
System.out.println("Hii");
		
		
		//ch.car();
		//ch.horn();
	ch.display();
	
	}
	public void car() {

	}
	public void display() {
	System.out.println("child  -"+x);	
	System.out.println("parent  -"+super.x);
	}
}
