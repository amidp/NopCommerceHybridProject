package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//create home page class for all actions in homepage for testing requirements
public class HomePage extends Utils
    //object for load prop class and variables for locators
{   LoadProp loadProp=new LoadProp();
    By _clickOnNewsComment = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[3]/a[1]");
    By _clickOnRegisterButton = By.linkText("Register");
    By _vote=By.id("vote-poll-1");
    By _clickOnContinueHomePage=By.xpath("//a[contains(text(),'Continue')]");
    By _clickDetailsUnderNewOnlineStore=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/a[1]");
    By _facebookButton= By.xpath("//a[contains(text(),'Facebook')]");
    //methods as per requirements
    public void clickOnContinueOnHomePage(){
        clickOnElement(_clickOnContinueHomePage);
    }

    public void clickDetailsButton(){
        clickOnElement(_clickDetailsUnderNewOnlineStore);
    }

    public void clickOnTheRegister()
    {
    clickOnElement(_clickOnRegisterButton);
    }
    public void clickOnTheNewsComment()
    {
    clickOnElement(_clickOnNewsComment);
    }
    public void clickOnElementComputers(){
        clickOnElement(By.linkText("Computers"));
    }

    public void clickOnCategoryButton(String text)
    {
        clickOnElement(By.linkText(text));
    }
    public void clickSubcategoryButton(String subcategory)
    {   WebElement color=driver.findElement(By.linkText(subcategory));
        String s1=color.getCssValue("color");
        System.out.println("Before : "+s1);
        //Initiate mouse action using Actions class
        Actions actions = new Actions(driver);
        // move the mouse to the earlier identified menu option
        WebElement element1= driver.findElement(By.linkText(subcategory));
        actions.moveToElement(element1).build().perform();
        element1.click();
        WebElement AfterHover=driver.findElement(By.linkText(subcategory));
        String s2=AfterHover.getCssValue("color");
        System.out.println("After Hover : "+s2);
        System.out.println(s2.equals(loadProp.getProperty("blue")));
        Assert.assertTrue(s2.equals(loadProp.getProperty("blue")));
    }
    public void windowsHandle()
    {
        driver.findElement(_facebookButton).click();
        Set<String> Handles = driver.getWindowHandles();
        Iterator<String> iterator = Handles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
        driver.findElement(By.xpath("//button[@data-cookiebanner=\"accept_button\"]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/a/i")).getText().equals("Facebook"));
        driver.close();
        driver.switchTo().window(parentWindow);
    }

    public void voteButton() {
        clickOnElement(_vote);
    }
    public void popUpHandle(){
        driver.switchTo().alert().accept();
    }
    public void verifyAlertMessage()
    {
        Assert.assertEquals(driver.switchTo().alert().getText(),loadProp.getProperty("expectedResultPopup"),"alert message failed");
    }



 }


