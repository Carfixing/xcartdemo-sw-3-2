package hotdeals;

import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import utilities.Utility;

public class HotDealsTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";
    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException    {
        //1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(400);
        mouseHoverOnly(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"));
        Thread.sleep(400);
        //1.2 Mouse hover on the “Sale”  link and click
        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        //1.3 Verify the text “Sale”
        Thread.sleep(1000);
        verifyTextNull("Sale",getTextFromElement(By.xpath("//h1[@id='page-title']")),"Not matched with original text");
        //1.4  Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverOnly(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverClick(By.xpath("//a[normalize-space()='Name A - Z']"));
        //Verify that the product arrange alphabetically
        Thread.sleep(1000);
        verifyTextNull("Name A - Z", getTextFromElement(By.xpath("//span[contains(text(),'Name A - Z')]")),"Not in alphabetical order");
    }
/*2 - verifySaleProductsPriceArrangeLowToHigh()
		2.1 Mouse hover on the “Hot deals” link
		2.2 Mouse hover on the “Sale”  link and click
		2.3 Verify the text “Sale”
            2.4 Mouse hover on “Sort By” and select “Price Low-High”
            2.5 Verify that the product’s price arrange Low to High*/

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException  {
        //2.1 Mouse hover on the “Hot deals” link
        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[@class='primary-title']"));
        //2.2 Mouse hover on the “Sale”  link and click
        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        //2.3 Verify the text “Sale”
        verifyTextNull("Sale",getTextFromElement(By.xpath("//h1[@id='page-title']")),"Not matched with original text");
        //2.4  Mouse hover on “Sort By” and select “Price Low-High”
        mouseHoverOnly(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverClick(By.xpath("//a[normalize-space()='Price Low - High']"));
        //2.5 Verify that the product’s price arrange Low to High
        verifyTextNull(" Price Low - High", getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")),
"Not Match");
    }
	/*3 - verifySaleProductsArrangeByRates()
		3.1 Mouse hover on the “Hot deals” link
		3.2 Mouse hover on the “Sale”  link and click
		3.3 Verify the text “Sale”
            3.4 Mouse hover on “Sort By” and select “Rates”
            3.5 Verify that the product’s arrange Rates*/
    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException  {
        //3.1 Mouse hover on the “Hot deals” link
        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[@class='primary-title']"));
        //3.2 Mouse hover on the “Sale”  link and click
        mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        //3.3 Verify the text “Sale”
        verifyTextNull("Sale", getTextFromElement(By.xpath("//h1[@id='page-title']")),"Not matched with original text");
        //3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHoverOnly(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverClick(By.xpath("//a[normalize-space()='Rates']"));
        //3.5 Verify that the product’s arrange Rates
        verifyTextNull("Rates", getTextFromElement(By.xpath("//span[contains(text(),'Rates')]")), "match with original text");
        getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
    }

    /*4 - verifyBestSellersProductsArrangeByZToA()
         1.1 Mouse hover on the “Hot deals” link
         1.2 Mouse hover on the “Bestsellers”  link and click
         1.3 Verify the text “Bestsellers”
             1.4 Mouse hover on “Sort By” and select “Name Z-A”
             1.5 Verify that the product arrange by Z to A*/
    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException    {
    //4.1 Mouse hover on the “Hot deals” link
    mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
    //4.2 Mouse hover on the “Bestsellers”  link and click
    mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
    mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
    //4.3 Verify the text “Bestsellers”
    verifyTextNull("Bestsellers", getTextFromElement(By.xpath("//h1[@id='page-title']")),"Text not Verified");
    //4.4 Mouse hover on “Sort By” and select “Name Z-A”
    mouseHoverOnly(By.xpath("//span[@class='sort-by-label']"));
    mouseHoverClick(By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='desc']"));
    //4.5  Verify that the product arrange by Z to A
    verifyTextNull("Name Z-A",getTextFromElement(By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='desc']")),"Not in order");

}
/*5 - verifyBestSellersProductsPriceArrangeHighToLow()
		2.1 Mouse hover on the “Hot deals” link
		2.2 Mouse hover on the “Bestsellers” link and click
		2.3 Verify the text “Bestsellers”
		2.4 Mouse hover on “Sort By” and select “Price High-Low”
		2.5 Verify that the product’s price arrange High to Low*/

   @Test
   public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException
   {
       //Mouse hover on the “Hot deals” link
       mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
       //Mouse hover on the “Bestsellers”  link and click
       mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
       mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
       //Verify the text “Bestsellers”
       verifyTextNull("Bestsellers", getTextFromElement(By.xpath("//h1[@id='page-title']")), "Text not Verified");
       //Mouse hover on “Sort By” and select “Price High-Low”
       mouseHoverOnly(By.xpath("//span[@class='sort-by-label']"));
       mouseHoverClick(By.xpath("//a[@data-sort-by='p.price' and @data-sort-order='desc']"));
       // Verify that the product arrange by Price High-Low
       verifyTextNull("Price High-Low", getTextFromElement(By.xpath("//a[@data-sort-by='p.price' and @data-sort-order='desc']")), "Not in order");
   }
/*6 - verifyBestSellersProductsArrangeByRates()
		3.1 Mouse hover on the “Hot deals” link
		3.2 Mouse hover on the “Bestsellers”  link and click
		3.3 Verify the text “Bestsellers”
		3.4 Mouse hover on “Sort By” and select “Rates”
		3.5 Verify that the product’s arrange Rates*/
    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException
    {

            //Mouse hover on the “Hot deals” link
            mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
            //Mouse hover on the “Bestsellers”  link and click
            mouseHoverOnly(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
            mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
            //Verify the text “Bestsellers”
            verifyTextNull("Bestsellers", getTextFromElement(By.xpath("//h1[@id='page-title']")) , "Text not Verified");
            //Mouse hover on “Sort By” and select “Rates”
            mouseHoverOnly(By.xpath("//span[@class='sort-by-label']"));
            mouseHoverClick(By.xpath("//a[@data-sort-by='r.rating' and @data-sort-order='asc']"));
            // Verify that the product arrange by Rates
            verifyTextNull("Rates",getTextFromElement(By.xpath("//span[contains(text(),'Rates')]")) , "Not in order");

        }

   @Before
    public void teardown(){
        closeBrowser();

   }
    }




