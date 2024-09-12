package US_104;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0403 extends BaseDriver {
/*  1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
    2. Kullanıcı ana sayfada "Giriş Yap" veya benzer bir seçeneği bulur ve tıklar.
    3. Kullanıcı, geçersiz verileri girer:
    E-posta: Invalid username (geçersiz username)
    Şifre: Geçerli şifre
    6. "Giriş Yap" butonuna tekrar tıklar. */

    @Test
    public void Test1(){
        driver.get("https://www.akakce.com/");
        WebElement girisYap = driver.findElement(By.xpath("(//a[@rel='nofollow'][text()='Giriş Yap'])[1]"));
        girisYap.click();   //akakce.com'a giriş yapıldı
        MyFunc.Bekle(3);

        WebElement ePosta = driver.findElement(By.xpath("//input[@id='life']"));
        ePosta.click();
        ePosta.sendKeys("sdet_team_105@hotmail.com");    //eposta kutucuğuna geçersiz mail adresi girildi
        MyFunc.Bekle(3);

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.click();          // şifre kutucuğuna tıklandı
        sifre.sendKeys("Sdet12345*");   //şifre kısmına doğru şifre girildi
        MyFunc.Bekle(3);

        WebElement girisYapp = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYapp.click();      // Giriş yap butonuna tıklandı
        MyFunc.Bekle(3);

        BekleKapat();

    }
}
