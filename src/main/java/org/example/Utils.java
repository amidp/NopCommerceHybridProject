package org.example;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//create new class utils
public class Utils extends BrowserManager{

    //screenshot method
    public static void captureScreenshot(String fileName){
        TakesScreenshot scrshot = ((TakesScreenshot) driver);
        File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/test/java/Screenshots/"+fileName+currentTimeStamp()+".png");
        try {
            FileUtils.copyFile(srcFile,destFile);
            }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void verifyCurrentURL(String url_name){
        Assert.assertTrue(driver.getCurrentUrl().equals(url_name));

    }
    public static void selectByVisibleText(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectByIndex(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static void selectByValue(By by,String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void waitForClickable(By by,int timeInSeconds)
    {
        org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitForVisible(By by,int timeInSeconds)
    {
        org.openqa.selenium.support.ui.WebDriverWait wait = new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static String currentTimeStamp()
    {
        Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }
}
