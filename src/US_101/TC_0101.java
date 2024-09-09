package US_101;
import Utility.BaseDriver;                      import Utility.MyFunc;
import org.junit.Test;                          import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;          import org.openqa.selenium.support.ui.Select;
public class TC_0101 extends BaseDriver {
        @Test   public void Test1() {
         driver.get("https://www.akakce.com/");
         WebElement createAccount = driver.findElement(By.xpath("(//A[@rel='nofollow'][text()='Hesap Aç'])[1]"));
         createAccount.click();
         MyFunc.Bekle(2);

         WebElement adi = driver.findElement(By.xpath("//input[@id='rnufn']"));
         adi.click();
         adi.sendKeys("TestUser");
         MyFunc.Bekle(2);

         WebElement soyAdi = driver.findElement(By.xpath("//input[@id='rnufs']"));
         soyAdi.click();
         soyAdi.sendKeys("Tester");
         MyFunc.Bekle(2);

         WebElement ePosta = driver.findElement(By.xpath("//INPUT[@id='rnufe1']"));
         ePosta.click();
         ePosta.sendKeys("sdet_team_10@hotmail.com");
         MyFunc.Bekle(2);

         WebElement ePostaTkr = driver.findElement(By.xpath("//INPUT[@id='rnufe2']"));
         ePostaTkr.click();
         ePostaTkr.sendKeys("sdet_team_10@hotmail.com");
         MyFunc.Bekle(2);

         WebElement sifre = driver.findElement(By.xpath("//input[@id='rnufp1']"));
         sifre.click();
         sifre.sendKeys("12345Sdet*");
         MyFunc.Bekle(2);

         WebElement sifreTkr = driver.findElement(By.xpath("//input[@id='rnufp2']"));
         sifreTkr.click();
         sifreTkr.sendKeys("12345Sdet*");
         MyFunc.Bekle(2);

         WebElement cinsiyet = driver.findElement(By.xpath("//input[@id='rngf']"));
         cinsiyet.click();
         MyFunc.Bekle(2);

         WebElement gun = driver.findElement(By.xpath("//select[@id='bd']"));
         gun.click();
         Select secimGun = new Select(gun);
         secimGun.selectByValue("1");
         MyFunc.Bekle(2);

         WebElement ay = driver.findElement(By.xpath("//select[@id='bm']"));
         ay.click();
         Select secilenAy = new Select(ay);
         secilenAy.selectByValue("1");
         MyFunc.Bekle(2);

         WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));
         yil.click();
         Select secilenYil = new Select(yil);
         secilenYil.selectByValue("1990");
         MyFunc.Bekle(2);

         WebElement il = driver.findElement(By.xpath("//select[@id='locpr']"));
         il.click();
         Select secilenIl = new Select(il);
         secilenIl.selectByValue("34");
         MyFunc.Bekle(2);

         WebElement ilce = driver.findElement(By.xpath("//select[@id='locds']"));
         ilce.click();
         Select secilenIlce = new Select(ilce);
         secilenIlce.selectByValue("429");
         MyFunc.Bekle(2);

         WebElement onay1 = driver.findElement(By.xpath("//input[@id='rnufpca']"));
         onay1.click();
         MyFunc.Bekle(3);

         WebElement onay2 = driver.findElement(By.xpath("//INPUT[@id='rnufnee']"));
         onay2.click();
         MyFunc.Bekle(3);

         WebElement hesapAc = driver.findElement(By.xpath("//input[@id='rfb']"));
         hesapAc.click();
         MyFunc.Bekle(3);

         BekleKapat();

    }
}
