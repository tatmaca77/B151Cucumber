package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefinition {
    TechproPage techproPageage = new TechproPage();

    @Given("kullanici techpro sayfasina gider")
    public void kullaniciTechproSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));

    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        techproPageage.searchBox.sendKeys("qa", Keys.ENTER);


    }

    @And("sayfa basliginin qa icerdigini test eder")
    public void sayfaBasligininQaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("qa"));

    }

    @Then("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        techproPageage.searchBox.sendKeys("java", Keys.ENTER);
    }

    @And("sayfa basliginin java icerdigini test eder")
    public void sayfaBasligininJavaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("java"));
    }

    @Then("arama kutusunda mobile aratir")
    public void aramaKutusundaMobileAratir() {
        techproPageage.searchBox.sendKeys("mobile");
    }

    @When("cikan dropdown da mobile developer linkine tiklar")
    public void cikanDropdownDaMobileDeveloperLinkineTiklar() {
        ReusableMethods.bekle(2);
        techproPageage.mobileLink.click();
        ReusableMethods.bekle(2);

    }

    @And("sayfa basliginin Mobile icerdigini test eder")
    public void sayfaBasligininMobileIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }

    @Given("kullanici {string} url sayfasina gider")
    public void kullaniciSayfasinaGider2(String url) {   // File feature'dan gelen https://trchpro.com gelmis olacak.
        Driver.getDriver().get(url);
    }

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String arananUrun) {
        techproPageage.searchBox.sendKeys(arananUrun);   // feature File'dan ne gelirse onu aratacak
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider3(String url) {
        Driver.getDriver().get(url);
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }
}
