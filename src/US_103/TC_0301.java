package US_103;
import Utility.BaseDriver;                      import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;                          import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;    import org.openqa.selenium.support.ui.Select;
public class TC_0301 extends BaseDriver {
    /*  1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
        2. Kullanıcı giriş yapma sayfasına geçiş yapabileceği "Giriş Yap" linkini görmeli ve tıklayabilmelidir.
        3. Kullanıcı geçerli kullanıcı adı ve şifreyle hesabına başarılı bir şekilde giriş yapar.
        4. Kullanıcı, sayfanın sağ üst köşesinde yer alan "Çıkış Yap" veya benzer bir seçeneğe tıklar.
        5. Oturumu kapatma işlemi başarılı bir şekilde tamamlandığında, kullanıcı giriş yapma sayfasına yönlendirilir. */
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
        sifre.click();          // şifre kutucuğuna tıklandı
        sifre.sendKeys("12345Sdet*");   //şifre kısmına doğru şifre girildi
        MyFunc.Bekle(3);

        WebElement girisYapp = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYapp.click();      // Giriş yap butonuna tıklandı
        MyFunc.Bekle(3);

        WebElement testUser = driver.findElement(By.xpath("//A[@rel='nofollow'][text()='TestUser']"));
        Actions hareket = new Actions(driver);
        hareket.moveToElement(testUser).perform();
        MyFunc.Bekle(3);
        WebElement cikis = driver.findElement(By.xpath("//a[@href='#Çık'][text()='Çık']"));
        cikis.click();
        MyFunc.Bekle(3);

        BekleKapat();
    }   }

