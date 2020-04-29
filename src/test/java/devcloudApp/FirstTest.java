package devcloudApp;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstTest {

    @Test
    public void testFirst() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Администратор\\Desktop\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://devcloud.connectedio.com/login");

        String expectedResult = "Login | Device Management Portal";

        String actualResult = driver.getTitle();

        WebElement registerButton = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));

        registerButton.click();


        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First name']"));

        firstNameField.sendKeys("Vika");


        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last name']"));

        lastNameField.sendKeys("Stem");

        Thread.sleep(5000);


        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email address']"));

        emailField.sendKeys("prudka33+registration@gmail.com");

        WebElement cellPhoneField = driver.findElement(By.xpath("//input[@placeholder='Phone']"));

        cellPhoneField.sendKeys("9175678990");

        WebElement companyNameButtonButton = driver.findElement(By.xpath("//input[@placeholder='Company name']"));

        companyNameButtonButton.sendKeys("Aple");

        WebElement passwordButton = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        passwordButton.sendKeys("Roman2008");

        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@placeholder='Confirm password']"));

        confirmPasswordField.sendKeys("Roman2008");

        Thread.sleep(5000);

       // driver.switchTo().frame(driver.findElement(By.xpath("iframe[name=\"a-ujluoz9imv17\"]")));

//        WebElement captchaButton = driver.findElement(By.cssSelector("#recaptcha-anchor"));
//
//        captchaButton.click();

//        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//        String winHanaleBefore = driver.getWindowHandle();
//        driver.switchTo().frame(0);
//        driver.findElement(By.id("recaptcha-anchor")).click();
//        driver.switchTo().window(winHanaleBefore);

//        WebElement agreeButton = driver.findElement(By.xpath("//label[@class='custom-control-label::after']"));
//
//        agreeButton.submit();


       WebElement agreeButton = driver.findElement(By.xpath("//label[@class='custom-control-label']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", agreeButton);

        WebElement registrationButton = driver.findElement(By.xpath("//button[@class='btn btn-primary text-uppercase w-100 font-weight-bold gradient-btn shadow-1 border-0']"));
        registrationButton.click();

        Thread.sleep(4000);

//        WebElement errorCaptcha = driver.findElement(By.xpath("//div[@class='invalid-feedback-custom']"));
//        errorCaptcha.getText();
//        System.out.println(errorCaptcha);
//        Assert.assertEquals("Captcha required.", errorCaptcha);











    }
}
