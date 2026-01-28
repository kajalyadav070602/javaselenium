package Scinario_By_Maam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		//alrt1();
		//alrt2();
		alrt3() ;
	
	
	
	
	}
	
	public static void alrt1() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
	options.addArguments("---Start-maximized");
	
	ChromeDriver driver=new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Thread.sleep(2000);
	Alert alert1 = driver.switchTo().alert();
	System.out.println("first Alert Text:  "+alert1.getText());
    alert1.accept();
	Thread.sleep(2000);

    Alert alert2 = driver.switchTo().alert();
	System.out.println("Second Alert Text:  "+alert2.getText());
    alert2.accept();
	Thread.sleep(2000);
    driver.quit();
	
	
	}
	public static void alrt2() throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
	options.addArguments("---Start-maximized");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Alert alert1 = driver.switchTo().alert();
	System.out.println("first Alert Text:  "+alert1.getText());
    alert1.accept();
	Thread.sleep(2000);

    Alert alert2 = driver.switchTo().alert();
	System.out.println("Second Alert Text:  "+alert2.getText());
    alert2.accept();
	Thread.sleep(2000);
    driver.quit();
	
}
    public static void alrt3() throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
	options.addArguments("---Start-maximized");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://localhost:8888");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input [@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("")).click();
	
	
	
	
	
	
	
	
}	
	
	
}

