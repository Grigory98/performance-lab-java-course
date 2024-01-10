package Task1;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Task1Test {

    static WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void task1() {
        driver.get("https://www.saucedemo.com");
        LoginPage loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
        String text = loginPage.titlePage.getText();
        Assert.isTrue(text.contains("Swag Labs"), "Неверный заголовок.");
    }

    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}
