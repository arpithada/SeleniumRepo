package July16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JUnitSignUp {
	static ChromeDriver driver;
	public static void DropDown(String id, WebElement element, String value) {
		element = driver.findElement(By.id(id));
		Select drop = new Select(element);
		if (id == "day") {
			drop.selectByValue(value);
		} else if (id == "month") {
			drop.selectByIndex(8);
		} else if (id == "year") {
			drop.selectByVisibleText("1990");
		}
	}
	@Before
	public void PreMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vineet Hada\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void DoThis() {
		WebElement firstName = driver.findElement(By.id("u_0_m"));
		firstName.sendKeys("Arpit");

		WebElement lastName = driver.findElement(By.cssSelector("input#u_0_o"));
		lastName.sendKeys("Hada");

		WebElement email = driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']"));
		email.sendKeys("arpithada@gmail.com");

		WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmEmail.sendKeys("arpithada@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
		password.sendKeys("Selenium@2020");

		WebElement dayOfBirth = null;
		WebElement monthOfBirth = null;
		WebElement yearOfBirth = null;

		JUnitSignUp.DropDown("day", dayOfBirth, "25");
		JUnitSignUp.DropDown("month", monthOfBirth, "8");
		JUnitSignUp.DropDown("year", yearOfBirth, "1990");

		WebElement gender = driver.findElement(By.id("u_0_7"));
		gender.click();

		WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
	}
	@After
	public void Finish() {
		driver.close();
	}

}
