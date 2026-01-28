package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login_out__parent {
	ChromeDriver driver;
	
	public  void login() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		Thread.sleep(3000);


	}
public void logout() {
	Actions actobj=	new Actions(driver);
	WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	actobj.moveToElement(logout).build().perform();
	driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
	
	
	
}
}
