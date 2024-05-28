package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on computers
        driver.findElement(By.linkText("Computers")).click();

        //verify the text
        String expectedText = "Computers";
        WebElement welcomeElement = driver.findElement(By.linkText("Computers"));
        String actualText = welcomeElement.getText();
        Assert.assertEquals("Not text computers", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on Electronics
        driver.findElement(By.linkText("Electronics")).click();

        //verify the text
        String expectedText = "Electronics";
        WebElement welcomeElement = driver.findElement(By.linkText("Electronics"));
        String actualText = welcomeElement.getText();
        Assert.assertEquals("Not  expected text ", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on Link
        driver.findElement(By.linkText("Apparel")).click();

        //verify the text
        String expectedText = "Apparel";
        WebElement welcomeElement = driver.findElement(By.linkText("Apparel"));
        String actualText = welcomeElement.getText();
        Assert.assertEquals("Not  expected text ", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadslPageSuccessfully() {
        //click on Link
        driver.findElement(By.linkText("Digital downloads")).click();

        //verify the text
        String expectedText = "Digital downloads";
        WebElement welcomeElement = driver.findElement(By.linkText("Digital downloads"));
        String actualText = welcomeElement.getText();
        Assert.assertEquals("Not  expected text ", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBookslPageSuccessfully() {
        //click on Link
        driver.findElement(By.linkText("Books")).click();

        //verify the text
        String expectedText = "Books";
        WebElement welcomeElement = driver.findElement(By.linkText("Books"));
        String actualText = welcomeElement.getText();
        Assert.assertEquals("Not  expected text ", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToJwellerylPageSuccessfully() {
        //click on Link
        driver.findElement(By.linkText("Jewelry")).click();

        //verify the text
        String expectedText = "Jewelry";
        WebElement welcomeElement = driver.findElement(By.linkText("Jewelry"));
        String actualText = welcomeElement.getText();
        Assert.assertEquals("Not  expected text ", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardslPageSuccessfully() {
        //click on Link
        driver.findElement(By.linkText("Gift Cards")).click();

        //verify the text
        String expectedText = "Gift Cards";
        WebElement welcomeElement = driver.findElement(By.linkText("Gift Cards"));
        String actualText = welcomeElement.getText();
        Assert.assertEquals("Not  expected text ", expectedText, actualText);
    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
