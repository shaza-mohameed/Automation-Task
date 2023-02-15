import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.BookPage;
import pages.CartPage;
import pages.CheckoutPage;

public class DemoNopCommerceTest {

    WebDriver driver;
    HomePage homePage;
    RegisterPage registerPage;
    LoginPage loginPage;
    BookPage bookPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        bookPage = new BookPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @Test(priority = 1)
    public void testRegisterNewAccount() {
        homePage.navigateToRegistrationPage();
        registerPage.registerNewUser();
    }

    @Test(priority = 2)
    public void testLoginWithNewAccount() {
        homePage.navigateToLoginPage();
        loginPage.loginWithRegisteredUser();
    }

    @Test(priority = 3)
    public void testSortBooksByPriceLowToHigh() {
        homePage.navigateToBooksPage();
        bookPage.sortByPriceLowToHigh();
    }

    @Test(priority = 4)
    public void testAddSecondItemToCart() {
        bookPage.addSecondItemToCart();
    }

    @Test(priority = 5)
    public void testGoToYourCart() {
        bookPage.addToCartByIndex();
        cartPage.verifyCartItems();
    }

    @Test(priority = 6)
    public void testCheckoutOrder() {
        cartPage.checkout();
        checkoutPage.enterBillingInformation();
        checkoutPage.selectShippingMethod();
        checkoutPage.enterShippingInformation();
        checkoutPage.choosePaymentMethod();
        checkoutPage.enterPaymentInformation();
        checkoutPage.confirmOrder();
    }

}
