
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
    private WebDriver driver;

    private By billingAddressFirstName = By.id("BillingNewAddress_FirstName");
    private By billingAddressLastName = By.id("BillingNewAddress_LastName");
    private By billingAddressEmail = By.id("BillingNewAddress_Email");
    private By billingAddressCountryDropDown = By.id("BillingNewAddress_CountryId");
    private By billingAddressCity = By.id("BillingNewAddress_City");
    private By billingAddressAddress1 = By.id("BillingNewAddress_Address1");
    private By billingAddressZipCode = By.id("BillingNewAddress_ZipPostalCode");
    private By billingAddressPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By billingAddressContinueButton = By.xpath("//input[@value='Continue']");

    private By shippingAddressContinueButton = By.xpath("//div[@id='shipping-buttons-container']//input[@value='Continue']");

    private By shippingMethodContinueButton = By.xpath("//div[@id='shipping-method-buttons-container']//input[@value='Continue']");

    private By paymentMethodRadioButton = By.id("paymentmethod_1");
    private By paymentMethodContinueButton = By.xpath("//div[@id='payment-method-buttons-container']//input[@value='Continue']");

    private By paymentInformationContinueButton = By.xpath("//div[@id='payment-info-buttons-container']//input[@value='Continue']");

    private By confirmOrderButton = By.xpath("//input[@value='Confirm']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterBillingInformation() {
        driver.findElement(billingAddressFirstName).sendKeys("Shaza");
        driver.findElement(billingAddressLastName).sendKeys("Mohamed");
        driver.findElement(billingAddressEmail).sendKeys("shaza.limo@gmail.com");
        Select billingAddressCountry = new Select(driver.findElement(billingAddressCountryDropDown));
        billingAddressCountry.selectByVisibleText("Egypt");
        driver.findElement(billingAddressCity).sendKeys("Cairo");
        driver.findElement(billingAddressAddress1).sendKeys("123 Main Street");
        driver.findElement(billingAddressZipCode).sendKeys("10001");
        driver.findElement(billingAddressPhoneNumber).sendKeys("0111234567");
        driver.findElement(billingAddressContinueButton).click();
    }

    public void enterShippingInformation() {
        driver.findElement(shippingAddressContinueButton).click();
    }

    public void selectShippingMethod() {
        driver.findElement(shippingMethodContinueButton).click();
    }

    public void selectPaymentMethod() {
        driver.findElement(paymentMethodRadioButton).click();
        driver.findElement(paymentMethodContinueButton).click();
    }

    public void enterPaymentInformation() {
        driver.findElement(paymentInformationContinueButton).click();
    }

    public void confirmOrder() {
        driver.findElement(confirmOrderButton).click();
    }
}
