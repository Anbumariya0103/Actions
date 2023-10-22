package Task16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String link="https://www.facebook.com/";
		WebDriver driver= new ChromeDriver();
		driver.get(link);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testuser@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("testuser@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Anbu@12345678");
        Select options=new Select(driver.findElement(By.id("day")));
        options.selectByValue("11");
        Select options1=new Select(driver.findElement(By.name("birthday_month")));
        options1.selectByValue("5");
        Select options2=new Select(driver.findElement(By.name("birthday_year")));
        options2.selectByVisibleText("1985");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
	}
}
