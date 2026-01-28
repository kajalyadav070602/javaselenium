package Scinario_By_Maam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_page {

	public static void main(String[] args) throws InterruptedException {
		//W3s();

		//W3s1();
		//W3s2();
		//W3s3();

		//senario1();
		//senario2();
		//senario3() ;
		senario4();







	}
	public static void W3s() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 12200).perform();
		Thread.sleep(2000);

		WebElement we = driver.findElement(By.xpath("//iframe[@title='How To Selection']"));
		driver.switchTo().frame(0);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='next']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Learn How To']")).click();

		Thread.sleep(20000);
	}

	public static void W3s1() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp");
		Thread.sleep(2000);

		driver.manage().window().maximize();	
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		Thread.sleep(2000);

		driver.switchTo().frame(frame);	
		driver.findElement(By.xpath("//button[@type='button']")).click();

	}
	public static void W3s2() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(10000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@title='W3Schools Free Online Web Tutorials']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(10000);
		WebElement frame3 = driver.findElement(By.xpath("//a[@class='ga-nav subtopnav_firstitem']"));
		frame3.click();




	}

	public static void W3s3() throws InterruptedException {
		ChpublicromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(2000);
		WebElement crosclik = driver.findElement(By.xpath("//button[@class='tox-notification__dismiss tox-button tox-button--naked tox-button--icon']"));
		crosclik.click();

	}



	 static void senario1() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frame2);

		WebElement text = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		System.out.println("text heading   > "+text.getText());
	}

	public static void senario2() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);

		WebElement display = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		System.out.println("text heading   > "+display.getText());
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		WebElement parent_display = driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
		System.out.println("text  "+parent_display.getText());

	}

	public static void senario3() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
//		WebElement text = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
//		System.out.println("text heading   > "+text.getText());
//		driver.switchTo().parentFrame();
//		Thread.sleep(3000);
//		WebElement parent_hading = driver.findElement(By.className("//p[text()='You can use the height and width attributes to specify the size of the iframe:']"));
//		System.out.println("parent_heading  >   "+parent_hading.getText());
//		Thread.sleep(3000);
//		WebElement upr = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
//		driver.switchTo().frame(upr);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(""));
	}
	
	static void senario4() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frame2);

		WebElement display = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		boolean visible = display.isDisplayed();
		Thread.sleep(3000);
		System.out.println("text heading   > "+display.getText());
	
}
}