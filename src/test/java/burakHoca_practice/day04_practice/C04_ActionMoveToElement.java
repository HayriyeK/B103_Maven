package burakHoca_practice.day04_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C04_ActionMoveToElement extends TestBase {
    @Test
    public void test04() {
// https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");
        // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
        Actions actions = new Actions(driver);

        WebElement dilMenusu = driver.findElement(By.xpath("//*[text()='EN']"));
        actions.moveToElement(dilMenusu).perform();
        // Change country/region butonuna basiniz
        driver.findElement(By.xpath("//selec[@id='icp-dropdown']")).click();
        // United States dropdown'undan 'Turkey (Türkiye)' seciniz
        WebElement drop = driver.findElement(By.xpath("//*[@class='a-dropdown-prompt']"));
        Select select = new Select(drop);
        select.selectByVisibleText("Turkey (Türkiye)");

        driver.findElement(By.xpath("//span[text()='Changing country/region website']")).click();



        // Go to website butonuna tiklayiniz
        driver.findElement(By.xpath("//*[@id='icp-save-button']")).click();

        // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz
    }
}
