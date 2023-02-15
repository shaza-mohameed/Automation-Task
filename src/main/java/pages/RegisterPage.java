import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    private By genderMale = By.id("gender-male");
    private By genderFemale = By.id("gender-female");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By email = By.id("Email");
    private By password = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerNewUser() {
        driver.findElement(genderMale).click();
        driver.findElement(firstName).sendKeys("Shaza");
        driver.findElement(lastName).sendKeys("Mohamed");
        driver.findElement(email).sendKeys("shaza.limo@gmail.com");
        driver.findElement(password).sendKeys("password");
        driver.findElement(confirmPassword).sendKeys("password");
        driver.findElement(registerButton).click();
    }
}
