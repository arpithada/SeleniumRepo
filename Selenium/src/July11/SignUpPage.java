package July11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vineet Hada\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		// launch FB
		driver.get("https://www.facebook.com/");
		
		// Maximize browser
		driver.manage().window().maximize();
		
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
		
		WebElement dayOfBirth = driver.findElement(By.id("day"));
		Select dayDrop = new Select(dayOfBirth);
		dayDrop.selectByValue("18");
		
		WebElement monthOfBirth = driver.findElement(By.name("birthday_month"));
		Select monthDrop = new Select(monthOfBirth);
		monthDrop.selectByIndex(8);
		
		WebElement yearOfBirth = driver.findElement(By.id("year"));
		Select yearDrop = new Select(yearOfBirth);
		yearDrop.selectByVisibleText("1990");
		
		WebElement gender = driver.findElement(By.id("u_0_7"));
		gender.click();
		
		WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
		
	}
	
	public void dropDwonSelection(WebElement element, String visibleTextValue)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleTextValue);
	}

}
