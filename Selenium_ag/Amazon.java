package Selenium_ag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
	//amazon();	
	flip();	
	Gmail();
	//myntra();
	}
	
	public static void amazon() {
    ChromeDriver driver1= new ChromeDriver();	    
	driver1.get("https://www.amazon.com/");
	By search =By.id("twotabsearchtextbox");
	WebElement search1=driver1.findElement(search);
	search1.sendKeys("addidas bag");
	
	
	}
	public static void flip() {
     ChromeDriver driver2=new ChromeDriver();
     driver2.get("https://www.flipkart.com");
	 By search=By.name("q");
	 WebElement search1=driver2.findElement(search);
	 search1.sendKeys("addidas bag");
	
	}	
     public static void Gmail() {
    	 ChromeDriver driver3= new ChromeDriver();
       	 driver3. get("http://localhost:8888/"); 
       	 
         
	    	 
     }
    public static void Myntra() {
    	ChromeDriver driver=new ChromeDriver();
   	driver.get("https://www.Myntra.com");
   	
}   	
        	
        
     }
