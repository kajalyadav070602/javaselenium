package Inheritance;

import org.openqa.selenium.By;

public class createcontact  extends login_out__parent{

	
	public static void main(String[] args) throws InterruptedException {
		createcontact CT=new createcontact();
		CT.textcontact() ;	
		
	}
public void textcontact() throws InterruptedException {
	login();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pal");
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9683748334");
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(3000);
	logout();
}
}
