package org.example;

import org.openqa.selenium.By;
//create class as per pom model
public class PaymentCardInformationPage extends Utils{
    LoadProp loadProp=new LoadProp();
    By _cardHolderName=By.id("CardholderName");
    By _cardNumber=By.id("CardNumber");
    By _expiryMonth=By.id("ExpireMonth");
    By _expiryYear=By.id("ExpireYear");
    By _cardCode=By.id("CardCode");
   // By _continueButtonPayment=By.id("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By _continueButtonPayment=By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
    public void enterPaymentCreditCardDetails(){
        waitForVisible(_cardHolderName,10);
        typeText(_cardHolderName,loadProp.getProperty("cardHolderName"));
        typeText(_cardNumber,loadProp.getProperty("cardNumber"));
        selectByValue(_expiryMonth,loadProp.getProperty("expiryMonth"));
        selectByValue(_expiryYear,loadProp.getProperty("expiryYear"));
        typeText(_cardCode,loadProp.getProperty("cardcode"));
    }
    public void clickOnContinueButtonPaymentInfo(){
        //waitForClickable(_continueButtonPayment,6);
        clickOnElement(_continueButtonPayment);
    }
}
