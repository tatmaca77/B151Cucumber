package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TechproStepDefinition {
    @Given("kullanici techpro sayfasina gider")
    public void kullaniciTechproSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));

    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        TechproPage techproPageage = new TechproPage();
        techproPageage.searchBox.sendKeys("qa", Keys.ENTER);


    }

    @And("sayfa basliginin qa icerdigini test eder")
    public void sayfaBasligininQaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("qa"));

    }

}
