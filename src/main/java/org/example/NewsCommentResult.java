package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

//create class news comment result for required actions to perform
public class NewsCommentResult extends Utils{
   // By commentList=By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[4]");
    By commentList=By.xpath("//div[@class='comment-list']");
    public void userShouldBeAbleToAddNewsComment(){
        String actualResult = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedResult = "News comment is successfully added.";
        //verifying the actual requirement and check if test case is pass or fail
        Assert.assertTrue(actualResult.equals(expectedResult),"News comment is not added.");
    }
    public void verifyAllRequiredFields() {
         Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'New online store is open!')]")).getText().equals("New online store is open!"));
         Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Leave your comment')]")).getText().equals("Leave your comment"));
    }
    public void verifyAddedCommentIsLast() {
        List<String> currentOptions = new ArrayList<>();
        WebElement select = driver.findElement(commentList);
        List<WebElement> matches = select.findElements(By.xpath("//div[@class=\"comment news-comment\"]"));
        WebElement lastComment =matches.get(matches.size()-1);
        Assert.assertTrue(lastComment.getText().contains("This website is very useful."));
         System.out.println(lastComment.getText());
       // Assert.assertEquals(lastComment.getText(),loadProp.getProperty("expectedCommentResult"),"Comment is not on correct position");

    }

    }

