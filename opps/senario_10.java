package opps;

public class senario_10 {

	public static void main(String[] args) {
		senario_10 objsen = new senario_10();
		objsen.display(10);
		}
	
	public void display(int a) {
		System.out.println("int>"+a);	
	}
	public void display(int... a) {
		System.out.println("int...>"+a);	
	}

}
