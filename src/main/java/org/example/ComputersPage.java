package org.example;
import org.openqa.selenium.By;

//create new class computer page for new page
    public class ComputersPage extends Utils
{
    public void clickOnTheDesktopButton()
    {
        clickOnElement(By.linkText("Desktops"));
    }
}
