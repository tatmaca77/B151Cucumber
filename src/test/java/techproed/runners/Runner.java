package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
Runner class'ı testNG deki .xml file kullanımındaki gibi istediğimiz scenario lari kullanacağımız tag parametresi
sayesinde çalıştırabiliriz. Ve plugin parametresi ile raporlar alabiliriz
 */
@RunWith(Cucumber.class)//-->Test çalıştırıcı Notasyon
@CucumberOptions(plugin = {"pretty",  // pretty kullaniminda konsolda detayli olarak tüm adimlari rapor halinde görürüz.
                           "html:target/default-cucumber-reports.html",
                           "json:target/json-reports/cucumber.json", // bu 3 cesit rapor verir. json junit dev icin ilki tester icin. Target altinda raporlar.
                           "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@tech",    // Burda SQL'deki gibi and or ayrimini biliyoruz. and dersen olmaz or olur.
        dryRun = false, //-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = false   // tek renk olarak konsolda gösterir. Kullanimi zorunlu degildir. False yaparsan renkli olur.
)

public class Runner {
}
/**
@CucumberOptions() notasyonuna parametre olarak
            features--> packege'ın yolunu  // Yolunu alirken Content Root
            glue-->stepdefinition package   // Yolunu alirken Source Root
            tag-->çalıştırmak istediğimiz scenariolari burda belirtiriz. O senaryonun üzerine @techpro yazariz.
    Scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı seçanekleri bu notasyonda
belirtiriz
 */