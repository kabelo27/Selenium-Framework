package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
	     private WebDriver driver;
	     
	     private By usernameTextBox = By.id("Email");
	     private By passwordTextBox = By.id("Password");
	     private By loginButton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

  // driver.get("https://admin-demo.nopcommerce.com/login");
   
  // String title = driver.getTitle();
   
   //System.out.println("This is the Title "+title);
   
   public Loginpage(WebDriver driver) {
	   this.driver = driver;
   }
   
   public void enterUsername (String Email) {
   driver.findElement(usernameTextBox).clear();
   driver.findElement(usernameTextBox).sendKeys("admin@yourstore.com");
   
   }
   
   public void enterPassword(String password) {
   driver.findElement(By.id("Password")).clear();
   driver.findElement(passwordTextBox).sendKeys("admin");
   }
   
   public void clickLogin() {
   driver.findElement(loginButton).click();
   }

  

}
