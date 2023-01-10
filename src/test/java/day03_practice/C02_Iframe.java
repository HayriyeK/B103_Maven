package day03_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_Iframe extends TestBase {
    @Test
    public void test02() {
        // https://the-internet.herokuapp.com/iframe sayfasina gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
        // 'An iFrame containing the TinyMCE WYSIWYG Editor' basliginin erisilebilir oldugunu test edin ve konsolda yazdırın.
         WebElement baslik = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(baslik.isEnabled());
        System.out.println("BASLIK : "+baslik.getText());
        // TextBox'a 'Merhaba Dunya' yazin.
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).clear();
        driver.findElement(By.xpath("//p")).sendKeys("Merhaba Dunya");
        // TextBox'in altinda bulunan 'Elemental Selenium' linkinin gorunur oldugunu test edin ve konsolda yazdirin
        driver.switchTo().defaultContent();
       WebElement elementalSelenium =  driver.findElement(By.xpath("//a[.='Elemental Selenium']"));
       Assert.assertTrue(elementalSelenium.isDisplayed());
        System.out.println("ELEMENTAL SELENIUM : " + elementalSelenium.getText());


    }
}
