package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.example.Utils.currentTimeStamp;

//create Browser Manager class
public class BrowserManager extends BasePage
{
    LoadProp loadProp = new LoadProp();
    //methods from Browser Stack
    public static final String AUTOMATE_USERNAME = "amipatel_OLbjwX";
    public static final String AUTOMATE_ACCESS_KEY = "swrMELyxZW1TYarysfRE";
    public static final String BrowserStack = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    DesiredCapabilities caps = new DesiredCapabilities();
    //create object for browser name
    public String browserName="chrome";
    //public String browserName=System.getProperty("browser");
    boolean cloud = false;
   // boolean cloud = Boolean.parseBoolean(System.getProperty("true"));
    boolean browserStackUrl = Boolean.parseBoolean(System.getProperty("cloud"));

public void openBrowser()
{
    //  if cloud condition true - run in cloud
    //  if (browserName.equalsIgnoreCase("chrome"))
    if (browserStackUrl)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "latest");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.14.0");
            // System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
            // driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge"))
        {
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "IE");
            caps.setCapability("browser_version", "11.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            //System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
            // driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("firefox"))
        {
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Firefox");
            caps.setCapability("browser_version", "latest-beta");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");

            // System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");
            //driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser....!");
        }
        try
        {
            driver= new RemoteWebDriver(new URL(BrowserStack),caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }else

    if(browserName.equalsIgnoreCase("chrome"))
    {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        driver=new ChromeDriver();
    }else if (browserName.equalsIgnoreCase("edge"))
    {
        System.setProperty("webdriver.edge.driver","src/test/java/drivers/msedgedriver.exe");
        driver=new EdgeDriver();
    }else if (browserName.equalsIgnoreCase("firefox"))
    {
        System.setProperty("webdriver.gecko.driver","src/test/java/drivers/geckodriver.exe");
        driver=new FirefoxDriver();
    }else {
        System.out.println("your Browser is Wrong");
    }

    driver.manage().window().maximize();
    //type url link
    driver.get(loadProp.getProperty("url"));

    System.out.println(currentTimeStamp());
        //applying conditional loop for different browser options


    }

    //close browser
    public void closeBrowser ()
    {
        driver.close();
    }


}
