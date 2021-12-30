package org.example;
import org.openqa.selenium.By;

import static org.example.Utils.typeText;

//create new class newscomment page for news comeent requirement
public class NewsCommentPage extends HomePage
{
        //create object for relevant actions
        By _titleType = By.id("AddNewComment_CommentTitle");
        By _commentType =By.id("AddNewComment_CommentText");
       // By _clickOnNewComment = By.xpath("//div[@class='buttons']/button");
        By _newcomment=By.xpath("//button[contains(text(),'New comment')]");
        public void userShouldBeAbleToAddCommentSuccessfully(){
            typeText(_titleType,"This is new comment.");
            typeText(_commentType,"This website is very useful.");
          //  clickOnElement(_clickOnNewComment);
            clickOnElement(_newcomment);
        }
 }


