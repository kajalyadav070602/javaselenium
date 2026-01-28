package Selenium_ag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class from_fill_2 {

	


			public static void main(String[] args) {

				ChromeDriver driver = new ChromeDriver();
				driver.get("http://localhost:8888/");
				String expectedtitle = "Vtiger CRM 5-Commerial open source CRM";
				String actualtitle = driver.getTitle();
				System.out.println(expectedtitle);
				if (actualtitle.equals(expectedtitle)) {
					System.out.println("actualtitle and expectedtitle are matched" + "title passed");

				} else {

					System.out.println("actualtitle and expectedtitle are not matched" + "title failed");
				}
				//////
				By username = By.xpath("//input[@name='user_name']");
				WebElement weusername = driver.findElement(username);
				if (weusername.isDisplayed()) {
					System.out.println("input box is visible");
				} else {
					System.out.println("input box is invisible");
				}
				if (weusername.isEnabled()) {
					System.out.println("input box is enable");
				} else {
					System.out.println("input box is disable");
				}
				String wevalue = weusername.getAttribute("value");
				System.out.println(wevalue + "value of input box");

				if (wevalue.equals("")) {
					System.out.println("input box is blank");
				} else {
					System.out.println("input box is not blank");
				}
				WebElement Weusername = driver.findElement(By.name("user_name"));
				weusername.sendKeys("admin");
				String enteredValue = Weusername.getAttribute("value");
				if (enteredValue.equals("admin")) {
					System.out.println("pass: the username is visible");
				} else {
					System.out.println("fail: the username is unvisible");
				}
				////		
				By userpswd = By.xpath("//input[@name='user_password']");
				WebElement wepswd = driver.findElement(userpswd);
				if (wepswd.isDisplayed()) {
					System.out.println("Password box is visible");
				} else {
					System.out.println("Password box is not visible");
				}
				if (wepswd.isEnabled()) {
					System.out.println("password is enable");
				} else {
					System.out.println("password is not enable");
				}
				if (wepswd.equals("")) {
					System.out.println("input box is blank");
				} else {
					System.out.println("input box is not blank");

				}
				WebElement weuserpswd = driver.findElement(By.name("user_password"));
				// weuserpswd.sendKeys("admin");
				String enteredvalue = weuserpswd.getAttribute("type");

				if (enteredValue.equals("enteredValue")) {
					System.out.println("password input box is mark---passed");

				} else {
					System.out.println("password input box is not mark----failed");
				}
				wepswd.sendKeys("admin");
				//////	
				By bylogin = By.xpath("//input[@id='submitButton']");
				WebElement welogin = driver.findElement(bylogin);
				if (welogin.isDisplayed()) {
					System.out.println("input box is visible");
				} else {
					System.out.println("input box is not visible");

				}
				if (welogin.isEnabled()) {
					System.out.println("login is enable");
				} else {
					System.out.println("login is not enable");

				}
				welogin.click();
				String actualhomepage = driver.getTitle();
				System.out.println("actualhomepage");
				String expectedhomepagetitle = "Vtiger CRM 5-Commerial open source CRM";
				if (actualhomepage.equalsIgnoreCase(expectedhomepagetitle)) {
					System.out.println("Home pagetitle should be match---passed");
				} else {
					System.out.println("Home pagetitle should be not match---failed");

				}
				////
				By leads = By.xpath("//a[@href='index.php?module=Leads&action=index']");
				WebElement weleads = driver.findElement(leads);
				if (weleads.isDisplayed()) {
					System.out.println("leads is display ---passed");

				} else {
					System.out.println("leads is not display----failed");
				}
				if (weleads.isEnabled()) {
					System.out.println("leads is enable-----passed");
				} else {
					System.out.println("leads is not enable-----failed");
				}

				By leads1 = By.xpath("//a[@href='index.php?module=Leads&action=index']");
				WebElement weleads1 = driver.findElement(leads1);
				if (weleads.isDisplayed()) {
					System.out.println("leads is display ---passed");

				} else {
					System.out.println("leads is not display----failed");
				}
				if (weleads.isEnabled()) {
					System.out.println("leads is enable-----passed");
				} else {
					System.out.println("leads is not enable-----failed");
				}
				weleads1.click();

				By leadno = By.xpath("//select[@name='search_field']");
				WebElement byleadno = driver.findElement(leadno);
				Select leadlist = new Select(byleadno);
				WebElement selecttext = leadlist.getFirstSelectedOption();
				String actualselecttext = selecttext.getText();
				String expectedselecttext = "Lead No";
				if (actualselecttext.equalsIgnoreCase(expectedselecttext)) {
					System.out.println("actual and expect lead no is matched----passed" + expectedselecttext);
				} else {
					System.out.println("actual and expect lead no is not matched-----failed" + actualselecttext);
				}

				/////	 
				By add=By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
				WebElement weadd=driver.findElement(add);
				if(weadd.isDisplayed()) {
					System.out.println("add is display-----passed");
				}
				else {
					System.out.println("add is not display-----failed");
				}
				if(weadd.isEnabled()) {
					System.out.println("add is enable-----passed");
				}
				else {
					System.out.println("add is not enable------failed");
				}
				weadd.click();
				/////	
				By firstname=By.xpath("//input[@name='firstname']");
				WebElement wefirstname=driver.findElement(firstname);
				if(wefirstname.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wefirstname.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualfirstnameblank=wefirstname.getAttribute("value");
				String expectedfirstnmeblank="";
				if(actualfirstnameblank.equalsIgnoreCase(expectedfirstnmeblank)) {
					System.out.println("it should be firstname blank----passed");
				}else {
					System.out.println("it should be firstname blank----failed");
				}
				wefirstname.sendKeys("kajal");


				By lastname=By.xpath("//input[@name='lastname']");
				WebElement welastname=driver.findElement( lastname);
				if(welastname.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(welastname.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actuallastnameblank=welastname.getAttribute("value");
				String expectedlastnameblank="";
				if(actuallastnameblank.equalsIgnoreCase(expectedlastnameblank)) {
					System.out.println("it should be lastname blank----passed");
				}else {
					System.out.println("it should be lastname blank----failed");
				}
				welastname.sendKeys("yadav");



				By companyname=By.xpath("//input[@name='company']");
				WebElement wecompanyname=driver.findElement(companyname);
				if(wecompanyname.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wecompanyname.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualcompanynameblank= wecompanyname.getAttribute("value");
				String expectedcompanynameblank="";
				if(actualcompanynameblank.equalsIgnoreCase(expectedcompanynameblank)) {
					System.out.println("it should be companyname blank----passed");
				}else {
					System.out.println("it should be companyname blank----failed");
				}
				wecompanyname.sendKeys("iran");

				By titlename=By.xpath("//input[@id='designation']");
				WebElement wetitlename=driver.findElement(titlename);
				if(wetitlename.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wetitlename.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualtitlenameblank= wetitlename.getAttribute("value");
				String expectedtitlenameblank="";
				if(actualtitlenameblank.equalsIgnoreCase(expectedtitlenameblank)) {
					System.out.println("it should be titlename blank----passed");
				}else {
					System.out.println("it should be titlename blank----failed");
				}
				wetitlename.sendKeys("mr.");
				//select[@name='leadsource']

				By leadsourcedropdown=By.xpath("//select[@name='leadsource']");
				WebElement weleadsourcedropdown=driver.findElement(leadsourcedropdown);
				if(weleadsourcedropdown.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(weleadsourcedropdown.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualleadsourcedropdownblank= weleadsourcedropdown.getAttribute("value");
				String expectedleadsourcedropdownblank="";
				if(actualleadsourcedropdownblank.equalsIgnoreCase(expectedleadsourcedropdownblank)) {
					System.out.println("it should be leadsourcedropdown blank----passed");
				}else {
					System.out.println("it should be leadsourcedropdown blank----failed");
				}
				weleadsourcedropdown.sendKeys("partner");

				By industry=By.xpath("//select[@name='industry']");
				WebElement weindustry=driver.findElement(industry);
				if(weindustry.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(weindustry.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualindustryblank= weindustry.getAttribute("value");
				String expectedindustryblank="";
				if(actualindustryblank.equalsIgnoreCase(expectedindustryblank)) {
					System.out.println("it should be industry blank----passed");
				}else {
					System.out.println("it should be industry blank----failed");
				}
				weindustry.sendKeys("biotechnology");


				By annualrevenue=By.xpath("//input[@name='annualrevenue']");
				WebElement weannualrevenue=driver.findElement(annualrevenue);
				if(weannualrevenue.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(weannualrevenue.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualweannualrevenueblank= weannualrevenue.getAttribute("value");
				String expectedweannualrevenuenameblank="";
				if(actualweannualrevenueblank.equalsIgnoreCase(expectedweannualrevenuenameblank)) {
					System.out.println("it should be annualrevenue blank----passed");
				}else {
					System.out.println("it should be annualrevenue blank----failed");
				}
				weannualrevenue.sendKeys("50000");


				By noofemployees=By.xpath("//input[@id='noofemployees']");
				WebElement wenoofemployees=driver.findElement(noofemployees);
				if(wenoofemployees.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wenoofemployees.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualnoofemployeesblank= weannualrevenue.getAttribute("value");
				String expectednoofemployeesblank="";
				if(actualweannualrevenueblank.equalsIgnoreCase(expectedweannualrevenuenameblank)) {
					System.out.println("it should be noofemployees blank----passed");
				}else {
					System.out.println("it should be noofemployees blank----failed");
				}
				wenoofemployees.sendKeys("80");

				By secondaryemail=By.xpath("//input[@id='secondaryemail']");
				WebElement wesecondaryemail=driver.findElement(secondaryemail);
				if(wesecondaryemail.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wesecondaryemail.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualsecondaryemailblank= wesecondaryemail.getAttribute("value");
				String expectedsecondaryemailblank="";
				if(actualsecondaryemailblank.equalsIgnoreCase(expectedsecondaryemailblank)) {
					System.out.println("it should be secondaryemail blank----passed");
				}else {
					System.out.println("it should be secondaryemail blank----failed");
				}
				wesecondaryemail.sendKeys("hkt1252@gmail.com");

				By lead_no=By.xpath("//input [@id='lead_no']");
				WebElement welead_no=driver.findElement(lead_no);
				if(welead_no.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(welead_no.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actuallead_noblank= welead_no.getAttribute("value");
				String expectedlead_noblank="";
				if(actualsecondaryemailblank.equalsIgnoreCase(expectedsecondaryemailblank)) {
					System.out.println("it should be lead_no blank----passed");
				}else {
					System.out.println("it should be lead_no blank----failed");
				}
				welead_no.sendKeys("3657785");


				By phone=By.xpath("//input[@id='phone']");
				WebElement wephone=driver.findElement(phone);
				if(wephone.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wephone.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualwephoneblank= welead_no.getAttribute("value");
				String expectedwephoneblank="";
				if(actualwephoneblank.equalsIgnoreCase(expectedwephoneblank)) {
					System.out.println("it should be phone blank----passed");
				}else {
					System.out.println("it should be phone blank----failed");
				}
				wephone.sendKeys("9978683749");

				By mobile=By.xpath("//input[@id='mobile']");
				WebElement wemobile=driver.findElement(mobile);
				if(wemobile.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wemobile.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualmobileblank= wemobile.getAttribute("value");
				String expectedmobileblank="";
				if(actualwephoneblank.equalsIgnoreCase(expectedwephoneblank)) {
					System.out.println("it should be mobile blank----passed");
				}else {
					System.out.println("it should be mobile blank----failed");
				}
				wemobile.sendKeys("8278683749");

				By fax=By.xpath("//input[@id='fax']");
				WebElement wefax=driver.findElement(fax);
				if(wefax.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wefax.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualfaxblank= wemobile.getAttribute("value");
				String expectedfaxblank="";
				if(actualfaxblank.equalsIgnoreCase(expectedfaxblank)) {
					System.out.println("it should be fax blank----passed");
				}else {
					System.out.println("it should be fax blank----failed");
				}
				wefax.sendKeys("7687868374");


				By email=By.xpath("//input [@id='email']");
				WebElement weemail=driver.findElement(email);
				if(weemail.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(weemail.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualemailblank= weemail.getAttribute("value");
				String expectedemailblank="";
				if(actualemailblank.equalsIgnoreCase(expectedemailblank)) {
					System.out.println("it should be email blank----passed");
				}else {
					System.out.println("it should be email blank----failed");
				}
				weemail.sendKeys("ky658734@gmail.com");

				By website=By.xpath("//input [@name='website']");
				WebElement wewebsite=driver.findElement(website);
				if(wewebsite.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wewebsite.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualwebsiteblank= wewebsite.getAttribute("value");
				String expectedwebsiteblank="";
				if(actualwebsiteblank.equalsIgnoreCase(expectedwebsiteblank)) {
					System.out.println("it should be website blank----passed");
				}else {
					System.out.println("it should be website blank----failed");
				}
				wewebsite.sendKeys("igj@.com");
			
				By leadstatus=By.xpath("//select[@name='leadstatus']");
				WebElement weleadstatus=driver.findElement(leadstatus);
				if(weleadstatus.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(weleadstatus.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualleadstatusblank= weleadstatus.getAttribute("value");
				String expectedleadstatusblank="";
				if(actualleadstatusblank.equalsIgnoreCase(expectedleadstatusblank)) {
					System.out.println("it should be leadstatus blank----passed");
				}else {
					System.out.println("it should be leadstatus blank----failed");
				}
				weleadstatus.sendKeys("cold");
			
				By rating=By.xpath("//select[@name='rating']");
				WebElement werating=driver.findElement(rating);
				if(werating.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(werating.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualratingblank= weleadstatus.getAttribute("value");
				String expectedratingblank="";
				if(actualratingblank.equalsIgnoreCase(expectedratingblank)) {
					System.out.println("it should be rating blank----passed");
				}else {
					System.out.println("it should be rating blank----failed");
				}
				werating.sendKeys("cold");
			
			
				By street=By.xpath("//textarea[@name='lane']");
				WebElement westreet=driver.findElement(street);
				if(westreet.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(westreet.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualstreetblank= weleadstatus.getAttribute("value");
				String expectedstreetblank="";
				if(actualstreetblank.equalsIgnoreCase(expectedstreetblank)) {
					System.out.println("it should be street blank----passed");
				}else {
					System.out.println("it should be street blank----failed");
				}
				westreet.sendKeys("bhadohi Road");

				By postlecode=By.xpath("//input[@name='code']");
				WebElement wepostlecode=driver.findElement(postlecode);
				if(wepostlecode.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wepostlecode.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualpostlecodeblank= wepostlecode.getAttribute("value");
				String expectedpostlecodeblank="";
				if(actualstreetblank.equalsIgnoreCase(expectedstreetblank)) {
					System.out.println("it should be postlecode blank----passed");
				}else {
					System.out.println("it should be postlecode blank----failed");
				}
				wepostlecode.sendKeys("6548");
				
				By country=By.xpath("//input[@name='country']");
				WebElement wecountry=driver.findElement(country);
				if(wecountry.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wecountry.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualcountryblank= wecountry.getAttribute("value");
				String expectedcountryblank="";
				if(actualcountryblank.equalsIgnoreCase(expectedcountryblank)) {
					System.out.println("it should be country blank----passed");
				}else {
					System.out.println("it should be country blank----failed");
				}
				wecountry.sendKeys("u.p");
				
				By pobox=By.xpath("//input[@id='pobox']");
				WebElement wepobox=driver.findElement(pobox);
				if(wepobox.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wepobox.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualpoboxblank= wepobox.getAttribute("value");
				String expectedpoboxblank="";
				if(actualpoboxblank.equalsIgnoreCase(expectedpoboxblank)) {
					System.out.println("it should be pobox blank----passed");
				}else {
					System.out.println("it should be pobox blank----failed");
				}
				wepobox.sendKeys("abhiya");
				
				By city=By.xpath("//input[@id='city']");
				WebElement wecity=driver.findElement(city);
				if(wecity.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(wecity.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualcityblank= wecity.getAttribute("value");
				String expectedcityblank="";
				if(actualcityblank.equalsIgnoreCase(expectedcityblank)) {
					System.out.println("it should be city blank----passed");
				}else {
					System.out.println("it should be city blank----failed");
				}
				wecity.sendKeys("mumbai");
				
				By state=By.xpath("//input[@id='state']");
				WebElement westate=driver.findElement(state);
				if(westate.isDisplayed()) {
					System.out.println("input box is display-----passed");
				}
				else {
					System.out.println("input box is not display----failed");
				}if(westate.isEnabled()) {
					System.out.println("input box is enable-----passed");	 

				}else {
					System.out.println("input box is not enable----failed");
				}
				String actualstateblank= westate.getAttribute("value");
				String expectedstateblank="";
				if(actualstateblank.equalsIgnoreCase(expectedstateblank)) {
					System.out.println("it should be state blank----passed");
				}else {
					System.out.println("it should be state blank----failed");
				}
				westate.sendKeys("mumbai");
			}
			
			
			}





	


