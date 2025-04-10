package base;

import com.microsoft.playwright.Page;
import org.testng.Assert;
import utils.PlaywrightDriver;

public class BasePage {
    public static Page page;
    public BasePage(){
        page= PlaywrightDriver.getPage();
    }

    public void click(String locatorKey){
       try{
           page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).click();
       }catch (Throwable t){
           Assert.fail(t.getMessage());
       }
    }
    public String getText(String locatorKey){
        String text="";
        try {
            text=page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).innerText();
        } catch (Throwable t){
            Assert.fail(t.getMessage());
        }
        return text;
    }
    public void type(String locatorKey, String value) {
        try {
            page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).fill(value);
        } catch (Throwable t) {

            Assert.fail(t.getMessage());
        }
    }

    public boolean isElementPresent(String locatorKey) {

        try {
            page.waitForSelector(
                    PlaywrightDriver.OR.getProperty(locatorKey),
                    new Page.WaitForSelectorOptions().setTimeout(2000));

            return true;
        } catch (Throwable t) {

            return false;
        }
    }
}
