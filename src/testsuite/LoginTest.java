package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    /**1. Create the package ‘browserfactory’ and create the
     class with the name ‘BaseTest’ inside the
     ‘browserfactory’ package. And write the browser setup
     code inside the class ‘Base Test’.
     2. Create the package ‘testsuite’ and create the
     following classes inside the ‘testsuite’ package.

     1. LoginTest
     2. TopMenuTest
     3. RegisterTest

     3. Write down the following test into ‘LoginTest’ class
     *
     */

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //find the login link/element and click on login link element
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("Not redirected to login", expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //enter email
        driver.findElement(By.id("Email")).sendKeys("prime1@gmail.com");

        //enter password
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        //find login button and click
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();


        //Locate logout text verify 'log out' text is displayed
         WebElement logOut = driver.findElement(By.xpath("//a[text()='Log out']"));

    }

    @Test
    public void verifyErrorMsgWithInvalidCreditials() {
        //Find the login link and click on login link element
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //Find the Email field element and Type the Email address to email field
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("prime123@gmail.com");

        //Find the password field and type the password into password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        //Find login button and click
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();

        //store the expected result and
        String expectedErrorMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("error msg not displayed", expectedErrorMsg, actualErrorMsg);

    }
    @After
    public void tearDown() {
        //closeBrowser();
    }
}
