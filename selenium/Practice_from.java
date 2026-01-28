package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_from {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");

		WebElement wefristname=driver.findElement(By.xpath("//input[@id='firstName']"));
		wefristname.sendKeys("Kajal");
	
		WebElement welastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		welastname.sendKeys("Yadav");
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("kajal@123gmail.com");
		
		
	//Gender
		WebElement genderclick=driver.findElement(By.xpath("//label[text()='Female']"));
		genderclick.click();
	

		WebElement mobilenumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobilenumber.sendKeys("3258066467");
		
		
	
		WebElement submitbutton=driver.findElement(By.xpath("//button[contains(@id,'submit')]"));
		submitbutton.click();
		
		
		
		WebElement fristname=driver.findElement(By.xpath("//input[@placeholder='First Name']/ancestor::div[@class='col-md-4 col-sm-6']"));	
		fristname.sendKeys("Shejal");
	
	
	}

	
	
	
	
	
	
	
}
