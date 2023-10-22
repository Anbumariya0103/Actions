package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquery {

	public static void main(String[] args) throws InterruptedException {
		String link="https://jqueryui.com/droppable//";
		WebDriver driver= new ChromeDriver();
		driver.get(link);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement source =driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination =driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, destination).perform();
		System.out.println(destination.getCssValue("background"));

	}
}
