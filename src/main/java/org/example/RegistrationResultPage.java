package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create registrationresultpage
public class RegistrationResultPage extends RegistrationPage {
    public void verifyUserRegisterSuccessfully(){
        String actualRegisterSuccessMessage=getTextFromElement(By.xpath("//div[@class=\"page-body\"]/div[1]"));
        String expectedRegisterSuccessMessage="Your registration completed";
        //verifying the actual requirement and check if test case is pass or fail
        Assert.assertEquals(actualRegisterSuccessMessage,expectedRegisterSuccessMessage,"Your registration completed");
     }

}
