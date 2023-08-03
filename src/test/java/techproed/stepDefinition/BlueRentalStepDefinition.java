package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;

public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        blueRentalPage.loginButton.click();

    }

    @And("kullanici verilen kullanici bilgileri ile login olur")
    public void kullaniciVerilenKullaniciBilgileriIleLoginOlur(DataTable data) {
        blueRentalPage.emailBox.sendKeys(data.row(1).get(Integer.parseInt(ConfigReader.getProperty(String.valueOf(0)))));

    }
}
