import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private WebDriverWait wait;
    LoginPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver,30);
    }

    //Duration.ofSeconds(30)
    @FindBy(xpath = "//a[text()='Food']")
    private WebElement foodMenu;

    public void getAddCart(){
        foodMenu.click();
    }

}
