
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;


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
        checkoutPage.getCityCart();

        checkoutPage.getPostCodeCart();
        checkoutPage.clickCartRegionDropdown();
        checkoutPage.selectCartRegion("Alabama");
        checkoutPage.getCheckoutButton();
        checkoutPage.clickRegisterButton();
        checkoutPage.setFirstName("Test1");
        checkoutPage.setMiddleName("Test2");
        checkoutPage.setLastName("Test3");
        checkoutPage.setCompanyName("Test5");
        checkoutPage.setEmail("asdf@example.com");
        checkoutPage.setAddressOne("adresa mea");
        checkoutPage.setAddressTwo("adresa mea 2");
        checkoutPage.setCityAddress("Alabama City");
        checkoutPage.selectRegion("Alabama");
        checkoutPage.setPostcode("12345");
        checkoutPage.setPhoneNumber("0777777777");

        checkoutPage.clickWhenReady(checkoutPage.billingContinue);
        checkoutPage.clickWhenReady(checkoutPage.shippingContinue);
        checkoutPage.clickWhenReady(checkoutPage.paymentContinue);
        checkoutPage.clickWhenReady(checkoutPage.checkoutBtn);



    }

    @Test
    public void checkoutAnotherTest(){

    }
}


