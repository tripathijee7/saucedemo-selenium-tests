import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrugalTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String PageTitle = driver.getTitle();
		String ExpectedTitle = "Swag Labs";
		//verification
		if(PageTitle.equals(ExpectedTitle)) {
			System.out.println("Page title is verified");
		}
		else {
			System.out.println("Page title is not verified");
		}
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//add to cart third product
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		//cart icon button
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		//verify product
		WebElement cartproduct =driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		if(cartproduct !=null && cartproduct.isDisplayed()) {
			System.out.println("product is successfully added");
		}
		else {
			System.out.println("product is not in the cart");
		}
		//check out
		driver.findElement(By.id("checkout")).click();
		
		//checkout info form
		driver.findElement(By.id("first-name")).sendKeys("Test");
		driver.findElement(By.id("last-name")).sendKeys("User");
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		//continue
		driver.findElement(By.id("continue")).click();
		//finish
		driver.findElement(By.id("finish")).click();	
		//thankyou message
		WebElement Message = driver.findElement(By.className("complete-header"));
		String ExpectedMessage = "Thank you for your order";
		if(Message!=null && Message.getText().equals(ExpectedMessage)) {
			System.out.print("Thank you for your order: appear");
		}
		else {
			System.out.println("Thank you for your order: not appear");
		}
		

	}

}
