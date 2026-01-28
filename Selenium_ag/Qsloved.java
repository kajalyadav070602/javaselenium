package Selenium_ag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qsloved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://localhost:8888");
        
               By useName=By.xpath("//input[@name='user_name']");
               WebElement wename =driver.findElement(useName);
               wename.sendKeys("admin");
               
              By bypassword= By.xpath("//input[@name='user_password']");
              WebElement  WePassword = driver.findElement(bypassword);
              WePassword.sendKeys("admin");
            
               By byLogin=By.xpath("//input[@id='submitButton']");  
               WebElement WeLogin=driver.findElement(byLogin);
               WeLogin.click();
               
                String actualtitle=  driver.getTitle();
               System.out.println("");
               
               
               
	}

}
