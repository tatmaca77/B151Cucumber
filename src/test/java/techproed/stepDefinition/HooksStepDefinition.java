package techproed.stepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;


public class HooksStepDefinition {
    /**
         Hooks class'in kullanim amaci scenariolardan önce ya da sonra calismasini istedigimiz kodlari belirttigimiz class'tir.
       Bunu @Before ve @After notasyonlarina sahip methodlar ile yapariz.
       Bu notasyonlarin import'u io.cucumber'dan olmalidir.
         Bu class'in scenario'lar tarafindan görülüp burdaki @Before, @After methodlarini isleme alabilmesi icin
       Hooks Class'ini farkli bir package da olusturmak istersek Runner Class'indaki glue parametresine bu package'i
       tanimlamamiz gereklidir. Ancak Hooks Class'ini direkt stepDefiniton package'i altinda olusturursak Runner Class'indaki glue
       parametreside stepDefiniton package'i tanimli oldugu icin baska bir islem yapmaya gerek kalmaz. Glue parametresinde
       stepDefiniton package'i tanimli oldugu icin direkt hook class'inda kullanabiliriz.
     */


    @Before // import io.cucumber.java.Before;
    public void setUp() throws Exception {
        System.out.println("Scenariolar calismaya basladi.");
    }

    @Before("@arac2")
    public void setUp2() {
        System.out.println("Google'da Ford aratildi");
    }

    @Before("@arac3")
    public void setUp3() {
        System.out.println("Google'da Audi aratildi");
    }

    /**
       Scenario'dan önce calismasini istedigimiz @Before methodunun notasyonuna parametre olarak scenario'ya tanimladigimiz
       tag'i belirtebiliriz. Dolayisiyla sadece parametre olarak belirttigimiz @Before methodu Scenario'dan önce calisacaktir.
     */

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) { // -> Scenario fail olursa
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg","scenario_" + scenario.getName());
        }
        Driver.closeDriver();
    }
    /** Bu method fail olan scenario'larda fail olan kismin resmini rapora ekleyecektir. */
}
