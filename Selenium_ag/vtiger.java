package Selenium_ag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://localhost:8888");
       
       By byusername=By.xpath("//input[@name='user_name']");
       WebElement weusername =driver.findElement(byusername);
      String  attributeval = weusername.getAttribute("name");
      System.out.println("attributeval---"+attributeval);  
       weusername.sendKeys("admin");
       
       By bypassword1=By.xpath("//input [@name='user_password']");
       WebElement weuserpassword1 =driver.findElement(bypassword1);
       String attributevalpassword1= weuserpassword1.getAttribute("type");
       System.out.println("attributevalpassword1---"+attributevalpassword1);
       weuserpassword1.sendKeys("admin");
       
       By bylogin =By.xpath("//input[@id='submitButton']");
       WebElement welogin= driver.findElement(bylogin);
       String attributevallogin= welogin.getAttribute("value");
       System.out.println("attributevallogin---"+attributevallogin);
       welogin.click();
       
      // By byleads =By.xpath("//a[@href='index.php?modul=leads&action=index']");
     //  WebElement weleads=driver.findElement (byleads);
     //  weleads.click();		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
    	
			   
     

	}

}
