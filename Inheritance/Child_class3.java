package Inheritance;

import org.openqa.selenium.By;

public class Child_class3 extends parent_class {

	public static void main(String[] args) {
		Child_class3 contacttext = new Child_class3();
		contacttext.Loginpage();
	contacttext.driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	contacttext.driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	contacttext.driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kajal");
	contacttext.driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yadav");
	contacttext.driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9437623647");
	contacttext.driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
	
	
	
	}

}
