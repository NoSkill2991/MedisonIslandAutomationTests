import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends  BasePage{
    CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Food']")
    private WebElement foodMenu;

    @FindBy(css = ".btn-cart:nth-child(1) > span > span")
    private WebElement addToCart;

    @FindBy(id = "city")
    private WebElement cityCart;

    @FindBy(id = "postcode")
    private WebElement postCodeCart;

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
}
