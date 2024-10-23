package steps;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefination {
        WebDriver driver;
	
	@Given("User starts {string} browser")
	public void user_starts_browser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	}
	@Given("User Launches app using url {string}")
	public void user_launches_app_using_url(String url) {
	    driver.get(url);
	}
	@When("user clicks in link using the xpath {string}")
	public void user_clicks_in_link_using_the_xpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	@When("user enters the text {string} in the textbox using xpath {string}")
	public void user_enters_the_text_in_the_textbox_using_xpath(String text, String xpath) {
	  driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	@When("user enters the password  {string} in the textbox using the xpath {string}")
	public void user_enters_the_password_in_the_textbox_using_the_xpath(String password, String xpath) {
	   driver.findElement(By.xpath(xpath)).sendKeys(password);
	}

	@When("user reenters the password  {string} in the textbox using xpath {string}")
	public void user_reenters_the_password_in_the_textbox_using_xpath(String repassword, String xpath) {
	    driver.findElement(By.xpath(xpath)).sendKeys(repassword);
	}

	@When("user enters the fullname {string} in the textbox using xpath {string}")
	public void user_enters_the_fullname_in_the_textbox_using_xpath(String fullname, String xpath) {
	  driver.findElement(By.xpath(xpath)).sendKeys(fullname);
	  
	}

	@When("user enters the email {string} in the textbox using xpath {string}")
	public void user_enters_the_email_in_the_textbox_using_xpath(String email, String xpath) {
	    driver.findElement(By.xpath(xpath)).sendKeys(email);
	}

	@When("user enters the captcha {string} in the textbox using xpath {string}")
	public void user_enters_the_captcha_in_the_textbox_using_xpath(String captcha, String xpath) {
	    driver.findElement(By.xpath(xpath)).sendKeys(captcha);
	}


	@When("user enters the following details  in registration form from Map")
	public void user_enters_the_following_details_in_registration_form_from_map(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>>  allData= dataTable.asMaps();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(allData.get(0).get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(allData.get(0).get("password"));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(allData.get(0).get("re-password"));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(allData.get(0).get("fullname"));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(allData.get(0).get("email id"));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(allData.get(0).get("captcha"));
		
	}






}
