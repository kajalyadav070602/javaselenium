package opps;

public class child_class1 extends parrent_class {
      int value=1000;
	
public static void main(String[] args) {
		child_class1 objchild = new child_class1();
		objchild.cheakvalues();
		
		
		
		
	}
	
	public void cheakvalues() {
		child_class1 objchild = new child_class1();
		int val=super.value;
		System.out.println(val);
	}
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
//		objchild.calculate();
//	}
//public void calculate() {
//	child_class1 objchild = new child_class1();
//	objchild.printResult();
//}
//public void printResult() {
//	System.out.println("i am child class print result");
//}




