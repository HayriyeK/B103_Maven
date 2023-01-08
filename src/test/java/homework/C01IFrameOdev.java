package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01IFrameOdev extends TestBase {
    @Test
    public void odev() {
        //Bir class olusturun: IframeOdev
//https://the-internet.herokuapp.com/iframe  sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
//sayfadaki toplam iframe sayısını bulunuz.
        List<WebElement> iframe = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframe Sayisi = "+iframe.size());

//Sayfa basliginda 'Editor' yazını içerdiğini test edelim.
        //String window1Text = driver.findElement(By.xpath("//h3")).getText();
        String title = driver.findElement(By.xpath("//h3")).getText();
        String iceren = "Editor";
        Assert.assertTrue(title.contains(iceren));
//Paragrafdaki yaziyi silelim
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p[.='Your content goes here.']")).clear();


//Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
        driver.findElement(By.id("tinymce")).sendKeys("iframein icindeyim");

//Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test edelim
        driver.switchTo().parentFrame();
        String alttakiYazi = driver.findElement(By.xpath("//*[@style='text-align: center;']")).getText();
        String yaziIcinde = "Elemental Selenium";
        Assert.assertTrue(alttakiYazi.contains(yaziIcinde));


}
}
