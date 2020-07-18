package July11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vineet Hada\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Arpit");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Hada");
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("arpithadaarpit");
		
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("Selenium@2020");
		
		WebElement confirmPwd = driver.findElement(By.name("ConfirmPasswd"));
		confirmPwd.sendKeys("Selenium@2020");
		
		WebElement next = driver.findElement(By.cssSelector("span.CwaK9"));
		next.click();
		
		
	}
	

}
