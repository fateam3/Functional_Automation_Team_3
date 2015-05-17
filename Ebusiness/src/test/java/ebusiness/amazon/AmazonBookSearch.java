package ebusiness.amazon;

import homeFeatures.AmazonBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by shamimchy on 5/17/15.
 */
public class AmazonBookSearch extends AmazonBase {
    @Test
    public void testAmazon() throws Exception {
       // driver.get(baseUrl + "/");
        driver.findElement(By.id("twotabsearchtextbox")).clear();
      //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
     //   driver.findElement(By.cssSelector("input.nav-input")).click();
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java programming book");
        driver.findElement(By.cssSelector("input.nav-input")).click();
        driver.findElement(By.xpath("//li[@id='result_0']/div/div/div/div[2]/div[2]/div/div[2]/a/span")).click();
      //  driver.findElement(By.linkText("33 New")).click();
      //  driver.findElement(By.name("submit.addToCart")).click();
        driver.findElement(By.cssSelector("img[alt=\"Head First Java, 2nd Edition\"]")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#nav-cart")).click();
        driver.findElement(By.id(".nav-action-inner")).click();
        driver.findElement(By.name("proceedToCheckout")).click();
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
        driver.findElement(By.cssSelector("input.nav-input")).click();
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java programming book");
        driver.findElement(By.cssSelector("input.nav-input")).click();
        driver.findElement(By.xpath("//li[@id='result_0']/div/div/div/div[2]/div[2]/div/div[2]/a/span")).click();

    }

}
