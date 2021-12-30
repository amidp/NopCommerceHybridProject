package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create Desktopresult class
public class DesktopResult extends Utils{
    public void verifyUserNavigatesToDeskTopPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"));
    }
    public void clickOnDesktop(){
        clickOnElement(By.linkText("Desktops"));
    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(By.linkText("Build your own computer"));
    }
    public void clickOnSendEmail(){
        clickOnElement(By.xpath("//div[@class='email-a-friend']/button"));
    }
}
