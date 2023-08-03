package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

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
}
