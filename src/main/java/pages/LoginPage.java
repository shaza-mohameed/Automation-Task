import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By email = By.id("Email");
    private By password = By.id("Password");
    private By loginButton = By.xpath("//input[@value='Log in']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithRegisteredUser() {
        driver.findElement(email).sendKeys("shaza.limo@gmail.com");
        driver.findElement(password).sendKeys("password");
        driver.findElement(loginButton).click();
    }
}
