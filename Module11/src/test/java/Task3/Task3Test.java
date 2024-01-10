package Task3;

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
import java.util.List;
import java.util.Random;

public class Task3Test {
    static WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    void task3() {
        driver.get("https://www.saucedemo.com");
        LoginPage loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
        loginPage.userName.sendKeys("standard_user");
        loginPage.password.sendKeys("secret_sauce");
        loginPage.loginButton.click();

        ProductPage productPage = new ProductPage();
        PageFactory.initElements(driver, productPage);

        Assert.isTrue(productPage.amountPic.isEmpty(), "Значек на кнопке 'корзины' отсутствует");
        List<ProductItem> productItems = productPage.getListItems();

        final Random random = new Random();
        final int count = random.nextInt(1, productItems.size());
        for(int i = 0; i < count; i++) {
            productItems.get(i).getAddButton().click();
        }
        Assert.isTrue(!productPage.amountPic.isEmpty(), "Значек на кнопке 'корзины' присутствует");
        Assert.isTrue(
                count == Integer.parseInt(productPage.amountPic.get(0).getText()),
                "Количество добавленных товаров соответствует количеству в корзине"
        );
        productPage.cart.click();

        CartPage cartPage = new CartPage();
        PageFactory.initElements(driver, cartPage);
        Assert.isTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/cart.html"), "Неверный url страницы.");
        Assert.isTrue(cartPage.title.getText().contains("Your Cart"), "Неверный заголовок страницы.");
        List<CartItem> cartItems = cartPage.getCartItems();

        for(int i = 0; i < cartItems.size(); i++ ) {
            Assert.isTrue(cartItems.get(i).getName().contains(productItems.get(i).getName()), "Не совпадают имена товаров");
            Assert.isTrue(cartItems.get(i).getDescription().contains(productItems.get(i).getDescription()), "Не совпадают описания товаров");
            Assert.isTrue(cartItems.get(i).getPrice().equals(productItems.get(i).getPrice()), "Не совпадают цены товаров");
        }
    }

    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}
