package org.example.utility;

import org.apache.commons.io.FileUtils;
import org.example.driverfactory.ManageDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utility extends ManageDriver {
   //  * This method will be used to hover mouse on element
    public void mouseHoverToElement(WebElement element) {
        new Actions(driver).moveToElement(element).build().perform();
    }
    //   * This method will be used to hover mouse on element and click
    public void mouseHoverToElementAndClick(WebElement element) {
        new Actions(driver).moveToElement(element).click().build().perform();
    }
    public void clickOnElement(WebElement element) {
        element.click();
    }
    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }
    public void selectByIndexFromDropDown(WebElement element, int index) {
        new Select(element).selectByIndex(index);
    }
    public void selectByVisibleTextFromDropDown(WebElement element, String text) {
        new Select(element).selectByVisibleText(text);
    }


    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/org/example/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
