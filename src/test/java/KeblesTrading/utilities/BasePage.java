package KeblesTrading.utilities;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.qameta.allure.Allure;

public class BasePage extends TestBase   {

    public static List<Map<String, String>> testdata = null;
    public static int count;
    
   
    public void click(By ele) {
        try {
            waitForElement(ele, Integer.parseInt(prop.getProperty("explicitWait")), "ELEMENTTOBECLICKABLE");
            driver.findElement(ele).click();
        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }

    public boolean isChecked(By isEnabledView) {
        boolean ret = false;
        try {
            ret = driver.findElement(isEnabledView).isSelected();
        } catch (Exception e) {
            ret = false;
        }
        return ret;
    }

    public boolean waitForElement(By locator, long Seconds, String modeType) {
        scrollToView(driver, locator);
        WebElement elm = null;
        boolean flag = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Seconds));
            switch (modeType.trim().toUpperCase()) {
                case "PRESENCEOFELEMENTLOCATED":
                    elm = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                    break;
                case "VISIBILIITYOFELEMENTLOCATED":
                    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                    break;
                case "INVISIBILITYOFELEMENTLOCATED":
                    wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
                    break;

                case "ELEMENTTOBECLICKABLE":
                    elm = wait.until(ExpectedConditions.elementToBeClickable(locator));
                    break;
                case "ALERTISPRESENT":
                    wait.until(ExpectedConditions.alertIsPresent());
                    break;
                case "FRAMETOBEAVAILABLEANDSWITCHTOIT":
                    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
                    break;
                case "TWOWINDOWAVAILABLE":
                    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
                    break;
                case "ONEWINDOWAVAILABLE":
                    wait.until(ExpectedConditions.numberOfWindowsToBe(1));
                    break;
            }
            flag = true;
        } catch (Exception e) {
            // e.printStackTrace();
            flag = false;
        }
        return flag;
    }


    public boolean waitForElement(WebElement locator, Duration interval, String modeType) {
        WebElement elm = null;
        boolean flag = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, interval);
            switch (modeType.trim().toUpperCase()) {
                case "VISIBILIITYOFELEMENTLOCATED":
                    wait.until(ExpectedConditions.visibilityOf(locator));
                    break;
                case "INVISIBILITYOFELEMENTLOCATED":
                    wait.until(ExpectedConditions.invisibilityOf(locator));
                    break;
                case "ELEMENTTOBECLICKABLE":
                    elm = wait.until(ExpectedConditions.elementToBeClickable(locator));
                    break;
                case "STALENESS":
                    wait.until(ExpectedConditions.stalenessOf(locator));
                    break;
                case "ALERTISPRESENT":
                    wait.until(ExpectedConditions.alertIsPresent());
                    break;
                case "FRAMETOBEAVAILABLEANDSWITCHTOIT":
                    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
                    break;
                case "TWOWINDOWAVAILABLE":
                    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
                    break;
                case "ONEWINDOWAVAILABLE":
                    wait.until(ExpectedConditions.numberOfWindowsToBe(1));
                    break;
            }
            flag = true;
        } catch (Exception e) {
            // e.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public  boolean isElementPresent(By element) {
        boolean flag = false;
        try {
            if (driver.findElement(element).isDisplayed()) {
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public String getAttribute(By element, String attribute) {
        waitForElement(element, Integer.parseInt(prop.getProperty("explicitWait")), "VISIBILIITYOFELEMENTLOCATED");
        String value = driver.findElement(element).getAttribute(attribute);
        return value;
    }

    public boolean isElementVisible(By element) {
        boolean flag = false;
        try {
            waitForElement(element, Integer.parseInt(prop.getProperty("explicitWait")), "VISIBILIITYOFELEMENTLOCATED");
            flag = driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean isElementClickable(By element) {
        boolean flag = false;
        try {
            waitForElement(element, Integer.parseInt(prop.getProperty("explicitWait")), "ELEMENTTOBECLICKABLE");
            driver.findElement(element).click();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean isElementEnable(By element) {
        boolean flag = false;
        try {
            waitForElement(element, Integer.parseInt(prop.getProperty("explicitWait")), "ELEMENTTOBECLICKABLE");
            flag = driver.findElement(element).isEnabled();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean isElementSelected(By element) {
        boolean flag = false;
        try {
            waitForElement(element, Integer.parseInt(prop.getProperty("explicitWait")), "ELEMENTTOBECLICKABLE");
            flag = driver.findElement(element).isSelected();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean isElementClickable(WebElement element) {
        boolean flag = false;
        try {
//            waitForElement(element, Integer.parseInt(prop.getProperty("explicitWait")), "ELEMENTTOBECLICKABLE");
            element.click();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

     public static void DisplayOutputinReport(String heading, String actual) throws Exception {
        Allure.addAttachment(heading, actual);
    }

    public static void ScreenshotStep(String screenshotName) {
        try {
            Thread.sleep(700);
            InputStream screenshot = new ByteArrayInputStream(((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES));
            Allure.addAttachment(screenshotName, "image/png", screenshot, "png");
        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }
    
    //Creating a custom function for scrolling down
    public void scollDownByPixel(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

    }
    //Creating a custom function for scrolling Top
    public void scrollToTop() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)");
    }

    // Creating a custom function for highlighting text
    public void highLighterMethod(By element) throws InterruptedException {
        Thread.sleep(2000);
        WebElement ele = driver.findElement(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", ele);
    }

    // Creating a custom function for unhighlighting text
    public void unhighLighterMethod(By element) throws InterruptedException {
        Thread.sleep(2000);
        WebElement ele = driver.findElement(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('style','')", ele);
    }

    protected void javaScriptClick(By element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement ele = driver.findElement(element);
        executor.executeScript("arguments[0].click();", ele);
    }

    protected void scollDownUptoElement(By element) {
        WebElement ele = driver.findElement(element);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", ele);

    }

    protected void scrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    protected void scrollToView(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public void selectByVisibleText(By ele, String str) {
        try {
            waitForElement(ele, Integer.parseInt(prop.getProperty("explicitWait")), "ELEMENTTOBECLICKABLE");
            Select select = new Select(driver.findElement(ele));
            select.selectByVisibleText(str);
            Thread.sleep(4000);
        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }

    public int getCount(By ele) {
        return Integer.parseInt(driver.findElement(ele).getText().trim());
    }

    public int getSize(By ele) {
        int size = 0;
        size = driver.findElements(ele).size();
        log.info(size);
        return size;
    }

    public boolean checkCount(int count1, int count2) {
        boolean flag = false;
        if (count1 + 1 == count2) {
            flag = true;
        }
        return flag;
    }


    public void clearAndFillText(By ele, String str) {
        waitForElement(ele, Integer.parseInt(prop.getProperty("explicitWait")), "ELEMENTTOBECLICKABLE");
        driver.findElement(ele).clear();
        driver.findElement(ele).sendKeys(str);
    }

    public void clear(By ele) {
        driver.findElement(ele).clear();
    }

    public void fillText(By ele, String str) {
        driver.findElement(ele).sendKeys(str);
    }

    public boolean getAttributeValueAndCheck(By ele, String compare) {
        boolean flag = false;
        String actual = null;
        actual = driver.findElement(ele).getAttribute("value");
        if (actual != null) {
            log.info("actual : " + actual.trim());
            log.info("compare : " + compare.trim());

            if (actual.contains(compare.trim()) || compare.contains(actual.trim())) {
                flag = true;
            }
        }
        return flag;

    }

    public boolean getTextAndCheck(By ele, String compare) {
        boolean flag = false;
        String actual = driver.findElement(ele).getText().trim();
        log.info("actual : " + actual);
        log.info("compare : " + compare);

        if (actual.equalsIgnoreCase(compare)) {
            flag = true;
        }
        return flag;
    }

    public String getText(By ele) {

        String actual = driver.findElement(ele).getText().trim();
        System.out.println(actual);
        return actual;
    }

   
      public void setAttributeValue(String id, String attribute, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('" + id + "').setAttribute('" + attribute + "', '" + value + "')");
    }

    protected List<String> getOptionsOfSelect(By userType) {
        Select select = new Select(driver.findElement(userType));
        List<WebElement> lst = select.getOptions();
        List<String> optionList = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            optionList.add(lst.get(i).getText().trim());
        }
        return optionList;
    }
}
