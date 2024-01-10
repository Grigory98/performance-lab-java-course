package Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProductPage {
    @FindBy(how = How.CSS, using = ".title")
    WebElement title;

    @FindBy(how = How.ID, using = "react-burger-menu-btn")
    WebElement burger;

    @FindBy(how = How.ID, using = "logout_sidebar_link")
    WebElement logout;

    @FindBy(how = How.CSS, using = ".inventory_list")
    WebElement itemsList;

    @FindBy(how = How.ID, using = "shopping_cart_container")
    WebElement cart;

    @FindAll({@FindBy(how = How.CSS, using = ".shopping_cart_badge")})
    List<WebElement> amountPic;

    public List<ProductItem> getListItems() {
        return itemsList.findElements(By.cssSelector(".inventory_item"))
                .stream()
                .map(ProductItem::new)
                .toList();
    }
}
