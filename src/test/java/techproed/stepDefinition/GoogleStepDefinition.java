package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GoogleStepDefinition {

    GooglePage googlePage = new GooglePage();

    @Given("kullanici {string} sayfasina gitti")
    public void kullaniciSayfasinaGitti(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici google arama kutusunda {string} aratir")
    public void kullaniciGoogleAramaKutusundaAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(arac, Keys.ENTER);
    }

    @And("google sayfasinda basligin {string} icerdigini test eder")
    public void googleSayfasindaBasliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }

    @Then("kullanici cikan cerezi kabul eder")
    public void kullaniciCikanCereziKabulEder() {
        ReusableMethods.bekle(2);
        googlePage.cerez.click();
    }
}
