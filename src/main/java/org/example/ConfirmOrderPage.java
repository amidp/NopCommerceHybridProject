package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//create class as per pom model
public class ConfirmOrderPage extends Utils{
    //variable for locator and methods according to requirements
    By _confirmButton=By.xpath("//button[contains(text(),'Confirm')]");
    public void confirmationOrder(){
        waitForClickable(By.id("confirm-order-buttons-container"),10);
        clickOnElement(_confirmButton);
    }
    public void verifyUserPlacedOrderSuccessfully(){
        String actualResult = getTextFromElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
        String expectedResult = "Your order has been successfully processed!";
        //verifying the actual requirement and check if test case is pass or fail
        Assert.assertTrue(actualResult.equals(expectedResult),"Your order has not been processed.");
    }
}
