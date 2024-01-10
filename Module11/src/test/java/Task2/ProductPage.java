package Task2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage {
    @FindBy(how = How.CSS, using = ".title")
    WebElement title;

    @FindBy(how = How.ID, using = "react-burger-menu-btn")
    WebElement burger;

    @FindBy(how = How.ID, using = "logout_sidebar_link")
    WebElement logout;
}
