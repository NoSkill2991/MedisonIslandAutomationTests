import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CheckoutPage extends  BasePage{

    private WebDriverWait wait;
    CheckoutPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver,30);
    }

//Duration.ofSeconds(30)
    @FindBy(xpath = "//a[text()='Food']")
    private WebElement foodMenu;

    @FindBy(css = ".product-info button")
    private WebElement addToCart;

    @FindBy(id = "city")
    private WebElement cityCart;

    @FindBy(id = "postcode")
    private WebElement postCodeCart;

    @FindBy(id = "region_id")
    private WebElement cartRegionDropdown;

    @FindBy(css = ".method-checkout-cart-methods-onepage-bottom button")
    private WebElement checkoutButton;
    @FindBy(id = "onepage-guest-register-button")
    private WebElement registerButton;

    @FindBy(id = "billing:firstname")
    private WebElement firstName;

    @FindBy(id = "billing:middlename")
    private WebElement middleName;

    @FindBy(id = "billing:lastname")
    private WebElement lastName;
    @FindBy(id = "billing:company")
    private WebElement companyName;

    @FindBy(id = "billing:email")
    private WebElement email;

    @FindBy(id = "billing:street1")
    private WebElement address1;

    @FindBy(id = "billing:street2")
    private WebElement address2;

    @FindBy(id = "billing:city")
    private WebElement cityAddress;

    @FindBy(id = "billing:region_id")
    private WebElement regionDropdown;

    @FindBy(id = "billing:postcode")
    private WebElement postcode;

    @FindBy(id = "billing:telephone")
    private WebElement phoneNumber;

    @FindBy(css = "#billing-buttons-container button")
    public WebElement billingContinue;

    @FindBy(css = "#shipping-method-buttons-container button")
    public WebElement shippingContinue;
    @FindBy(css = "#payment-buttons-container button")
    public WebElement paymentContinue;
    @FindBy(css = ".btn-checkout")
    public WebElement checkoutBtn;

    @FindBy(xpath = "//div[@class='page-title']")
    public WebElement pageTitle;


    public void getFoodMenu(){
        foodMenu.click();
    }

    public void getAddCart(){
        addToCart.click();
    }

    public void getCityCart(){
        cityCart.sendKeys("alabama");
    }

    public void getPostCodeCart(){
        postCodeCart.sendKeys("12345");
    }

    public void clickCartRegionDropdown(){
        cartRegionDropdown.click();
    }



    public void selectCartRegion(String cartRegionName){
        Select cartRegionSelect = new Select(cartRegionDropdown);
        cartRegionSelect.selectByVisibleText(cartRegionName);
    }


    public void getCheckoutButton(){
        checkoutButton.click();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void setFirstName(String firstName){
        this.firstName.sendKeys(firstName);
    }
    public void setMiddleName(String middleName){
        this.middleName.sendKeys(middleName);
    }

    public void setLastName(String lastName){
        this.lastName.sendKeys(lastName);
    }

    public void setCompanyName(String companyName){
        this.companyName.sendKeys(companyName);
    }

    public void setEmail(String email){
        this.email.sendKeys(email);
    }

    public void setAddressOne(String address1){
        this.address1.sendKeys(address1);
    }

    public void setAddressTwo(String address2){
        this.address2.sendKeys(address2);
    }


    public void setCityAddress(String cityAddress){
        this.cityAddress.sendKeys(cityAddress);
    }

    public void selectRegion(String regionName){
        Select regionSelect = new Select(regionDropdown);
        regionSelect.selectByVisibleText(regionName);
    }

    public void setPostcode(String postcode){
        this.postcode.sendKeys(postcode);
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber.sendKeys(phoneNumber);
    }

    public void clickWhenReady(WebElement locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void completeAndSubmitCart(){
        getCityCart();
        getPostCodeCart();
        clickCartRegionDropdown();
        selectCartRegion("Alabama");
        getCheckoutButton();
        clickRegisterButton();

    }

    public void CompleteAllMandatoryFieldsInCheckoutPage(){
        setFirstName("Test1");
        setMiddleName("Test2");
        setLastName("Test3");
       setCompanyName("Test5");
        setEmail("asdf@example.com");
        setAddressOne("adresa mea");
        setAddressTwo("adresa mea 2");
        setCityAddress("Alabama City");
        selectRegion("Alabama");
        setPostcode("12345");
        setPhoneNumber("0777777777");
    }

    public void clickAllContinueButtonsOnCheckoutPage() {
        clickWhenReady(billingContinue);
        clickWhenReady(shippingContinue);
        clickWhenReady(paymentContinue);
        clickWhenReady(checkoutBtn);

    }

    public void assertTextWhenReady( WebElement locator, String expectedText){
        wait.until(ExpectedConditions.visibilityOf(locator));
        wait.until(ExpectedConditions.textToBePresentInElement(locator,expectedText));
        assertEquals(expectedText,locator.getText());
    }
}
