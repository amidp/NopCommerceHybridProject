package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//create new class hooks
public class Hooks extends Utils{
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void setBrowser(){
        browserManager.openBrowser();
    }

    @After
    public void tearBrowser(Scenario scenario){
        //stick it in the report
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Myscreenshot");
        }
        browserManager.closeBrowser();
    }

}


