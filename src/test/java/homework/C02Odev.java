package homework;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class C02Odev extends TestBase {
    @Test
    public void odev() {


//    https://testcenter.techproeducation.com/index.php?page=multiple-windows

 driver.get("https://testcenter.techproeducation.com/index.php?page=multiple-windows");

//    Title in ‘Windows’ oldugunu test edin
        String actualTitle = driver.getTitle();
        String expectedTitle ="Windows";
        Assert.assertEquals(actualTitle,expectedTitle);
//    Click here a tiklayin
        driver.findElement(By.xpath("//*[.='Click Here']")).click();
        String window1 = driver.getWindowHandle();

//    Sonra açılan sayfadaki title in ‘New Window’ oldugunu dogrulayin
         //1.yol yeni sayfaya gecis yapmak
        Set<String> allWindowHandles = driver.getWindowHandles();//{window1handle, window2handle}
        System.out.println(allWindowHandles);
        for (String eachHandle : allWindowHandles){
//            eger listedeki id window1 e esit degilse, otomatik olarak window 2 ye esittir
            if (!eachHandle.equals(window1)){
                driver.switchTo().window(eachHandle);//Burdaki eachHandle window2 handle ina esittir.
            }
        }
          //2. yol yeni sayfaya gecis yapmak
        List<String> list = new ArrayList<>(driver.getWindowHandles());
         driver.switchTo().window(list.get(1));
         //3.yol methodla yeni sayfaya gecis yapmak
       // switchToWindow(1);

        String actualTitle1 = driver.getTitle();
        System.out.println(actualTitle1);
        String expectedTitle1 ="New Windows";
        waitFor(2);
        Assert.assertEquals(actualTitle1,expectedTitle1);

    }
}