package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationCode {

	WebDriver driver = null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		System.out.println("Inside: User is on login page");
	}

	@When("^user enters ([^\"]*) and ([^\"]*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		System.out.println("Inside: User enters" + username + password);
		
	}

	@And("clicks on login page")
	public void clicks_on_login_page() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		System.out.println("Inside: Clicks on login page");
	}

	@Then("^user is navigated to the home page ([^\\\"]*)$")
	public void user_is_navigated_to_the_home_page(String country) throws InterruptedException {
		//select country india from drop down
		Select dropdown = new Select(driver.findElement(By.id("country")));
		dropdown.selectByVisibleText(country);
		System.out.println(country);
		Thread.sleep(2000);
		
		driver.findElement(By.id("logout")).click();
		driver.quit();
		System.out.println("Inside: User is navigated to the home page");
	}

}
