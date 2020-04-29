package devcloudApp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VerifyPageTest {


    @Test
    public void testVerifyPage() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Администратор\\Desktop\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://devcloud.connectedio.com/login");

        String expectedResult = "Login | Device Management Portal";

        String actualResult = driver.getTitle();


        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email address']"));

        emailField.sendKeys("prudka33+registration@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        passwordField.sendKeys("Roman2008");

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-primary text-uppercase w-100 font-weight-bold gradient-btn shadow-1 border-0']"));

        loginButton.click();

        WebElement devicesMenuButton = driver.findElement(By.xpath("//span[contains(text(),'Devices')]"));

        devicesMenuButton.click();

        WebElement usersMenuButton = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));

        usersMenuButton.click();

        List<WebElement> dropMenuButton = driver.findElements(By.cssSelector(".has-arrow.ng-star-inserted"));

        dropMenuButton.get(0).click();

        WebElement modemButton = driver.findElement(By.xpath("//a[contains(text(),'Modem Firmware')]"));

        modemButton.click();

        WebElement routerButton = driver.findElement(By.xpath("//a[contains(text(),'Router Firmware')]"));

        routerButton.click();

        dropMenuButton.get(1).click();

        WebElement jasperButton = driver.findElement(By.xpath("//a[contains(text(),'Jasper')]"));

        jasperButton.click();

        WebElement vpnButton = driver.findElement(By.xpath("//a[contains(text(),'VPN')]"));

        vpnButton.click();

        WebElement containerButton = driver.findElement(By.xpath("//a[contains(text(),'Container')]"));

        containerButton.click();

        dropMenuButton.get(2).click();

        WebElement deviceButton = driver.findElement(By.xpath("//li[@class='ng-star-inserted']//a[contains(text(),'Device')]"));

        deviceButton.click();

        WebElement portalButton = driver.findElement(By.xpath("//a[contains(text(),'Portal')]"));

        portalButton.click();

        WebElement alertsButton = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));

        alertsButton.click();

        driver.quit();








    }
}
