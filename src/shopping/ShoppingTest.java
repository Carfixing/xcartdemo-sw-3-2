package shopping;

import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import utilities.Utility;

public class ShoppingTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
//    @Test
//    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException
//    {
//
//        //1.1 Mouse hover on the “Hot deals” link
//        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[@class='primary-title']"));
//
//        //1.2 Mouse hover on the “Bestsellers”  link and click
//        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
//        mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
//
//        //1.3 Verify the text “Bestsellers”
//        verifyTextNull("Bestsellers", getTextFromElement(By.xpath("//h1[@id='page-title']")), "Text not Verified");
//
//        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
//        mouseHoverOnly(By.xpath("//span[@class='sort-by-label']"));
//        mouseHoverClick(By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='asc']\n"));
//        verifyTextNull("Name A - Z",  getTextFromElement(By.xpath("//span[contains(text(),'Name A - Z')]")), "Not in alphabetical order");
//
//        //1.5 Click on “Add to cart” button of the product “Ollie - The App ControlledRobot"
//        clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']"));
//
//        //1.6 Verify the message “Product has been added to your cart” display in  green bar
//        verifyTextNull("Product has been added to your cart", getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]")),"Not Match");
//
//        //1.7 Click on X sign to close the message
//        clickOnElement(By.xpath("//a[@class='close']"));
//
//        //1.8 Click on “Your cart” icon and Click on “View cart” button
//        //clickOnElement(By.xpath("//div[@class='minicart-items-number']"));
//        clickOnElement(By.xpath("(//div[@title='Your cart'])[1]"));
//        clickOnElement(By.xpath("//a[@class='regular-button cart']"));
//       //  clickOnElement(By.xpath("//div[@title='Your cart']"));
//
//        //1.9 Verify the text “Your shopping cart - 1 item”
//        verifyTextNull("Your shopping cart - 1 item", getTextFromElement(By.xpath("//h1[@class='title']")),"Not Match");
//
//        //1.10 Verify the Subtotal $299.00
//        verifyTextNull("$309.73",getTextFromElement(By.xpath("//p[@class='subtotal']//span[contains(text(),'$309.73')]")),"Not Match");
//
//        //1.11 Verify the total $311.03
//        verifyTextNull("$309.73", getTextFromElement(By.xpath("//span[contains(text(),'309.73')]")),"Not Match");
//        //getTextFromElement(By.xpath("//li[@class='total']"));
//
//        // 1.12 Click on “Go to checkout” button
//        clickOnElement(By.xpath("//button[@class='btn  regular-button regular-main-button checkout']"));
//
//       //1.13 Verify the text “Log in to your account”
//        verifyTextNull("Log in to your account", getTextFromElement(By.xpath("//h3[contains(text(),'Log in to your account')]")),"Not Match");
//        getTextFromElement(By.xpath("//h3[contains(text(),'Log in to your account')]"));
//
//      //1.14 Enter Email address
//        sendTextToElement(By.xpath("//input[@id='email']"),"prime123@gmail.com");
//
//      //1.15 Click on “Continue” Button
//        clickOnElement(By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']"));
//
//      //1.16 Verify the text “Secure Checkout”
//        verifyTextNull("Secure Checkout",getTextFromElement(By.xpath("//h1[@class='title']")),"Not Match");
//
//      //1.17 Fill all the mandatory fields
//        sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"),"Mexin");//Firstname
//        sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"),"Patel");//Lastname
//        sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"),"500,whiteheart ave");//address
//        sendTextToElement(By.xpath("//input[@id='shippingaddress-city']"),"wembly");//city
//        sendTextToElement(By.xpath("//select[@id='shippingaddress-country-code']"),"India");//country
//        sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"),"newyork");//state
//        sendTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"),"90001");//90001
//        sendTextToElement(By.xpath("//input[@id='email']"),"prime123@gmail.com");//email
//
//        //1.18 the check box “Create an account for later use”
//        clickOnElement(By.xpath("//input[@id='create_profile']"));
//        //1.19 Enter the password
//        sendTextToElement(By.xpath("//input[@id='password']"), "Abc123!");
//        //1.20 Select the Delivery Method to “Local Shipping”
//        clickOnElement(By.xpath("//input[@id='method128']"));
//        //1.21 Select Payment Method “COD”
//        clickOnElement(By.xpath("//input[@id='pmethod6']"));
//        //1.22 Verify the total $99.00
//        verifyTextNull("$311.03", getTextFromElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]")),
//"Not Match");
//        getTextFromElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]"));
//        //1.23 Click on “Place Order” Button
//        clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]"));
//        //1.24 Verify the text “Thank you for your order”
//        verifyTextNull("Thank you for your order", getTextFromElement(By.xpath("//h1[@id='page-title']")),"Not Match");
//    }
@Test
public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
//        1.1 Mouse hover on the “Hot deals” link
    mouseHoverOnly(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
//        1.2 Mouse hover on the “Bestsellers”  link and click
    mouseHoverClick(By.xpath("//li[@class='leaf has-sub']//li[2]//a[1]"));
//        1.3 Verify the text “Bestsellers”
    String expectedText = "Bestsellers";
    String acutalText = getTextFromElement(By.xpath("//h1[@id='page-title']"));
    Assert.assertEquals("Broken Link", expectedText, acutalText);
//        1.4 Mouse hover on “Sort By” and select “Name A-Z”
    mouseHoverClick(By.xpath(("//span[@class='sort-by-label']")));
    mouseHoverClick(By.xpath(("//a[normalize-space()='Name A - Z']")));
//        1.5 Click on “Add to cart” button of the product “IPhone SE”
    Thread.sleep(2000);
    mouseHoverClick(By.xpath("//img[contains(@alt,'iPhone 5S')]"));
    clickOnElement(By.xpath("//button[@type='submit']//span[contains(text(),'Add to cart')]"));
//        1.6 Verify the message “Product has been added to your cart” display in  green bar
    String expectedCartMsg = "Product has been added to your cart";
    Thread.sleep(3000);
    String actualCartMsg = getTextFromElement(By.xpath("//li[@class='info']"));   ////li[contains(@class,'info')]
    Assert.assertEquals("Product has not been added to the cart", expectedCartMsg, actualCartMsg);
//        1.7 Click on X sign to close the message
    Thread.sleep(3000);
    clickOnElement(By.xpath("//a[@title='Close']"));
//        1.8 Click on “Your cart” icon and Click on “View cart” button
    Thread.sleep(2000);
    mouseHoverClick(By.xpath("//div[@title='Your cart']"));
    clickOnElement(By.xpath("//span[normalize-space()='View cart']"));
//        1.9 Verify the text “Your shopping cart - 1 item”
    Thread.sleep(3000);
    String expectedCartMsg1 = "Your shopping cart - 1 item";
    String actualCartMsg1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));   ////li[contains(@class,'info')]
    Assert.assertEquals("Text:'Your shopping cart - 1 item'", expectedCartMsg1, actualCartMsg1);
//        1.10 Verify the Subtotal $299.00
    Thread.sleep(3000);
    String expectedSubTotal = "$299.00";
    String actualSubTotal = getTextFromElement(By.xpath("//ul[@class='sums']/li/span"));   ////li[contains(@class,'info')]
    Assert.assertEquals("Subtotal is not correct.", expectedSubTotal, actualSubTotal);
//        1.11 Verify the total $106.23
    Thread.sleep(3000);
    String expectedTotal = "$309.73";
    String actualTotal = getTextFromElement(By.xpath("//li[@class='total']/span/span[1]"));   ////li[contains(@class,'info')]
    Assert.assertEquals("Subtotal is not correct.", expectedTotal, actualTotal);
//        1.12 Click on “Go to checkout” button
    mouseHoverClick(By.xpath("//button[contains(@class,'regular-button regular-main-button checkout')]"));
//        1.13 Verify the text “Log in to your account”
    Thread.sleep(3000);
    String expectedLoginMessage = "Log in to your account";
    String actualLoginMessage = getTextFromElement(By.xpath("//h3[normalize-space()='Log in to your account']"));   ////li[contains(@class,'info')]
    Assert.assertEquals("Subtotal is not correct.", expectedLoginMessage, actualLoginMessage);
//        1.14 Enter Email address
    Thread.sleep(2000);
    sendTextToElement(By.xpath("//input[@id='email']"), "abc@gmail.com");
//        1.15 Click on “Continue” Button
    Thread.sleep(2000);
    clickOnElement(By.xpath("//span[contains(text(),'Continue')]"));
//        1.16 Verify the text “Secure Checkout”
    Thread.sleep(3000);
    String expectedCheckOutMessage = "Secure Checkout";
    String actualCheckOutMessage = getTextFromElement(By.xpath("//h1[@class='title']"));
    Assert.assertEquals("Subtotal is not correct.", expectedCheckOutMessage, actualCheckOutMessage);
//        1.17 Fill all the mandatory fields
    Thread.sleep(3000);
    sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"), "Akashay");
    sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"), "Patel");
    sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"), "alendeal road");
    sendTextToElement(By.xpath("//input[@id='shippingaddress-city']"), "London");
    sendTextToElement(By.xpath("//select[@id='shippingaddress-country-code']"), "United Kingdom");
    sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"), "Harrow");
    sendTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"), "W1 2DN");
//        1.18 Check the check box “Create an account for later use”
    Thread.sleep(2000);
    //  1.19 Enter the password
//        1.20 Select the Delivery Method to “Local Shipping”
    Thread.sleep(1000);
    clickOnElement(By.xpath("//input[@id='method128']"));
//        1.21 Select Payment Method “COD”
    Thread.sleep(1000);
    clickOnElement(By.xpath("//input[@id='pmethod6']"));
//        1.22 Verify the total $311.03.00
    Thread.sleep(1000);
    verifyTextNull("$311.03",getTextFromElement(By.xpath("//div[@class='total clearfix']//span[@class='part-prefix'][normalize-space()='$']")),"");
//        1.23 Click on “Place Order” Button
    clickOnElement(By.xpath("//span[normalize-space()='Place order: $311.03']"));
//        1.24 Verify the text “Thank you for your order”
    Thread.sleep(1000);
    String expectedOrderConfirmMessage = "Thank you for your order";
    String actualOrderConfirmMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
    Assert.assertEquals("Subtotal is not correct.", expectedOrderConfirmMessage, actualOrderConfirmMessage);
}


    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException
    {
      //1.1 Mouse hover on the “Hot deals” link
        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[@class='primary-title']"));

      //1.2 Mouse hover on the “Bestseller”  link and click
        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
        mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));

       //1.3 Verify the text “Bestsellers”
        verifyTextNull("Bestsellers", getTextFromElement(By.xpath("//h1[@id='page-title']")) , "Text not Verified");


       //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverOnly(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverClick(By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='asc']\n"));
        verifyTextNull("Name A - Z", getTextFromElement(By.xpath("//span[contains(text(),'Name A - Z')]")) , "Not in alphabetical order");

       //1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
       // scrolldown(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[9]/div[1]/div[2]/div[4]/div[1]/button[1]"));
        scrolldown(By.xpath("//button[contains(@class,'btn  regular-button add-to-cart product-add2cart productid-13')]\n"));
     //   clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[9]/div[1]/div[2]/div[4]/div[1]/button[1]"));
        mouseHoverClick(By.xpath("//button[contains(@class,'btn  regular-button add-to-cart product-add2cart productid-13')]"));

        //clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']"));
        //clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[9]/div[1]/div[2]/div[4]/div[1]/button[1]"));

       //1.6 Verify the message “Product has been added to your cart” display in  green bar
        verifyTextNull("Product has been added to your cart",getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]")), "Text not Verified");

        //1.7 Click on X sign to close the message
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1] "));

        //1.8 Click on “Your cart” icon and Click on “View cart” button
        //  clickOnElement(By.xpath("lc-minicart lc-minicart-horizontal collapsed recently-updated"));
        // clickOnElement(By.xpath("//a[@class='regular-button cart']"));
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

      //1.9 Verify the text “Your shopping cart - 1 item”
        verifyTextNull("Your shopping cart - 1 item", getTextFromElement(By.xpath("//h1[@id='page-title']")),"not Match");
        getTextFromElement(By.xpath("//h1[@id='page-title']"));

      //1.10 Click on “Empty your cart” link
        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));

        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        switchToAlert();
        verifyTextNull("Are you sure you want to clear your cart?","Are you sure you want to clear your cart?","Not Match");
        switchToAlert();//capture alert message
        // verifyText("Are you sure you want to clear your cart?","Are you sure you want to clear your cart?","Not Match");
      // getTextFromElement(By.xpath(""));

      //1.12 Click “Ok” on alert
        acceptAlert();

      //1.13 Verify the message “Item(s) deleted from your cart”
        verifyTextNull("Item(s) deleted from your cart",getTextFromElement(By.xpath(" //li[contains(text(),'Item(s) deleted from your cart')]\n")),"Not Match");

      //1.15 Verify the text “Your cart is empty”
        verifyTextNull("Your cart is empty",getTextFromElement(By.xpath("(//h1[normalize-space()='Your cart is empty'])[1]")),"Not match");

    }
}
