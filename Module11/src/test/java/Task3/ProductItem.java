package Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

public class ProductItem {
    private final WebElement element;

    private final String name;

    private final String description;

    private BigDecimal price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public WebElement getAddButton() {
        return element.findElement(By.cssSelector(".btn_inventory"));
    }

    public BigDecimal getPrice(WebElement price) {
        return BigDecimal.valueOf(
                Double.parseDouble(price.getText().replace("$", ""))
        );
    }

    public ProductItem(WebElement element) {
        this.element = element;
        this.name = element.findElement(By.cssSelector(".inventory_item_name")).getText();
        this.description = element.findElement(By.cssSelector(".inventory_item_desc")).getText();
        this.price = getPrice(element.findElement(By.cssSelector(".inventory_item_price")));
    }
}
