package Selenium_ag;

import org.openqa.selenium.chrome.ChromeDriver;



public class Automation {

	public static void main(String[] args) {
		equalmethod();
		Verifycreatelead();
		equalsmethod();
		country();
		
		
		
	}
	
public static void Verifycreatelead() {
	

	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://localhost:8888/");
	String expectedTitle="Vtiger CRM 5-Commerial open source CRM";
	String actualtitle=driver.getTitle();
	if (expectedTitle.equals(actualtitle)) {
	System.out.println("expectedtitle and actualTitle are match"+"Title validation passed");

}  
   else {
   
   System.out.println("expectedtitle and actualTitle are match"+"Title validation failed");
   
}
}
	public static void equalmethod() {
	String name="kajal";
	String name1="KAJAL";		
	
	
	if(name.equals(name1)){
	 System.out.println("pass the user name---"+"name and name1 are matched");	
	
	} else {
		System.out.println("massage when not matched");
	}
		
	}
	public static void equalsmethod() {
		String nam1="mahi";
		String nam2="mahi";
		if(nam1.equals(nam2)) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
		}
	}
	public static void country() {
		String name1 ="uttar pradesh";
		String name2="u.p";
		String name3="mumbai";
		String name4="delhi";
		if(name1.equals(name4));
		System.out.println("matched");
		
		
	}
	}
