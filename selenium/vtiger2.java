package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
         driver.get("http:localhost:8888/");
        //String PageSource  = driver.getPageSource();
        // System.out.println(PageSource);
       //String Title= driver.getTitle();
        // System.out.println(Title);
         
         WebElement weusername =driver.findElement(By.xpath("//input[@name='user_name']"));
         weusername.sendKeys("admin");
         String strpbj= weusername.getAttribute("name");
         System.out.println(strpbj);

      WebElement wepwd=  driver.findElement(By.xpath("//input[@name='user_password']"));
       wepwd.sendKeys("admin"); 
      String strpbj1= wepwd.getAttribute("type");
      System.out.println(strpbj1);  
       
      WebElement welogin= driver.findElement(By.xpath("//input[@id='submitButton']")); 
      welogin.click();
    String strpbj2= welogin.getAttribute("value");
     System.out.println(strpbj2); 
      
	}

}
