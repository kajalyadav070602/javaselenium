package opps;

public class Child_class extends parrent_class {

	public static void main(String[] args) {
	
		Child_class claChild_class=  new Child_class();
		claChild_class.showMassage();
	}
public void showMassage() {
	Child_class claChild_class=  new Child_class();
	super.massage();
}
public void massage() {
	System.out.println("child massage");
}
}
