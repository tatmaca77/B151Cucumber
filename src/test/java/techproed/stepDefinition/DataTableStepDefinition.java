package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class DataTableStepDefinition {

    DataTablePage dataTablePage = new DataTablePage();
    @Then("kullanici sayfadaki tabloda new butonuna tiklar")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {
        dataTablePage.newButton.click();
    }

    @And("cikan pencerede verilen bilgiler girilir {string},{string},{string},{string},{string},{string},{string}")
    public void cikanPenceredeVerilenBilgilerGirilir(String name, String lastname, String position, String office, String extension, String date, String salary) {
        dataTablePage.firstName.sendKeys(name, Keys.TAB, lastname,Keys.TAB, position, Keys.TAB,office,Keys.TAB,extension,Keys.TAB,date,Keys.TAB,salary);
    }

    @And("kullanici create butonuna tiklar")
    public void kullaniciCreateButonunaTiklar() {
        dataTablePage.createButton.click();
    }

    @And("kullanici searchBox'a {string} bilgisini girer")
    public void kullaniciSearchBoxABilgisiniGirer(String data) {
        dataTablePage.searchBox.sendKeys(data);

    }

    @And("kullanici {string} ile basarili giris yapildigini dogrular")
    public void kullaniciIleBasariliGirisYapildiginiDogrular(String name) {
        Assert.assertTrue(dataTablePage.verify.getText().contains(name));
    }
}
