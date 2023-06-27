package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
@Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {


        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify the text 'Computers'", expectedText, actualText);



    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).click();
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify the text 'Electronics'", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Apparel ']")).click();
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify the text 'Apparel'", expectedText, actualText);


    }

    @Test

    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Digital downloads ']")).click();
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify the text 'Digital downloads'", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Books ']")).click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify the text 'Books'", expectedText, actualText);
    }
    @Test

    public void userShouldNavigateToBooksJewelryPageSuccessfully() {

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Jewelry ']")).click();
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify the text 'Jewelry'", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftsCardsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Gift Cards ']")).click();
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify the text 'Gift Cards'", expectedText, actualText);


    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}