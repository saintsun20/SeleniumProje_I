package US_107;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_0702 extends BaseDriver {
    /*
1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
2. Kullanıcı ana sayfada "Giriş Yap" veya benzer bir seçeneği bulur ve tıklar.
3. Kullanıcı,test datadaki geçerli bilgileri girer:
4. "Giriş Yap" butonuna tıklar.
5. Kullanıcı hesabına başarılı bir şekilde giriş yapar.
6. Kullanıcı, hesap ayarları veya profil bölümünden "Hesabımı Sil" veya benzer bir seçeneğe tıklar.
7. Hesap silme işlemi sırasında, geçersiz bir şifre girer ve işlemi tamamlamaya çalışır.
     */
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

        WebElement testUser = driver.findElement(By.xpath("//a[@rel='nofollow'][text()='TestUser']"));
        Actions hareket = new Actions(driver);
        hareket.moveToElement(testUser).perform();
        MyFunc.Bekle(3);

        WebElement hesabım = driver.findElement(By.xpath("//a[@rel='nofollow'][text()='Hesabım']"));
        hesabım.click();
        MyFunc.Bekle(3);

        WebElement hesabimiSil = driver.findElement(By.xpath("//a[@href='/akakcem/kullanici-bilgilerim/uyelik-iptali/'][text()='Hesabımı Sil']"));
        hesabimiSil.click();
        MyFunc.Bekle(3);

        WebElement silmeSifresi = driver.findElement(By.xpath("//INPUT[@id='p']"));
        silmeSifresi.click();
        silmeSifresi.sendKeys("Abcd6789*");
        MyFunc.Bekle(3);

        BekleKapat();
    }
}
