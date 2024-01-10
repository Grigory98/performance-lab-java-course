package Task2;

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

public class Task2Test {
    static WebDriver driver;
    static Wait<WebDriver> wait;

    @BeforeAll
    static void beforeAll() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    void task2() {
        driver.get("https://www.saucedemo.com");
        LoginPage loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
        loginPage.userName.sendKeys("standard_user");
        loginPage.password.sendKeys("secret_sauce");
        loginPage.loginButton.click();

        ProductPage productPage = new ProductPage();
        PageFactory.initElements(driver, productPage);

        Assert.isTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html"), "Неверный url страницы.");
        Assert.isTrue(productPage.title.getText().contains("Products"), "Неверный заголовок страницы ProductPage");
        Assert.isTrue(productPage.burger.isDisplayed(), "Отображается бургер.");

        productPage.burger.click();
        Assert.isTrue(wait.until(l -> productPage.logout.isDisplayed()), "Отображается кнопка Logout");
        productPage.logout.click();

        Assert.isTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/"), "Неверный url страницы.");
        Assert.isTrue(loginPage.titlePage.getText().contains("Swag Labs"), "Не отображается заголовок страницы LoginPage");
    }

    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}
