import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends  BasePage{
    CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Food']")
    private WebElement foodMenu;

    public void getFoodMenu(){
        foodMenu.click();
    }

}
