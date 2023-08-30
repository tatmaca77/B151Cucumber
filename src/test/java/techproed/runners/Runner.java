package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
Runner class'ı testNG deki .xml file kullanımındaki gibi istediğimiz scenario lari kullanacağımız tag parametresi
sayesinde çalıştırabiliriz. Ve plugin parametresi ile raporlar alabiliriz
 */
@RunWith(Cucumber.class)//-->Test çalıştırıcı Notasyon - Cucumber'i Junit ile calistiran Annotation'dir. Ikisi arasindaki Entegrasyonu saglar.
@CucumberOptions(plugin = {"pretty",  // pretty kullaniminda konsolda detayli olarak tüm adimlari rapor halinde görürüz.
                           "html:target/default-cucumber-reports.html",
                           "json:target/json-reports/cucumber.json", // bu 3 cesit rapor verir. json junit dev icin ilki tester icin. Target altinda raporlar.
                           "junit:target/xml-report/cucumber.xml",
                           "rerun:TestOutput/failed_scenario.txt"}, // rerun ile belirttigimiz dosyada fail olan senaryolar tutulur.
        features = "src/test/resources/features", // Features altindaki klasörlere ulasmasi icin Content Root ile yolu alinir.
        glue = {"techproed/stepDefinition","techproed/hooks"},
        tags = "@arc",    // Burda SQL'deki gibi and or ayrimini biliyoruz. and dersen olmaz or olur.
        dryRun = false, // --> true seçersek scenarioları kontrol eder, browser'ı çalıştırmaz
        monochrome = false   // tek renk olarak konsolda gösterir. Kullanimi zorunlu degildir. False yaparsan renkli olur.
)
    /** Asil amac; istedigim senaryolari belirttigim tag'lar ile calistirmaktir. */
public class Runner {
}
/**
@CucumberOptions() notasyonuna parametre olarak
            features--> packege'ın yolunu  // Yolunu alirken Content Root
            glue-->stepdefinition package   // Yolunu alirken Source Root
            tag-->çalıştırmak istediğimiz scenariolari burda belirtiriz. O senaryonun üzerine @techpro yazariz.
    Scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı seçanekleri bu notasyonda
belirtiriz

 @CucumberOptions() notasyonu scenariolarin nerede ve nasil calisacagi, hangi raporu kullanacagi ile alakali secenekleri
 bu notasyonda belirtiriz.

 @CucumberOptions() notasyonu icerisine plugin parametresi ile yukaridaki gibi almak istedigimiz rapor cesidini secip ekleriz.

 pretty --> konsolda calistirdigimiz scenario ile ilgili ayrintili bilgi verir.
 */