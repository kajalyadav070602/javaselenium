package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Child_class2 extends parent_class {

	public static void main(String[] args) {
		Child_class2 orgtext = new Child_class2();
		orgtext.Loginpage();
	orgtext.driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	orgtext.driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	orgtext.driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Pratima");
	WebElement indexslct = orgtext.driver.findElement(By.xpath("//select[@name='industry']"));
	Select objslct = new Select(indexslct);
	objslct.selectByIndex(2);
   orgtext.driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
	}

}
