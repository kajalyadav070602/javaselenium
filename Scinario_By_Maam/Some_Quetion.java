package Scinario_By_Maam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Some_Quetion {

	public static void main(String[] args) throws InterruptedException {
		//Prodname();
		//Prodprice();
		//srchbox();
		//count() ;
		//que1();
		Que2();
		//Que4(); 
	}
public static void Prodname() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com/");


Thread.sleep(5000);
		WebElement moallprodnam =  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		moallprodnam.sendKeys("phone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> all_phonename = driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
		for(int i=0;i<all_phonename.size();i++) {
			WebElement phone = all_phonename.get(i);
			System.out.println("all phone name is"+i+" > "+phone.getText());
		}}
		
	public static void Prodprice() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com/");
		
		WebElement laptop_price = driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']"));
		laptop_price.sendKeys("laptop");
		Thread.sleep(3000);
		WebElement srchclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		srchclick.click();
		Thread.sleep(3000);
		List<WebElement> laptopprice = driver.findElements(By.xpath("//span[@class='a-color-base']"));
		for(int i=0;i<laptopprice.size();i++) {
	
	WebElement laptop =  laptopprice.get(i);
	System.out.println("All laptop price"+" "+i+" "+laptop.getText());
	}
		
	}
		
	public static void 	srchbox() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com/");

		WebElement srchmob =  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		srchmob.sendKeys("mob");
		Thread.sleep(3000);
		List<WebElement> Allsuggest = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	for(int i=0;i<Allsuggest.size();i++) {
		WebElement Allsuggestprint = Allsuggest.get(i);
	
	System.out.println("All_suggest_name  "+i+" "+Allsuggestprint.getText());
	}
	
	
	}
		
		
	public static void count() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com/");
		Thread.sleep(5000);
		List<WebElement> countlink = driver.findElements(By.xpath("//a"));
		Thread.sleep(5000);
		for(int i=0;i<countlink.size();i++) {
		WebElement All_countlink = countlink.get(i);
	System.out.println("All_count_link "+i+" "+All_countlink.getText());
	}
	
	
	}
	public static void que1() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com/");
	
		WebElement hedpho =  driver.findElement(By.xpath("//input[@id='nav-bb-search']"));
		hedpho.sendKeys("Headphones");
		Thread.sleep(3000);
		WebElement searchclick = driver.findElement(By.xpath("//input[@class='nav-bb-button']"));
		searchclick.click();
		Thread.sleep(3000);

	List<WebElement> ratingstar = driver.findElements(By.xpath("//div[@class='a-row a-size-small']"));
	for(int i=0;i<ratingstar.size();i++) {
		WebElement ratingstar_print = ratingstar.get(i);
	System.out.println("All Headphone is "+i+" >"+ratingstar_print.getText());
	}
	}
	public static void Que2() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com/");
	
		WebElement sT_shirts =  driver.findElement(By.xpath("//input[@id='nav-bb-search']"));
		sT_shirts.sendKeys("menT_Shirts");
		Thread.sleep(3000);	
		WebElement searchclick = driver.findElement(By.xpath("//input[@class='nav-bb-button']"));
		searchclick.click();
		Thread.sleep(3000);
	
		List<WebElement> T_shirts = driver.findElements(By.xpath("//a"));
	for(int i=0;i<T_shirts.size();i++) {
	WebElement All_T_shirts = T_shirts.get(i);
	System.out.println("All_T_shirts"+" "+i+" > "+All_T_shirts.getText());
	
	}
	
	}
	public static void srchshoes() {
		
		
		
		
	}
	public static void Que4() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com/");
	
		WebElement hedpho =  driver.findElement(By.xpath("//input[@id='nav-bb-search']"));
		hedpho.sendKeys("Headphones");
		Thread.sleep(3000);	
		
		WebElement searchclick = driver.findElement(By.xpath("//input[@class='nav-bb-button']"));
		searchclick.click();
		Thread.sleep(3000);
		List<WebElement> All_Ratting = driver.findElements(By.xpath("//div[@class='a-row a-size-small']"));
		for(int i=0;i<All_Ratting.size();i++) {
			WebElement All_Ratting_print = All_Ratting.get(i);
		System.out.println("All_Rate_print"+"  "+i+">"+All_Ratting_print.getText());
		}
		
		
	}
	}


