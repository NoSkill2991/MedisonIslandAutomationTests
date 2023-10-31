
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class CheckoutTest extends Hooks {
    private CheckoutPage checkoutPage;

    @Before
    public void setupPageObject() {
        checkoutPage = new CheckoutPage(driver);
    }

    @Test
    public void checkout() throws InterruptedException {
        checkoutPage.getFoodMenu();
        checkoutPage.getAddCart();
        checkoutPage.completeAndSubmitCart();
        checkoutPage.assertTextWhenReady(checkoutPage.pageTitle,"CHECKOUT");
        checkoutPage.CompleteAllMandatoryFieldsInCheckoutPage();
        checkoutPage.clickAllContinueButtonsOnCheckoutPage();
        checkoutPage.assertTextWhenReady(checkoutPage.pageTitle,"YOUR ORDER HAS BEEN RECEIVED.");

    }

    @Test
    public void checkoutAnotherTest(){

    }
}


