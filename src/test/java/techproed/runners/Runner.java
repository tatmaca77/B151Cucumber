package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
Runner class'ı testNG deki .xml file kullanımındaki gibi istediğimiz scenario lari kullanacağımız tag parametresi
sayesinde çalıştırabiliriz. Ve plugin parametresi ile raporlar alabiliriz
 */
@RunWith(Cucumber.class)//-->Test çalıştırıcı Notasyon
@CucumberOptions(features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@tech",    // Burda SQL'deki gibi and or ayrimini biliyoruz. and dersen olmaz or olur.
        dryRun = false //-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
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