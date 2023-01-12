
          package ahmetHoca.day07;
          import org.junit.Assert;
          import org.junit.Test;
          import utilities.TestBase;
public class C01_TestBaseDemo extends TestBase {
    //    TestBase i abstract yapmamizin sebebi bu sinifin objesini olusturmak istemiyorum
//    TestBase testBase = new TestBase(); -> YAPILAMAZ
//    Amacim bu sinifi extend etmek ve icindeki hazir metodlari kullanmak

//    driver objesini olustur. Driver ya public yada protected olmali.
//    Sebepi child classlarda gorulebilir olmasi

    /*
    UTILITIES:
    -Utilities tekrar takrar kullanacagimiz classlari koydugumuz paketin adidir
        - TestBase -> BUGUN
        - Driver -> Sonra
        - ExcelUtil -> Sonra
        - Configuration -> Sonra
    -Utilities paketinde Test case ler yazilmaz
    -Sadece Tekrar kullanilabilecek desdek siniflari(support class) olusturulur.
    -Bu support classlar test caseslerin yazilmasini hizlandirir

     */
    @Test
    public void test1(){
//        techproeducation ana sayfasina git 
        driver.get("https://www.techproeducation.com");

//        ve titlein 'Bootcamps' kelimesini icerdigini test edelim
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Bootcamps"));
    }
}