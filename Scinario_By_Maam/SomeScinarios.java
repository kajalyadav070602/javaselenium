package Scinario_By_Maam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SomeScinarios {

	public static void main(String[] args) throws java.lang.InterruptedException {
		printAllLinks();
		countallbutton();
		  cheakboxinform();  
	}

	private static Object InterruptedException() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void printAllLinks() {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");

		By byusername=By.xpath("//input[@name='user_name']");
		WebElement weusername =driver.findElement(byusername);
		String  attributeval = weusername.getAttribute("name");
		System.out.println("attributeval---"+attributeval);  
		weusername.sendKeys("admin");

		By bypassword1=By.xpath("//input [@name='user_password']");
		WebElement weuserpassword1 =driver.findElement(bypassword1);
		// String attributevalpassword1= weuserpassword1.getAttribute("type");
		// System.out.println("attributevalpassword1---"+attributevalpassword1);
		weuserpassword1.sendKeys("admin");

		By bylogin =By.xpath("//input[@id='submitButton']");
		WebElement welogin= driver.findElement(bylogin);
		welogin.click();

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int k=0; k<links.size(); k++) {
			WebElement textOflinks = links.get(k);
			String alltextonPage =textOflinks.getText();

			System.out.println(k+"text"+alltextonPage);

		}
	}
	public static void countallbutton() {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");

		By byusername=By.xpath("//input[@name='user_name']");
		WebElement weusername =driver.findElement(byusername);
		String  attributeval = weusername.getAttribute("name");
		System.out.println("attributeval---"+attributeval);  
		weusername.sendKeys("admin");

		By bypassword1=By.xpath("//input [@name='user_password']");
		WebElement weuserpassword1 =driver.findElement(bypassword1);
		// String attributevalpassword1= weuserpassword1.getAttribute("type");
		// System.out.println("attributevalpassword1---"+attributevalpassword1);
		weuserpassword1.sendKeys("admin");

		By bylogin =By.xpath("//input[@id='submitButton']");
		WebElement welogin= driver.findElement(bylogin);
		welogin.click();

		List<WebElement> button = driver.findElements(By.xpath("//a"));
		for( int j=0;j<button.size();j++) {
			WebElement countofbutton = button.get(j);
			String allbuttononwebpage = countofbutton.getText();
			System.out.println(j+" "+allbuttononwebpage);

		}
	} 
	public static void cheakboxinform() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");

		By byusername=By.xpath("//input[@name='user_name']");
		WebElement weusername =driver.findElement(byusername);
		String  attributeval = weusername.getAttribute("name");
		System.out.println("attributeval---"+attributeval);  
		weusername.sendKeys("admin");

		By bypassword1=By.xpath("//input [@name='user_password']");
		WebElement weuserpassword1 =driver.findElement(bypassword1);
		// String attributevalpassword1= weuserpassword1.getAttribute("type");
		// System.out.println("attributevalpassword1---"+attributevalpassword1);
		weuserpassword1.sendKeys("admin");

		By bylogin =By.xpath("//input[@id='submitButton']");
		WebElement welogin= driver.findElement(bylogin);
		welogin.click();

		List<WebElement> cheakbox = driver.findElements(By.xpath("//a"));
		for(int i=0; i<cheakbox.size(); i++) {
			WebElement atoz = cheakbox.get(i);
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			
			act.click(atoz).build().perform();
		}



		}
		}




