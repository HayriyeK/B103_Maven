package erolHoca.practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P11_UploadFile extends TestBase {
    @Test
    public void name() {

    //https://demo.guru99.com/test/upload/ adresine gidiniz
    driver.get("https://demo.guru99.com/test/upload/");
    //Bilgisayarınızdan herhangi bir dosyayı upload ediniz
        //"C:\Users\İbrahim\Desktop\logo.jpeg"
//        String anaYol = System.getProperty("user.home");//C:\Users\İbrahim
//        String ortakYol = "Desktop\\logo.jpeg";
//        String dosyaYolu =anaYol+ortakYol;

        String dosyaYolu = "C:\\Users\\İbrahim\\Desktop\\logo.jpeg";

        WebElement dosyaSec = driver.findElement(By.id("uploadfile_0"));
        dosyaSec.sendKeys(dosyaYolu);


    // I accept terms of service bölümünü tikleyin
    // Submit File buttonuna basınız
        WebElement checkBox = driver.findElement(By.xpath("//*[@id='terms']"));
        checkBox.click();
        checkBox.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);


    // "1 file has been successfully uploaded" görünür olduğunu test edin
        waitFor(2);
       assert  driver.findElement(By.xpath("//*[@id='res']")).isDisplayed();
}
}
