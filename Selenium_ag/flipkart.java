package Selenium_ag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	private static final WebElement WebElement = null;

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
         driver.get("http://localhost:8888");
         
                By useName=By.xpath("//input[@name='user_name']");
                WebElement wename =driver.findElement(useName);
                wename.sendKeys("admin");
                
               By bypassword= By.xpath("//input[@name='user_password']");
               WebElement  WePassword = driver.findElement(bypassword);
               WePassword.sendKeys("admin");
             
                By byLogin=By.xpath("//input[@id='submitButton']");  
                WebElement WeLogin=driver.findElement(byLogin);
                WeLogin.click();
                
                By byleads=By.xpath("//a[@href='index.php?module=Leads&action=index']");
                WebElement weleads =driver.findElement(byleads);
                weleads.click();
                
               By byplus= By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
                WebElement weplus=driver.findElement(byplus);
                weplus.click();
                
                WebElement byname =driver.findElement(By.name("firstname"));
                byname.sendKeys("kajal");
                
                WebElement bylastname=driver.findElement( By.name("lastname"));
                bylastname.sendKeys("yadav");
                
                WebElement companyname=driver.findElement(By.name("company"));
                companyname.sendKeys("matyaj");
                
                WebElement bytitle=driver.findElement(By.id("designation"));
                bytitle.sendKeys("mr");
           
                By byind=By.name("leadsource");
                WebElement weind=driver.findElement(byind);
                weind.sendKeys("Employee");
                
                By byinds=By.name("industry");
                WebElement weinds=driver.findElement(byinds);
                weinds.sendKeys("education");
                
                By annual=By.name("annualrevenue");
                WebElement weannual=driver.findElement(annual);
                weannual.sendKeys("500000");
                
                By noofemployee=By.id("noofemployees");
                WebElement wenoofemployee=driver.findElement(noofemployee);
                wenoofemployee.sendKeys("10000");
                
                By secondaryemail=By.id("secondaryemail");
                WebElement wesecondaryemail=driver.findElement(secondaryemail);
                wesecondaryemail.sendKeys("sy726608@gmail.com");
                
                By byphone=By.id("phone");
                WebElement wephone=driver.findElement(byphone);
                wephone.sendKeys("1234567890");
                
                By bymobile=By.id("mobile");
                WebElement wemobile=driver.findElement(bymobile);
                wemobile.sendKeys("7266088695");
                
                By byfax=By.id("fax");
                WebElement wefax=driver.findElement(byfax);
                wefax.sendKeys("987654321");
                
                By bywebsite=By.name("website");
                WebElement wewebsite=driver.findElement(bywebsite);
                wewebsite.sendKeys("vtiger");
                
                By bycountry=By.name("country");
                WebElement wecountry=driver.findElement(bycountry);
                wecountry.sendKeys("india");
                
                By byemail=By.id("email");
               WebElement weemail=driver.findElement(byemail);
                weemail.sendKeys("ky272861@gmail.com");
                
                By bystate=By.id("state");
                WebElement westate=driver.findElement(bystate);
                westate.sendKeys("u.p");
                
                By bycity=By.id("city");
                WebElement wecity=driver.findElement(bycity);
                wecity.sendKeys("bhadohi");
                
                
                
                
	}

}
