package pages;

import base.BasePage;
import org.testng.Assert;
import utils.PlaywrightDriver;

import java.util.List;

public class ProductPage extends BasePage {

    public boolean verifyTheProductPageTitle(String expectedTitle){
        String actualTitle=page.locator(PlaywrightDriver.OR.getProperty("productPageTitle")).textContent();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
        return true;
    }

    public boolean verifyTheProductsNameWithPrice(List<String> productName){
        String productWithPriceSubA = productName.toString();
        String productWithPriceSub = productWithPriceSubA.split("\\[")[1];
        String subSt = productWithPriceSub.split("]")[0];
        String exProductName=subSt.split(",")[0];
        String exProductPrice=subSt.split(", ")[1];
        if (productName.contains("Sauce Labs Bike Light")) {
            String actualProductName = page.locator(PlaywrightDriver.OR.getProperty("productsName"))
                    .nth(1).textContent();
            System.out.println("actualProductName :- "+actualProductName);
            String actualProductPrice = page.locator(PlaywrightDriver.OR.getProperty("productPrice"))
                    .nth(1).textContent();
            Assert.assertEquals(actualProductName,exProductName);
            Assert.assertEquals(actualProductPrice,exProductPrice);
            return true;
        } else if (productName.contains("Sauce Labs Bolt T-Shirt")) {
            String actualProductName = page.locator(PlaywrightDriver.OR.getProperty("productsName"))
                    .nth(2).textContent();
            System.out.println("actualProductName :- "+actualProductName);
            String actualProductPrice = page.locator(PlaywrightDriver.OR.getProperty("productPrice"))
                    .nth(2).textContent();
            Assert.assertEquals(actualProductName,exProductName);
            Assert.assertEquals(actualProductPrice,exProductPrice);
            return true;
        } else if (productName.contains("Sauce Labs Onesie")) {
            String actualProductName = page.locator(PlaywrightDriver.OR.getProperty("productsName"))
                    .nth(4).textContent();
            System.out.println("actualProductName :- "+actualProductName);
            String actualProductPrice = page.locator(PlaywrightDriver.OR.getProperty("productPrice"))
                    .nth(4).textContent();
            Assert.assertEquals(actualProductName,exProductName);
            Assert.assertEquals(actualProductPrice,exProductPrice);
            return true;
        } else if (productName.contains("Sauce Labs Backpack")) {
            String actualProductName = page.locator(PlaywrightDriver.OR.getProperty("productsName"))
                    .nth(0).textContent();
            System.out.println("actualProductName :- "+actualProductName);
            String actualProductPrice = page.locator(PlaywrightDriver.OR.getProperty("productPrice"))
                    .nth(0).textContent();
            Assert.assertEquals(actualProductName,exProductName);
            Assert.assertEquals(actualProductPrice,exProductPrice);
            return true;
        } else if (productName.contains("Sauce Labs Fleece Jacket")) {
            String actualProductName = page.locator(PlaywrightDriver.OR.getProperty("productsName"))
                    .nth(3).textContent();
            System.out.println("actualProductName :- "+actualProductName);
            String actualProductPrice = page.locator(PlaywrightDriver.OR.getProperty("productPrice"))
                    .nth(3).textContent();
            Assert.assertEquals(actualProductName,exProductName);
            Assert.assertEquals(actualProductPrice,exProductPrice);
            return true;
        } else {
            String actualProductName = page.locator(PlaywrightDriver.OR.getProperty("productsName"))
                    .nth(5).textContent();
            System.out.println("actualProductName :- "+actualProductName);
            String actualProductPrice = page.locator(PlaywrightDriver.OR.getProperty("productPrice"))
                    .nth(5).textContent();
            Assert.assertEquals(actualProductName,exProductName);
            Assert.assertEquals(actualProductPrice,exProductPrice);
            return true;
        }

    }
}
