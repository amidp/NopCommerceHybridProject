package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//create Build Your Own Computer Page as per pom model
public class BuildYourOwnComputerPage extends Utils
{
    //object for load prop class and variables for locators
    LoadProp loadProp = new LoadProp();
    By _processor=By.id("product_attribute_1");
    By _ram= By.id("product_attribute_2");
    By _hdd=By.xpath("//label[contains(text(),'320 GB')]");
    By _operatingSystem=By.id("product_attribute_4_8");
    //By _software1=By.id("product_attribute_5_10");
    By _software2=By.id("product_attribute_5_11");
    By _software3=By.id("product_attribute_5_12");
    By _addToCart=By.id("add-to-cart-button-1");
    By _shoppingCart=By.xpath("//span[contains(text(),'Shopping cart')]");
    //create methods as per requirements
    public void verifyUserIsOnBuildYourOwncomputerPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("build-your-own-computer"));
    }
    public void clickOnEmailFriend(){
        clickOnElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));

    }
    public void configurationDetailsForBuildYourOwnComputer() {
        selectByValue(_processor, loadProp.getProperty("processor"));
        selectByValue(_ram, loadProp.getProperty("ram"));
        clickOnElement(_hdd);
        clickOnElement(_operatingSystem);
        //clickOnElement(_software1);
        clickOnElement(_software2);
        clickOnElement(_software3);
    }
    public void clickOnAddToCartButton() {
        clickOnElement(_addToCart);
        waitForVisible(_addToCart, 10);
    }
    public void clickOnShoppingCart(){
        clickOnElement(_shoppingCart);

    }
}
