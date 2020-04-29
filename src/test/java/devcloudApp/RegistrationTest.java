package devcloudApp;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegistrationTest extends BaseTest {

    @Test
    public void testRegistration() {

        HomePage homePage = new HomePage(driver);

//        homePage.inputEmailAddress(user.getEmail());
//        homePage.inputPasswordField(user.getPassword());

        homePage.inputEmailAddress(user2.getEmail());
        homePage.inputPasswordField(user2.getPassword());

        homePage.clickLogInButton();

//        String errorEmail = homePage.getErrorEmailField();
//        System.out.println(errorEmail);
//        Assert.assertEquals("Email must be a valid email address", errorEmail);

//        String errorPassword = homePage.getErrorPasswordField();
//        System.out.println(errorPassword);
//
//        Assert.assertEquals("Invalid Login or Password", errorPassword);

        String invalidPassword = homePage.getInvalidPasswordField();
        System.out.println(invalidPassword);
        Assert.assertEquals("Password must be at least 6 characters", invalidPassword);
    }


    }
