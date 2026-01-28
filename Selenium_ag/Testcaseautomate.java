package Selenium_ag;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testcaseautomate {

	public static void main(String[] args) {
		Testcaseautomate ab=new Testcaseautomate();
	    // ab.equal();
	    // ab.Studentmark1();
	     //ab.marks();
	     ab.weekly();
		ChromeDriver driver=new ChromeDriver();		
		driver.get("http://localhost:8888/");
		String name1="Admin";
		String name2="admin";
		if(name2.equalsIgnoreCase(name1)){
			System.out.println("if name case then ----passed");
		}
		 else 
		{
			System.out.println("if name case then ----failed");
		}
		
		
}
	 public void equal() {
		 String name="Test@Gmail.com";
		 String name1="test@gmail.com";
		 if(name.equals(name1)) {
			 System.out.println("passed");
		 }else {
			 System.out.println("fail");
		 }
		 if(name.equalsIgnoreCase(name1)) {
			 System.out.println("passes");
		 }else {
			 System.out.println("failed");
		 }
	 }                                                     
	 public void Studentmark1() {
		int studentTotalmark=80;
		if(studentTotalmark>100) {
			System.out.println("congratulation  > Student  -pass");
			
		}else {
			System.out.println("so sad Student   - failed");
		}
	 }
	 public void marks() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your marks -");
		 int mark=sc.nextInt();
		 int mark2=100;
		 if(mark>=mark2) {
			 System.out.println("congratulation Dear Student you are - ");
		 }else {
			 System.out.println("so sad Dear Student yuo are failed");
		 }
	 }
	 public void weekly() {
		 String actual_weekdays="monday";
	    if(actual_weekdays.equalsIgnoreCase("tuesday")) {
	    System.out.println("week days ---work hard");	
	    }
	 
	    else {
	    	System.out.println("week days holidays---relax");
	    }
}	

}		
	
		
	


