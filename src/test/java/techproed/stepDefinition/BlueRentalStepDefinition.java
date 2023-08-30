package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

import java.util.Map;

public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        blueRentalPage.loginButton.click();

    }

    @And("kullanici verilen kullanici bilgileri ile login olur")
    public void kullaniciVerilenKullaniciBilgileriIleLoginOlur(DataTable data) {
        blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB,data.row(1).get(1),Keys.ENTER);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        blueRentalPage.emailBox.sendKeys(data.row(2).get(0), Keys.TAB,data.row(2).get(1),Keys.ENTER);
        ReusableMethods.bekle(2);


    }

    @And("kullanici verilen bilgiler ile login olur")
    public void kullaniciVerilenBilgilerIleLoginOlur(DataTable data) {
        for (Map<String, String> w : data.asMaps()) {
            blueRentalPage.emailBox.sendKeys(w.get("email"),Keys.TAB,w.get("password"),Keys.ENTER);
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(2);
        }

    }

    @Given("kullanici {string} sayfasina properties ile gider")
    public void kullaniciStringSayfasinaPropertiesIleGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("kullanici excel'deki {string} sayfasindaki bilgiler ile giris yapip giris yapildigini test eder")
    public void kullaniciExcelDekiSayfasindakiBilgilerIleGirisYapipGirisYapildiginiTestEder(String sayfaIsmi) {
        String dosyaYolu = "src/test/resources/mysmoketestdata (1).xlsx";
        ExcelReader excelReader = new ExcelReader(dosyaYolu,sayfaIsmi);
        for (int i = 1; i < excelReader.rowCount() ; i++) {
            String email = excelReader.getCellData(i,0);
            String password = excelReader.getCellData(i,1);
            blueRentalPage.loginButton.click();
            ReusableMethods.bekle(2);
            blueRentalPage.emailBox.sendKeys(email,Keys.TAB,password,Keys.ENTER);
            ReusableMethods.bekle(2);
            blueRentalPage.loginButton2.click();
            ReusableMethods.bekle(2);
            blueRentalPage.profileButton.click();
            ReusableMethods.bekle(2);
            Assert.assertEquals(blueRentalPage.profileMail.getText(),email);
            ReusableMethods.bekle(2);
            blueRentalPage.loginButton2.click();
            ReusableMethods.bekle(2);
            blueRentalPage.logoutButton.click();
            ReusableMethods.bekle(2);
            blueRentalPage.okButton.click();
            ReusableMethods.bekle(2);

        }

    }
}
