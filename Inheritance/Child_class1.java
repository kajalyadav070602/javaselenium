package Inheritance;

import org.openqa.selenium.By;

public class Child_class1 extends parent_class {

	public static void main(String[] args) {
		Child_class1 obj = new Child_class1();
		obj.Loginpage();
		obj.driver.findElement(By.xpath("//a[text()='Leads']")).click();
		obj.driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
obj.driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kajal");
obj.driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yadav");
obj.driver.findElement(By.xpath("//input[@name='company']")).sendKeys("surya");
obj.driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();






	}

}
