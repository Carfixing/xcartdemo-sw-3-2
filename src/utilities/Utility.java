package utilities;


import browserfactory.BaseTest;
import com.beust.jcommander.internal.Nullable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    //*******************This method will click on element************************//
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }
    //*************This method will get text from element**********************//
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    //*****************this method will send text to element*********************//
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    //***********************verify text**************************************//

    public void verifyTextNull(String exceptedMessage, String actualMessage, @Nullable String errorMessage)
    {
        Assert.assertEquals(errorMessage == null ? "" : errorMessage, exceptedMessage, actualMessage);
    }

        //************************Alert Interface Methods*********************************//
    // 1) switch to alert
    public void switchToAlert(){
        driver.switchTo().alert();
    }
    //2)accept()
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    //3)dismiss()
    //4)alert().getText()
    //5)alert().sendkys()

    //********************select method*******************************//
    //1) select the option by visible text()  pass the blackcolour text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    //2)select by value blue colour
   public void selectBydropDown(By by ,String text){
            WebElement dropdown = driver.findElement(by);
            Select select = new Select(dropdown);
            select.selectByValue(text);
        }
   //3)select By Index()
   public void selectByIndex(By by,int text){
       WebElement dropdown = driver.findElement(by);
       Select select = new Select(dropdown);
       select.selectByIndex(text);
   }
   //4)getOption()
//   public void byGetOption(By by,int text){
//       WebElement dropdown = driver.findElement(by);
//       Select select = new Select(dropdown);
//       select.getOptions(text);
//   }
    //*************************** Action class ************************//
    //How to perform Mouse operation in selenium Wedriver?
   // 1)mouseHover click
   public void mouseHoverClick(By by) throws InterruptedException {
       Actions actions = new Actions(driver);
       WebElement mouseHoover = driver.findElement(by);
       Thread.sleep(3000);
       actions.moveToElement(mouseHoover).click().build().perform();
   }

    //   public void mouseHoverClick(By by) {
//       Actions actions = new Actions(driver);
//       WebElement mouseHoverclick = driver.findElement(by);
//       actions.moveToElement(mouseHoverclick).click().build().perform();
//   }
   //2)mousehoveronly

    public void mouseHoverOnly(By by) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
        Thread.sleep(3000);
        actions.moveToElement(mouseHoover).build().perform();
    }

//   public void mouseHoverOnly(By by) {
//       Actions actions = new Actions(driver);
//       WebElement mousehHover1 = driver.findElement(by);
//       actions.moveToElement(mousehHover1).build().perform();
//
//       }
    //3)Drag and drop
    //4)slider
    //5)KeyBoard Events


    public void scrolldown (By by) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseScrollDown = driver.findElement(by);
        Thread.sleep(3000);
        actions.moveToElement(mouseScrollDown).build().perform();
    }
}