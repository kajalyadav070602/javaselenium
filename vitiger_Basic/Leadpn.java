package vitiger_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leadpn {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
         driver.get("http://localhost:8888");
        WebElement username=  driver.findElement(By.xpath("//input[@name='user_name']"));
        
        if(username.isDisplayed()) {
        	System.out.println("username is Displayed-----passed ");
        }
        
        else {
        	System.out.println("username is not Displayed -------failed");
        }
        if(username.isEnabled()) {
        	System.out.println("username is enable-----passed");
        }
        else {
        	System.out.println("username is not enable -------failed");
        } 
        username.sendKeys("admin");
        username.clear();
        String bytagname=username.getTagName();
        System.out.println("by username tag value"+bytagname);
        username.sendKeys("admin");
        String attributevalusername=username.getAttribute("name");
        System.out.println("username inputbox is admin"+attributevalusername);
        
	
      WebElement  userpswd=driver.findElement(By.xpath("//input[@name='user_password']"));
      if(userpswd.isDisplayed()) {
    	  System.out.println("userpswd input box is display------passed");
      }
      else {
    	  System.out.println("userpswd input box is not display------failed");
      }
    	if(userpswd.isEnabled()) {
    		System.out.println("userpswd input box is enable------passed");
    	}
    	else {
    		System.out.println("userpswd input box is not enable------failed");
    	}
      userpswd.sendKeys("admin");
      userpswd.clear();
      String bytagnamepswd=userpswd.getTagName();
      System.out.println("by userpswd tag value "+bytagnamepswd);
      userpswd.sendKeys("admin");
     
      
      WebElement welogin= driver.findElement(By.xpath("//input[@id='submitButton']")); 
      welogin.click();
      
      
      
      
}
}