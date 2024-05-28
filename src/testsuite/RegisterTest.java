package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Click on register
        driver.findElement(By.linkText("Register")).click();

        //Verify the text Register
        String expectedText = "Register";
        WebElement welcomeText = driver.findElement(By.linkText("Register"));
        String actualText = welcomeText.getText();
        Assert.assertEquals("Not expected text", expectedText, actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //Click on the register link
        driver.findElement(By.linkText("Register")).click();
        //select gender radio button
        driver.findElement(By.id("gender-male")).click();
        //Enter first name
        driver.findElement(By.name("FirstName")).sendKeys("Varsh");
        //Enter last name
        driver.findElement(By.name("LastName")).sendKeys("Param");
        //Select date of Birth
        //Day
        //select day
        WebElement dropdownForDay = driver.findElement(By.name("DateOfBirthDay"));
        Select dropdownDay = new Select(dropdownForDay);
        dropdownDay.selectByValue("22");
        //select Month
        WebElement dropdownForMonth = driver.findElement(By.name("DateOfBirthMonth"));
        Select dropdownMonth = new Select(dropdownForMonth);
        dropdownMonth.selectByValue("10");
        //select year
        WebElement dropdownForYear = driver.findElement(By.name("DateOfBirthYear"));
        Select dropdownYear= new Select(dropdownForYear);
        dropdownYear.selectByValue("2010");
        //Enter Email
        driver.findElement(By.id("Email")).sendKeys("prime1@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("Prime123");
        //Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Prime123");
        //Click on register button
        driver.findElement(By.id("register-button")).click();

        //Verify the text 'Your registration is completed'
        String expectedText="Your registration completed";
        WebElement welcomeText=driver.findElement(By.xpath("//div[@class='result']"));
        String actualText= welcomeText.getText();
        Assert.assertEquals("Not expected text", expectedText, actualText);

    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
