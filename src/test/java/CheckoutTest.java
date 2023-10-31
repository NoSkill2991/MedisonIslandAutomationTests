
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;

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
        Thread.sleep(3000);
        assertEquals("CHECKOUT",checkoutPage.pageTitle.getText());
        checkoutPage.CompleteAllMandatoryFieldsInCheckoutPage();
        checkoutPage.clickAllContinueButtonsOnCheckoutPage();
        Thread.sleep(3000);
        assertEquals("YOUR ORDER HAS BEEN RECEIVED.",checkoutPage.pageTitle.getText());
    }

    @Test
    public void checkoutAnotherTest(){

    }
}


