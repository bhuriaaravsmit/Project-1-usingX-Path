package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest  {

    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setup()
    {
        openBrowser(baseUrl);
    }

    @Test

    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
    }

    public void verifyUserShouldLoginSuccessfullyWithValidCredentials(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

               //Find the Email Field Enter Email address
        driver.findElement(By.id("Email")).sendKeys("Shweta123@gmail.com");
        //Find the password Field and Enter the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        //Click on Login Button
        //driver.findElement(By.linkText("Log in")).click();

    }
@Test
    public void verifyTheErrorMessage(){
        // Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the Email Field Enter Email address
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        //Find the password Field and Enter the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        //Click on Login Button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);


    }
@After
    public void tearDown(){
        closeBrowser();
}
}
