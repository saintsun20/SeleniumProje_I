package US_102;
import Utility.BaseDriver;                      import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;                          import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;          import org.openqa.selenium.support.ui.Select;
public class TC_0201 extends BaseDriver {
/*  1. Kullanıcı, Akakce.com sitesine tarayıcı üzerinden giriş yapar.
    2. Ana sayfada, sağ üst köşede bulunan "Giriş Yap" seçeneğine tıklar.
    3. Kullanıcı, kullanıcı adı ve şifresini doğru bir şekilde girer.
    4. "Giriş Yap" butonuna tıklar.
    5. Kullanıcı, başarılı bir şekilde giriş yapar.
    6. Sağ üst köşede kullanıcı adının görüntülendiği alana bakar ve bu kullanıcı adının, giriş yapılırken girilen kullanıcı adı ile aynı olup olmadığını kontrol eder.
    7. Eğer kullanıcı adı doğru görünüyorsa, hesap doğrulama sürecinin başarıyla tamamlandığını onaylar. */
    @Test public void Test1() {
        driver.get("https://www.akakce.com/");
        WebElement girisYap = driver.findElement(By.xpath("(//a[@rel='nofollow'][text()='Giriş Yap'])[1]"));
        girisYap.click();
        MyFunc.Bekle(3); //akakce.com'a giriş yapıldı

        WebElement ePosta = driver.findElement(By.xpath("//input[@id='life']"));
        ePosta.click();
        ePosta.sendKeys("sdet_team_10@hotmail.com");
        MyFunc.Bekle(3);    //eposta kutucuğuna mail adresi girildi

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.click();
        sifre.sendKeys("12345Sdet*");
        MyFunc.Bekle(3);    //şifre kısmına doğru şifre girildi

        WebElement girisYapp = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYapp.click();
        MyFunc.Bekle(3);    // Giriş yap butonunatıklandı

        WebElement testUser = driver.findElement(By.xpath("//A[@rel='nofollow'][text()='TestUser']"));
        Assert.assertTrue("Kullanıcı Adı Görüntülememedi", testUser.getText().contains("TestUser"));
        MyFunc.Bekle(3);    // açılan sayfada kullanıcı adının doğru bir şekilde görülüp görülmediği test edildi

        BekleKapat();   // kapatıldı
    }
}
