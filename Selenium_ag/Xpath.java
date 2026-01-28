package Selenium_ag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {

	private static final Actions Objaction = null;

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://localhost:8888/");		
    		
    
    
    
    
  WebElement weusername=driver.findElement(By.name("user_name"));		
  weusername.sendKeys("admin");		
    		
   WebElement wepswd=driver.findElement(By.name("user_password")); 		
   wepswd.sendKeys("admin");	
    		
    WebElement welogin=driver.findElement(By.id("submitButton"));
    welogin.click();    
    
    //WebElement welead=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
  //  welead.click();
  
    
    
    
//    WebElement wepluse=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//    wepluse.click();
//    
//     WebElement moreclick=driver.findElement(By.xpath("//a[@href='javascript:;']"));
 
//     Objaction.moveToElement(moreclick).build().perform();
//    
//     
     
    // Objaction.doubleClick().build().perform();
    Actions Objaction =new Actions(driver);
  WebElement myrecent = driver.findElement(By.xpath("//b[contains(text(),'My Recent FAQs')]"));
   WebElement newleads=driver.findElement(By.xpath("//b[contains(text(),'My New Leads')]"));
   // Thread.sleep(100);
      Objaction.clickAndHold(myrecent).moveToElement(newleads).release().build().perform();
  
  WebElement purchageorder=   driver.findElement(By.xpath("//b[contains(text(),'Top Purchase Orders')]"));
     Thread.sleep(1000);
  Objaction.clickAndHold(newleads).moveToElement(purchageorder).release().build().perform();
     
     Actions act=new Actions(driver);
     
    WebElement wemore=driver.findElement(By.xpath("//==a[text()='More']")); 
     act.moveToElement(wemore).build().perform();
     act.doubleClick(wemore).build().perform();
     
     act.contextClick(wemore).build().perform();
     
     act.click(wemore).build().perform();
     
    WebElement wesearch= driver.findElement(By.xpath("//input[@value='Search...']"));
     act.sendKeys(wesearch, "Kajal").build().perform();
     
    // act.dragAndDrop(wemore, wesearch).build().perform();
     act.clickAndHold().build().perform();
     
    WebElement footerLink= driver.findElement(By.linkText("vtiger.com"));
    		footerLink.click(); 
    
     //scroll- vartical scroll
     //Horizontal
    		Thread.sleep(2000);
     act.scrollByAmount(100, 1500).build().perform();
     Thread.sleep(3000); 
     act.scrollToElement(footerLink).build().perform();
     
}
}