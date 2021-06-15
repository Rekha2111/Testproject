package Automate;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class YourLogoForTestNG{
	WebDriver driver;
	@Test()
    public void a_OpenPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\salenium\\chromedriver_win91\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
    @Test()
	public void b_Login() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("rekha56@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
	}
    @Test()
	public void c_PersonalInfo() throws InterruptedException {
		WebElement radio1 = driver.findElement(By.id("id_gender2"));
		radio1.click();
		Thread.sleep(5000);
		driver.findElement(By.id("customer_firstname")).sendKeys("Sujan");
		driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
		Thread.sleep(5000);
		driver.findElement(By.id("passwd")).sendKeys("Rekha1234");
		driver.findElement(By.id("days")).click();
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByVisibleText("1  ");
		driver.findElement(By.id("days")).click();
		driver.findElement(By.id("months")).click();
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByVisibleText("June ");
		driver.findElement(By.id("months")).click();
		driver.findElement(By.id("years")).click();
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByVisibleText("1988  ");
		driver.findElement(By.id("years")).click();
	}
        @Test()
	public void d_AddresInfo() {
		driver.findElement(By.id("firstname")).sendKeys("Sujan");
		driver.findElement(By.id("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("company")).sendKeys("QSpiders");
		driver.findElement(By.id("address1")).sendKeys("Chromepet");
		driver.findElement(By.id("address2")).sendKeys("Chennai");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("id_state")).click();
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Florida");
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.id("postcode")).sendKeys("32003");
		driver.findElement(By.id("other")).sendKeys("QA Testing Information");
		driver.findElement(By.id("phone_mobile")).sendKeys("8484848584");
		driver.findElement(By.id("alias")).sendKeys("Address-1");
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	}
        @Test()
	public void e_Shopping() throws InterruptedException {
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='List']")).click();
		driver.findElement(By.xpath("//span[text()='More']")).click();
		driver.findElement(By.xpath("//input[@id='quantity_wanted']/following::i[2]")).click();
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByVisibleText("S");
		driver.findElement(By.id("color_13")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Proceed ')]")).click();
		Thread.sleep(3000);
	
	}   
        @Test()
        public void f_Signout() 
        {
		driver.findElement(By.linkText("Sign out")).click();
	}
}
