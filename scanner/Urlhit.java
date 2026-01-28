package scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlhit {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://localhost:8888/");
       By namepage= By.name("user_name");
          WebElement byclassname= driver.findElement(namepage);
          byclassname.sendKeys("admin");
         String name= byclassname.getAttribute("value");
         System.out.println(name);
          String url=driver.getTitle();
          System.out.println(url);
         String page =driver.getPageSource();
         System.out.println(page);
          
	}

}
