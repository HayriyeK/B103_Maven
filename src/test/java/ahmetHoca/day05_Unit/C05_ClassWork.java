package ahmetHoca.day05_Unit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import java.time.Duration;

public class C05_ClassWork {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
       driver.close();

    }
    @Test
    public void test01(){
   //       Verilen web sayfasına gidin.
        //    https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //    Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox1 =driver.findElement(By.xpath("//*[@type'checkbox'][1]"));
        WebElement checkbox2 =driver.findElement(By.xpath("//*[@type'checkbox'][2]"));
        //    Checkbox1 seçili değilse onay kutusunu tıklayın

        //    Checkbox2 seçili değilse onay kutusunu tıklayın

    }
}
