// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

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
        //       driver.findElement(By.cssSelector(".btn-cart:nth-child(1) > span > span")).click();
        // driver.findElement(By.id("city")).sendKeys("alabama");
        //driver.findElement(By.id("postcode")).sendKeys("12345");
        driver.findElement(By.id("region_id")).click();
        {
            WebElement dropdown = driver.findElement(By.id("region_id"));
            dropdown.findElement(By.xpath("//option[. = 'Alabama']")).click();
        }
        driver.findElement(By.cssSelector(".method-checkout-cart-methods-onepage-bottom span > span")).click();
        driver.findElement(By.id("onepage-guest-register-button")).click();
        driver.findElement(By.id("billing:firstname")).click();
        driver.findElement(By.cssSelector("ul:nth-child(2) .name-lastname")).click();
        driver.findElement(By.id("billing:firstname")).click();
        driver.findElement(By.id("billing:firstname")).sendKeys("Test");
        driver.findElement(By.id("billing:middlename")).sendKeys("Test2");
        driver.findElement(By.id("billing:lastname")).sendKeys("Test3");
        driver.findElement(By.id("billing:company")).sendKeys("Test5");
        driver.findElement(By.id("billing:email")).sendKeys("asdf@example.com");
        driver.findElement(By.id("billing:street1")).sendKeys("adresa mea");
        driver.findElement(By.id("billing:street2")).sendKeys("adresa mea 2");
        driver.findElement(By.id("billing:city")).sendKeys("Alabama City");
        driver.findElement(By.id("billing:region_id")).click();
        {
            WebElement dropdown = driver.findElement(By.id("billing:region_id"));
            dropdown.findElement(By.xpath("//option[. = 'Alabama']")).click();
        }
        driver.findElement(By.id("billing:postcode")).click();
        driver.findElement(By.id("billing:postcode")).sendKeys("12345");
        driver.findElement(By.id("billing:telephone")).click();
        driver.findElement(By.id("billing:telephone")).sendKeys("0777777777");
        driver.findElement(By.cssSelector("#billing-buttons-container span > span")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#shipping-method-buttons-container span > span")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#payment-buttons-container span > span")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector(".btn-checkout")).click();


    }
}


