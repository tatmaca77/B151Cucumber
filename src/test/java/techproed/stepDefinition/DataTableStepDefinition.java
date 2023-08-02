package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import techproed.pages.DataTablePage;

public class DataTableStepDefinition {

    DataTablePage dataTablePage = new DataTablePage();
    @Then("kullanici sayfadaki tabloda new butonuna tiklar")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {
        dataTablePage.newButton.click();
    }


    @And("cikan pencerede verilen bilgiler girilir {string},{string},{string},{string},{string},{string},{string}")
    public void cikanPenceredeVerilenBilgilerGirilir(String name, String lastname, String position, String office, String extension, String date, String salary) {
    }
}
