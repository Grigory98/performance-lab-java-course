package Task4;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task4Test {

    static WebDriver driver;
    static Wait<WebDriver> wait;

    @BeforeAll
    static void beforeAll() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    void checkHelloWorld() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        HelloWorldPage helloWorldPage = new HelloWorldPage();
        PageFactory.initElements(driver, helloWorldPage);

        Assert.isTrue(!helloWorldPage.helloWorldString.isDisplayed(), "Элемент с текстом Hello World не найден.");
        helloWorldPage.startButton.click();
        Assert.isTrue(wait.until(t -> helloWorldPage.helloWorldString.isDisplayed()),"Элемент с текстом не появился.");
    }

    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}
