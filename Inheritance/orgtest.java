package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class orgtest extends login_out__parent{

	public static void main(String[] args) throws InterruptedException{
		 orgtest objorg= new orgtest();
		 objorg.oragnationmethod();

	}
public void oragnationmethod() throws InterruptedException {
	login();
	Thread.sleep(3000);
	Actions act=new Actions(driver); 
	WebElement weORG=driver.findElement(By.xpath("//a[text()='Organizations']"));
	act.moveToElement(weORG).build().perform();
	Thread.sleep(2000);
	act.click(weORG).build().perform();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Riya");
	driver.findElement(By.xpath("//select[@name='industry']")).sendKeys("Education");
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(2000);
	logout();
}
}
