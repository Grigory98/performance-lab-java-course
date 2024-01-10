package Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

public class CartItem {
    private WebElement element;

    private String name;

    private String description;

    private BigDecimal price;

    public String getName() {
        return element.findElement(By.cssSelector(".inventory_item_name")).getText();
    }

    public String getDescription() {
        return element.findElement(By.cssSelector(".inventory_item_desc")).getText();
    }

    public BigDecimal getPrice(WebElement element) {
        return BigDecimal.valueOf(
                Double.parseDouble(element.getText().replace("$", ""))
        );
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CartItem(WebElement element) {
        this.element = element;
        this.name = element.findElement(By.cssSelector(".inventory_item_name")).getText();
        this.description = element.findElement(By.cssSelector(".inventory_item_desc")).getText();
        this.price = getPrice(element.findElement(By.cssSelector(".inventory_item_price")));
    }
}
