package Scinario_By_Maam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scinario_sol {

	public static void main(String[] args) throws InterruptedException {
		sn1(); 
		//sn2();
		//sn3();
		//sn4();
		//sn5();
	//sn6();
	}	
//////////////////////////////////////		
	public static void sn1() {	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
	
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='lvt small']//tr"));
		for(int i=0;i < row.size(); i++) {
			WebElement get_all_row = row.get(i);
			 
	System.out.println(i+"  all count button "+get_all_row.getText());
	}
	}
	public static void sn2() {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		List<WebElement> leadtable = driver.findElements(By.xpath("//tr//td[@class='lvtCol']"));
		int we_leadtable = leadtable.size();
		System.out.println(we_leadtable);
		for(int i=0;i < we_leadtable; i++) {
			WebElement we_leadtable_link = leadtable.get(i);
			System.out.println(i+" >" +we_leadtable_link.getText());
			
		
		}}
	

    public static void sn3() {
    	ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		List<WebElement> Email = driver.findElements(By.xpath("//a[text()='Email']"));
		for(int i=0;i < Email.size(); i++) {
			WebElement  Email_id = Email.get(i);
			String we_Email_id = Email_id.getText();
       System.out.println(i+"  all count button "+we_Email_id);
		}


    }
    public static void sn4() {
    	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");

	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	List<WebElement> edit_button = driver.findElements(By.xpath("//a[text()='edit']"));
	for(int i=0;i < edit_button.size(); i++) {
		WebElement count_edit_button = edit_button.get(i);
		String count_button = count_edit_button.getText();
   System.out.println(i+"  all count button "+count_edit_button);
}
	
}
	public static void sn5() throws InterruptedException {

	ChromeDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");

	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	Thread.sleep(2000);
	List<WebElement> list_cheak_boxes = driver.findElements(By.xpath("//input[@name='selected_id']"));
	int cheakboxescount=list_cheak_boxes.size();
	for(int i=0;i < 3; i++) {
		WebElement we_cheak_boxes = list_cheak_boxes.get(i);
		 we_cheak_boxes.click();
    System.out.println(i+"  all count button "+we_cheak_boxes);

}}
	
public static void sn6() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");

	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));






}
	
	
	
}














