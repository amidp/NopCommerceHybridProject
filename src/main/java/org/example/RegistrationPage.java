package org.example;
import org.openqa.selenium.By;

//create new class registration page
public class RegistrationPage extends HomePage {
    //create objects for locators
    By _firstName = By.name("FirstName");
    By _lastName = By.name("LastName");
    By _email = By.id("Email");
    By _password = By.id("Password");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registerButton =By.id("register-button");
    By _dobDate = By.name("DateOfBirthDay");
    By _dobMonth = By.name("DateOfBirthMonth");
    By _dobYear = By.name("DateOfBirthYear");

    //create object for loadprop class
    LoadProp loadProp = new LoadProp();

public  void userEntersRegistrationDetails(){
      typeText(_firstName,loadProp.getProperty("firstName"));
      typeText(_lastName,loadProp.getProperty("lastName"));
      selectByVisibleText(_dobDate,loadProp.getProperty("dOB"));
      selectByValue(_dobMonth,loadProp.getProperty("dOM"));
      selectByVisibleText(_dobYear,loadProp.getProperty("dOY"));
      String email= loadProp.getProperty("emailOne")+currentTimeStamp()+loadProp.getProperty("emailTwo");
      typeText(_email,email);
      typeText(_password,loadProp.getProperty("password"));
      typeText(_confirmPassword,loadProp.getProperty("confirmPassword"));

}
public void clickOnRegisterButton(){
    clickOnElement(_registerButton);
}




    }








