package devcloudApp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddUser {

    @Test
    public void userAdd() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Администратор\\Desktop\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://devcloud.connectedio.com/login");

        String expectedResult = "Login | Device Management Portal";

        String actualResult = driver.getTitle();


        WebElement emailButton = driver.findElement(By.xpath("//input[@placeholder='Email address']"));

        emailButton.sendKeys("prudka33+registration@gmail.com");

        WebElement passwordButton = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        passwordButton.sendKeys("Roman2008");

        WebElement  loginButton = driver.findElement(By.xpath("//button[@class='btn btn-primary text-uppercase w-100 font-weight-bold gradient-btn shadow-1 border-0']"));

        loginButton.click();

        Thread.sleep(4000);

        WebElement arrowButton = driver.findElement(By.xpath("//i[contains(@class,'fas fa-chevron-right')]"));

        arrowButton.click();

        WebElement userMenu = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));

        Thread.sleep(4000);

        userMenu.click();

        Thread.sleep(4000);

        WebElement user =  driver.findElement(By.xpath("//tr[1]//td[6]//div[1]//button[1]"));

        user.click();

        WebElement viewMenu = driver.findElement(By.xpath("//div[contains(@class,'shadow dropdown-menu show')]//a[contains(@class,'text-dark')][contains(text(),'View')]"));

        viewMenu.click();


        Thread.sleep(4000);

        WebElement editButton = driver.findElement(By.xpath("//button[contains(@class,'btn btn-light ng-star-inserted')]"));

        editButton.click();

        Select dropdownMenu = new Select(driver.findElement(By.xpath("//div[3]//div[2]//div[1]//select[1]")));

        dropdownMenu.selectByVisibleText("admin");

        WebElement updateButton = driver.findElement(By.xpath("//div[contains(@class,'footer px-4')]//button[contains(@class,'btn btn-primary ng-star-inserted')][contains(text(),'Update')]"));

        updateButton.click();





    }
}
