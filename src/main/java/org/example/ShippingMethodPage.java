package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;
//create new class as per pom model
public class ShippingMethodPage extends Utils{
    By _nextDayOption=By.xpath("//input[@id='shippingoption_1']");
    By _clickContinueButtonOnShippingMethod=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    public void clickContinueShipping(){
      //  driver.findElement(By.xpath("//input[@id='shippingoption_1']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickOnElement(_nextDayOption);
        clickOnElement(_clickContinueButtonOnShippingMethod);
    }


}
