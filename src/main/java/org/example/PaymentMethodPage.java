package org.example;

import org.openqa.selenium.By;
//create new class as per pom model
public class PaymentMethodPage extends Utils{
    By _paymentMethod=By.id("paymentmethod_1");
    By _paymentButton=By.id("payment-method-buttons-container");

    public void selectPaymentMethod(){
        waitForVisible(By.id("paymentmethod_1"),10);
        clickOnElement(_paymentMethod);
        waitForVisible(_paymentButton,10);
        clickOnElement(_paymentButton);
    }
}
