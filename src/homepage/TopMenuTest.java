package homepage;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException{
        //1.1 Click on the “Shipping” link
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Shipping')]"));
        //1.2 Verify the text “Shipping”
        verifyTextNull("Shipping",getTextFromElement(By.xpath("//h1[@id='page-title']")),"Not Match with original text");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {
        //2.1 Click on the “New!” link
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'New!')]"));
        //2.2 Verify the text “New arrivals”
        verifyTextNull("New arrivals",getTextFromElement(By.xpath("//h1[@id='page-title']")),"Not Match with original text");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() throws InterruptedException{
        // 3.1 Click on the “Coming soon” link
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Coming soon')]"));
        //3.2 Verify the text “Coming soon”
        verifyTextNull("Coming soon", getTextFromElement(By.xpath("//h1[@id='page-title']")),"Not Match with original text");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException{
       // Click on the “Contact us” link
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Contact us')]"));
        //Verify the text “Contact us”
        verifyTextNull("Contact us",  getTextFromElement(By.xpath("//h1[@class='title']")),"Not Match with original text");
    }

  @After
    public void teardown(){
        closeBrowser();
  }
  }

