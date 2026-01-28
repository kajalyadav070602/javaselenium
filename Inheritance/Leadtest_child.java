package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Leadtest_child extends login_out__parent {

	public static void main(String[] args) throws InterruptedException {
		Leadtest_child lead_test=new Leadtest_child();
		lead_test.lead();
	}
	public void lead() throws InterruptedException {
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kajal");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yadav");
driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Wipro");
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
Thread.sleep(2000);	
logout();
	
	}
}
