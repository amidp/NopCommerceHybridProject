package org.example;

import org.openqa.selenium.By;
//create Billing Address Page as per pom model
public class BillingAdressPage extends Utils{
      //define load prop object
      LoadProp loadProp=new LoadProp();
      //variables for locators
      By _country=By.id("BillingNewAddress_CountryId");
      By _city=By.xpath("//input[@id='BillingNewAddress_City']") ;
      By _address1=By.xpath("//input[@id='BillingNewAddress_Address1']");
      By _zipPstalCode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
      By _phoneNumber=By.id("BillingNewAddress_PhoneNumber");
      By _continueButton=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
      //create method as per requirement
      public void fillMandatoryFieldsBillingAddress(){
            selectByValue(_country,loadProp.getProperty("country"));
            typeText(_city,loadProp.getProperty("city"));
            typeText(_address1,loadProp.getProperty("Address"));
            typeText(_zipPstalCode,loadProp.getProperty("zippostalcode"));
            typeText(_phoneNumber,loadProp.getProperty("phone"));
      }
      public void clickOnContinueOnBillingAddress(){
            clickOnElement(_continueButton);

      }




}
