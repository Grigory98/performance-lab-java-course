package Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CartPage {
    @FindBy(how = How.CSS, using = ".title")
    WebElement title;

    @FindBy(how = How.CSS, using = ".cart_list")
    WebElement cartList;

    public List<CartItem> getCartItems() {
        return cartList.findElements(By.cssSelector(".cart_item"))
                .stream()
                .map(i -> new CartItem(i))
                .toList();
    }
}
