package ahmetHoca.day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions1 extends TestBase {
    @Test
    public void rightClick(){
   //     https://the-internet.herokuapp.com/context_menu  sitesine gidin
   driver.get("https://the-internet.herokuapp.com/context_menu");
  //      1.ACTİONS OBJESİ OLUSTUR
        Actions actions = new Actions(driver);
  //      2.ELEMENT I LOCATE EDELİM
        WebElement kutu =driver.findElement(By.id("hot-spot"));
  //    Kutuya sag tıklayın

        actions.contextClick(kutu).perform();
        driver.switchTo().alert().getText();
  //    Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());

  //    Tamam diyerek alert’i kapatın
        driver.switchTo().alert().accept();
    }




}
