package Task4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HelloWorldPage {
    @FindBy(how = How.CSS, using = "div#start button")
    WebElement startButton;

    @FindBy(how = How.CSS, using = "#finish h4")
    WebElement helloWorldString;
}
