package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartpageAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
	WebElement countinuesopping = driver.findElement(By.xpath("//button[text()='Continue shopping']"));
	countinuesopping.click();
	WebElement searchbox = driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']"));
	searchbox.sendKeys("laptop");
	WebElement searchbuttonclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	searchbuttonclick.click();
	WebElement fristproduct= driver.findElement(By.xpath("(//[@class='puisg-col-inner']//span[text()='Samsung Galaxy Book4 (Gray, 16GB RAM, 512GB SSD) | 15.6\" Full HD Screen | Intel Core i5 1335U Processor | Windows 11 Home | MS Office 2021 | Fingerprint Reader | Intel Iris XE Graphics | RJ45 LAN Port'])[1]"));   
	fristproduct.click();
	
	}

}
