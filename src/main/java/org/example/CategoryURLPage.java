package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//create Category URL page as per pom model
public class CategoryURLPage extends Utils {
    //variable locator for category title
    By _categoryPageTitle = By.xpath("//h1");
   //method as per requirement
   public void verifyCategoryTitle(String text){
        Assert.assertEquals(driver.findElement(_categoryPageTitle).getText(),text);
   }

}
