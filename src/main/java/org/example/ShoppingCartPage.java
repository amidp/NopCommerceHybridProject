package org.example;

import org.openqa.selenium.By;
//create new class as new page - pom model
public class ShoppingCartPage extends Utils{
    By _termsAndConditionBox=By.id("termsofservice");
    By _checkoutButton=By.cssSelector("#checkout");

    public void tickCheckboxTerms(){
        clickOnElement(_termsAndConditionBox);
    }
    public void clickCheckoutButtonOnShoppingCartPage(){
        clickOnElement(_checkoutButton);

    }
}
