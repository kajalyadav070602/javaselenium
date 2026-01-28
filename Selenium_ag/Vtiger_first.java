package Selenium_ag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_first {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://localhost:8888");
        driver.manage().window().maximize();
        
       String getTitle=driver.getTitle();
      System.out.println("found of title is vtiger --"+getTitle);  
       
      String bypagesourse=driver.getPageSource();
      System.out.println(bypagesourse);
      
     String  getcurenturl= driver.getCurrentUrl();
      System.out.println("curenturl of vtigerweb base application---"+getcurenturl);  
        
        
     WebElement weusername=driver.findElement(By.xpath("//input[@type='text']"));  
     weusername.sendKeys("admin");
     weusername.clear() ;
     String attributevalweusername=weusername.getAttribute("name");
     System.out.println("first clear in the inputbox than enter the currect name"+attributevalweusername);
     String bytagname=weusername.getTagName();
     System.out.println("by username tag value---"+bytagname);
     weusername.sendKeys("admin");
	}

}
