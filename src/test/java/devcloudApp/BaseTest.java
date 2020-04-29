package devcloudApp;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;

    protected static User user;

    protected static User2 user2;

    @BeforeClass
    public static void setUp () {

        System.out.println("Start our test");

        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Администратор\\Desktop\\driver\\chromedriver.exe");

         driver = new ChromeDriver();

         user = new User("vika!.gmail.com", "Roman2008");

         user2 = new User2("prudka33@gmail.com", "Roma");

         driver.get("https://devcloud.connectedio.com/login");

         String expectedResult = "Login | Device Management Portal";

         String actualResult = driver.getTitle();

        Assert.assertEquals(expectedResult, actualResult);

    }

//    @AfterClass
//    public static void tearDown() {
//
//        System.out.println("Finish our test");
//
//        driver.quit();
//    }
}
