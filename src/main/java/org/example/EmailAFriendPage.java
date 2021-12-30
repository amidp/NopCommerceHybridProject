package org.example;
import org.openqa.selenium.By;
//create class email a freind
public class EmailAFriendPage extends Utils{
        // LoadProp loadProp= new LoadProp();
       //  By _email = By.id("FriendEmail");
    //methods for required actions as per requirements
    public void detailsToAddForReferProduct(){
        typeText(By.id("FriendEmail"),"tomnjerry1+"+currentTimeStamp()+"@gmail.com");
        //input text for required fields
       // typeText(_email,loadProp.getProperty("friendemail"));
        //type personalised message
        typeText(By.id("PersonalMessage"),"This product is worth having a look, I hope you will like it.");
    }
    public void clickOnEmailButton(){
        //click on send email
        clickOnElement(By.xpath("//div[@class='buttons']/button"));

    }
}
