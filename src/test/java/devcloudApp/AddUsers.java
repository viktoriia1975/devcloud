package devcloudApp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddUsers {

    @Test
    public void usersAdd() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Администратор\\Desktop\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://devcloud.connectedio.com/login");

        String expectedResult = "Login | Device Management Portal";

        String actualResult = driver.getTitle();


        WebElement emailButton = driver.findElement(By.xpath("//input[@placeholder='Email address']"));

        emailButton.sendKeys("prudka33+registration@gmail.com");

        WebElement passwordButton = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        passwordButton.sendKeys("Roman2008");

        WebElement  loginButton = driver.findElement(By.xpath("//button[@class='btn btn-primary text-uppercase w-100 font-weight-bold gradient-btn shadow-1 border-0']"));

        loginButton.click();

        WebElement userMenu = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));

        userMenu.click();

        WebElement quickActionButton = driver.findElement(By.xpath("//span[contains(text(),'Quick actions')]"));

        quickActionButton.click();

        WebElement addMenu = driver.findElement(By.xpath("//a[contains(text(),'Add')]"));

        addMenu.click();

        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

        firstNameField.sendKeys("Roman");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

        lastName.sendKeys("Ivanov");

        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));

        emailField.sendKeys("vikauser3@mailinator.com");

        WebElement telephoneField = driver.findElement(By.xpath("//input[@placeholder='Telephone']"));

        telephoneField.sendKeys("7895678956");

        Select selectRole = new Select(driver.findElement(By.xpath("//select[@id='role']")));

        selectRole.selectByVisibleText("user");

        WebElement addressLine1Field = driver.findElement(By.xpath("//input[@placeholder='Address Line 1']"));

        addressLine1Field.sendKeys("1933, 84 street");

        WebElement cityField = driver.findElement(By.xpath("//input[@placeholder='City']"));

        cityField.sendKeys("Brooklyn");

        WebElement zipField = driver.findElement(By.xpath("//input[@placeholder='Zip Code']"));

        zipField.sendKeys("11214");

        Select countryMenu = new Select(driver.findElement(By.cssSelector("select[formcontrolname=\"country\"]")));

        countryMenu.selectByVisibleText("United States");

        Select stateMenu = new Select(driver.findElement(By.cssSelector("select[formcontrolname=\"state\"]")));

        stateMenu.selectByVisibleText("New York");

        WebElement addButton = driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary px-4 py-2 text-uppercase']"));

        addButton.click();















    }
}




