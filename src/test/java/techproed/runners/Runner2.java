package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        // rerun ile belirttigimiz dosyada fail olan senaryolar tutulur.
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition","techproed/hooks"},
        tags = "@negative",
        dryRun = false, // --> true seçersek scenarioları kontrol eder, browser'ı çalıştırmaz
        monochrome = false   // tek renk olarak konsolda gösterir. Kullanimi zorunlu degildir. False yaparsan renkli olur.
)


public class Runner2 {
}
