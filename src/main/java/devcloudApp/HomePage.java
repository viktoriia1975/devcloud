package devcloudApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".form-control.ng-untouched.ng-pristine.ng-invalid" )
    private List<WebElement> emailAddressField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordField;

    @FindBy(css = ".btn.btn-primary.text-uppercase.w-100.font-weight-bold.gradient-btn.shadow-1.border-0")
    private WebElement logInButton;

    @FindBy(xpath = "//div[contains(text(),'Email must be a valid email address')]")
    private List<WebElement> errorEmailField;

    @FindBy(css = "div[role=\"alert\"]")
    private WebElement errorPasswordField;


    @FindBy(xpath = "//div[contains(text(),'Password must be at least 6 characters')]")
    private WebElement invalidPasswordField;



    public void inputEmailAddress(String email) {

        wait.until(ExpectedConditions.elementToBeClickable(emailAddressField.get(0)));
        emailAddressField.get(0).sendKeys(email);
    }

    public void inputPasswordField(String password) {

        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
    }

    public void clickLogInButton() {

        wait.until(ExpectedConditions.elementToBeClickable(logInButton));
        logInButton.click();
    }

    public String getErrorEmailField () {

        return errorEmailField.get(0).getText();
    }

    public String getErrorPasswordField () {

        wait.until(ExpectedConditions.elementToBeClickable(errorPasswordField));

        return errorPasswordField.getText();
    }

    public String getInvalidPasswordField() {

        wait.until(ExpectedConditions.elementToBeClickable(invalidPasswordField));

        return invalidPasswordField.getText();
    }


}
