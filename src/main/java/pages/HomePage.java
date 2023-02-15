import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By registerLink = By.linkText("Register");
    private By loginLink = By.linkText("Log in");
    private By booksLink = By.linkText("Books");
    private By cartLink = By.cssSelector(".cart-label");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRegistrationPage() {
        driver.findElement(registerLink).click();
    }

    public void navigateToLoginPage() {
        driver.findElement(loginLink).click();
    }

    public void navigateToBooksPage() {
        driver.findElement(booksLink).click();
    }

    public void navigateToCartPage() {
        driver.findElement(cartLink).click();
    }
}
