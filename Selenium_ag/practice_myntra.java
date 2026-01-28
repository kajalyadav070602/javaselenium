package Selenium_ag;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_myntra {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://yatra.com/");
        List<WebElement>weLinkList=driver.findElements(By.xpath("//a"));
        
        int LinkCount=weLinkList.size();
        for( int i=0; i<LinkCount;i++) {
        	
        	WebElement we=	weLinkList.get(i);
        	String text=we.getText();
        	System.out.println(i+" " +text);
        	
        	
        }
        
        
        
	}

}
