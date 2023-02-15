import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookPage {
    private WebDriver driver;

    private By sortByDropDown = By.id("products-orderby");
    private By addToCartButtons = By.xpath("//div[@class='item-box']//input[@value='Add to cart']");

    public BookPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sortByPriceLowToHigh() {
        Select sortBy = new Select(driver.findElement(sortByDropDown));
        sortBy.selectByValue("Price:LowToHigh");
    }

    public void addToCartByIndex(int index) {
        driver.findElements(addToCartButtons).get(index).click();
    }
}
