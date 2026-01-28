package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_class {
	static ChromeDriver driver;
	public static void main(String[] args) {
		Loginpage();
	}
	
	public static  void Loginpage() {
		
		driver=new ChromeDriver();
		driver.get("http://localhost:8888");
     driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
     driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}



}
