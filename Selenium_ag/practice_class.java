package Selenium_ag;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice_class {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");

		By useName = By.xpath("//input[@name='user_name']");
		WebElement wename = driver.findElement(useName);
		wename.sendKeys("admin");

		By bypassword = By.xpath("//input[@name='user_password']");
		WebElement WePassword = driver.findElement(bypassword);
		WePassword.sendKeys("admin");

		By byLogin = By.xpath("//input[@id='submitButton']");
		WebElement WeLogin = driver.findElement(byLogin);
		WeLogin.click();

		//		WebElement wemore = driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
		//		wemore.click();
		//		String more = wemore.getText();
		//		System.out.println(more);
		//		List<WebElement> weLinkList = driver.findElements(By.xpath("//a"));
		Thread.sleep(3000);
		WebElement Leads=driver.findElement(By.xpath("//a[text()='Leads']"));
		Leads.click();


		List<WebElement> alphabets = driver.findElements(By.xpath("//td[@class='searchAlph']"));
		for(int i=0; i<alphabets.size(); i++) {
			WebElement atoz = alphabets.get(i);
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			
			act.click(atoz).build().perform();
		}




	}

}






////td[@id='alpha_1']

