package org.adactstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AdactinTest {
	
	WebDriver driver;
	
	@Given("user is on the adactin page")
	public void user_is_on_the_adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	    
	}
	@When("user should enter {string},{string}")
	public void user_should_enter(String username, String password) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(username);
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys(password);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		
	
	   
	}
	@When("after successfull login user should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void after_successfull_login_user_should_enter(String location, String hotelname, String roomtype, String roomnumber, String checkin, String checkout, String adultroom, String childroom) {
	WebElement loc = driver.findElement(By.id("location"));	
	loc.sendKeys(location);
	WebElement hote = driver.findElement(By.id("hotels"));
	hote.sendKeys(hotelname);
	
	WebElement rmty = driver.findElement(By.id("room_type"));
	rmty.sendKeys(roomtype);
	
	WebElement rmno = driver.findElement(By.id("room_nos"));
	rmno.sendKeys(roomnumber);
	
	
	WebElement dtp = driver.findElement(By.id("datepick_in"));
	dtp.sendKeys(checkin);
	
	WebElement dto = driver.findElement(By.id("datepick_out"));
	dto.sendKeys(checkout);
	
	WebElement adtr = driver.findElement(By.id("adult_room"));
	adtr.sendKeys(adultroom);
	
	
	WebElement cldr = driver.findElement(By.id("child_room"));
	cldr.sendKeys(childroom);
	
	
	WebElement sub= driver.findElement(By.id("Submit"));
	sub.click();
	
	WebElement radio = driver.findElement(By.id("radiobutton_1"));
	radio.click();
	
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	
	    
	}

	@When("after fillingup the itenary details user should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void after_fillingup_the_itenary_details_user_should_enter(String firstname, String lastname, String address, String creditcardnumber, String creditcardtype, String expirymonth, String expiryyear, String cvvnumber) throws InterruptedException {
		 WebElement fsn = driver.findElement(By.id("first_name"));
		    fsn.sendKeys(firstname);
		    WebElement lsn = driver.findElement(By.id("last_name"));
		    lsn.sendKeys(lastname);
		    WebElement add = driver.findElement(By.id("address"));
		    add.sendKeys(address);
		    WebElement cnum = driver.findElement(By.id("cc_num"));
		    cnum.sendKeys(creditcardnumber);
		    WebElement ccty = driver.findElement(By.id("cc_type"));
		    ccty.sendKeys(creditcardtype);
		    WebElement ccmn = driver.findElement(By.id("cc_exp_month"));
		    ccmn.sendKeys(expirymonth);
		    WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		    expyr.sendKeys(expiryyear);
		    WebElement cv = driver.findElement(By.id("cc_cvv"));
		    cv.sendKeys(cvvnumber);
		    WebElement bk = driver.findElement(By.id("book_now"));
		    bk.click();
		    Thread.sleep(5000);
		    WebElement print = driver.findElement(By.id("order_no"));
		    String attribute = print.getAttribute("value");
		    System.out.println(attribute);
	}

	@SuppressWarnings("deprecation")
	@Then("user should verify the successful message")
	public void user_should_verify_the_successful_message() {
		Assert.assertTrue(true);
		driver.quit();
	}





}

	