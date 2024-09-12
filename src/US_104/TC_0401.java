package US_104;
import Utility.MyFunc;
import org.junit.Test;
import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0401 extends BaseDriver {
   /*       1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
            2. Kullanıcı ana sayfada "Giriş Yap" veya benzer bir seçeneği bulur ve tıklar.
            3. Kullanıcı, test datada verilen geçerli bilgileri girer:
            4. "Giriş Yap" butonuna tıklar. */
    @Test
    public void Test1()
    {
        driver.get("https://www.akakce.com/");
        WebElement girisYap = driver.findElement(By.xpath("(//a[@rel='nofollow'][text()='Giriş Yap'])[1]"));
        girisYap.click();   //akakce.com'a giriş yapıldı
        MyFunc.Bekle(3);

        WebElement ePosta = driver.findElement(By.xpath("//input[@id='life']"));
        ePosta.click();
        ePosta.sendKeys("sdet_team_10@hotmail.com");    //eposta kutucuğuna mail adresi girildi
        MyFunc.Bekle(3);

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.click();          // şifre kutucuğuna tıklandı
        sifre.sendKeys("12345Sdet*");   //şifre kısmına doğru şifre girildi
        MyFunc.Bekle(3);

        WebElement girisYapp = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYapp.click();      // Giriş yap butonuna tıklandı
        MyFunc.Bekle(3);

        BekleKapat();

    }

}
