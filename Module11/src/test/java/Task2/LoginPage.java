package Task2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.CSS, using = ".login_logo")
    WebElement titlePage;

    @FindBy(how = How.ID, using = "user-name")
    WebElement userName;

    @FindBy(how = How.ID, using = "password")
    WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    WebElement loginButton;
}
