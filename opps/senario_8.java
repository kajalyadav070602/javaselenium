package opps;

public class senario_8 {

	public static void main(String[] args) {
		senario_8 objsen = new senario_8();
		objsen.send("A","B");
	}
public void send(int a, String b) {
System.out.println(a);	
System.out.println(b);	
}

public void send(String a,int b) {
	
	System.out.println(a);	
	System.out.println(b);	
}
}

