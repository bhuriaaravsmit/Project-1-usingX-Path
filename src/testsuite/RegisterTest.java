package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";
@Before
    public void setUp() {
        openBrowser(baseUrl);
    }
@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
   WebElement loginLink = driver.findElement(By.className("ico-register"));
    loginLink.click();

    //Find the Register Text

    WebElement registerText = driver.findElement(By.tagName("h1"));
    String text = registerText.getText();
    System.out.println(text);

    driver.findElement(By.xpath("//input[@id='gender-male']")).click();
    driver.findElement(By.xpath("//input[@id='gender-female']")).click();
//Enter the FirstName Field
    driver.findElement(By.id("FirstName")).sendKeys("Shweta1");
    //Enter the LastName Field
    driver.findElement(By.id("LastName")).sendKeys("Shah1");
    driver.findElement(By.name("DateOfBirthDay")).sendKeys("27");
    driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
    driver.findElement(By.name("DateOfBirthYear")).sendKeys("1984");
    driver.findElement(By.id("Email")).sendKeys("Shweta11.shh11@gmail.com");
//Find The password
    driver.findElement(By.name("Password")).sendKeys("Shweta12123");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("Shweta12123");
    driver.findElement(By.id("register-button")).click();
    String expectedMessage = "Your registration completed";
           ;
    String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
    Assert.assertEquals("Registration Completed", expectedMessage, actualMessage);

    }

@After
public void tearDown(){
    //closeBrowser();
}

}