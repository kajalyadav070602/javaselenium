package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_Validation {

	public static void main(String[] args) {
		Vtiger_Validation VV= new Vtiger_Validation();
	VV.loginPage_Validation();

	}

	public void loginPage_Validation() {
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();//hear i am maximizing browser.
		
		String url="http:localhost:8888/";
		driver.navigate().to(url);//hitting url through navigate.
		
		String curenturl=driver.getCurrentUrl();
		System.out.println("current url hitting   "+curenturl);
		
		String tital=driver.getTitle();//hear i am  getting tital ();
        System.out.println("tital vtiget  "+tital);
        
        By byname=By.name("user_name");
        WebElement username=driver.findElement(byname);
        username.sendKeys("admin &");
        String  usertexbox=username.getAttribute("value");
        System.out.println("value of user name after send--"+ usertexbox);
        username.clear();
        String usernameClear=username.getAttribute("value");
        System.out.println("value of user name after clear---"+usernameClear);
        username.sendKeys("admin");
        
        WebElement userPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
        userPassword.sendKeys("admin1");
        
        WebElement loginclick=driver.findElement(By.xpath("//input[@type='submit']"));
        
        boolean displaylogin=loginclick.isDisplayed();
        System.out.println("is the login button display--"+displaylogin);
        
        boolean enablelogin =loginclick.isEnabled();
        System.out.println("is the login button enable---"+enablelogin);
        
        String loginbutton=loginclick.getText();
        System.out.println("get text login button---"+loginbutton);
        
        Dimension loginsize=loginclick.getSize();
        
        int expectedHeight=loginsize.getHeight();
        System.out.println("this is actual height--"+expectedHeight);
        
        int exepetedWidth=loginsize.getWidth();
        System.out.println("login button size of Width--"+exepetedWidth);
        
        int actualHeight=20;
        int actualedWidth=40;
        
            if
        (expectedHeight==actualHeight && exepetedWidth==actualedWidth) {
        System.out.println("expected and actual value match---    pass");}else{
        System.out.println("expected and actual value matched----faild  ");}
           
            
         
         
         
       Point XLocation=loginclick.getLocation();
       int loginXLocation=XLocation.getX();
        System.out.println("login button of X location-  "+loginXLocation);
        
        
       Point Ylocation=loginclick.getLocation();
       int loginYlocation=Ylocation.getY();
       System.out.println("login button of Y location-  "+loginYlocation);
        
        
        
        
        
        
        
       // weusername =driver.findElement(byname);
        //weusername.clear();
        //weusername.sendKeys("admin");
       // String attrivalue=weusername.getAttribute("value");
        //System.out.println("attribute value of user name   "+attrivalue);
}
}
